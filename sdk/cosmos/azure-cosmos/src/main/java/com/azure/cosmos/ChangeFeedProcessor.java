// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos;

import reactor.core.publisher.Mono;
import java.util.Map;

/**
 * Simple host for distributing change feed events across observers, simplifying the process of reading the change feeds
 *   and distributing the processing events across multiple consumers effectively.
 * <p>
 * There are four main components of implementing the change feed processor:
 *  - The monitored container: the monitored container has the data from which the change feed is generated. Any inserts
 *    and updates to the monitored container are reflected in the change feed of the container.
 *  - The lease container: the lease container acts as a state storage and coordinates processing the change feed across
 *    multiple workers. The lease container can be stored in the same account as the monitored container or in a
 *    separate account.
 *  - The host: a host is an application instance that uses the change feed processor to listen for changes. Multiple
 *    instances with the same lease configuration can run in parallel, but each instance should have a different
 *    instance name.
 *  - The delegate: the delegate is the code that defines what you, the developer, want to do with each batch of
 *    changes that the change feed processor reads.
 * <p>
 * {@code
 * ChangeFeedProcessor changeFeedProcessor = new ChangeFeedProcessorBuilder()
 *     .hostName(hostName)
 *     .feedContainer(feedContainer)
 *     .leaseContainer(leaseContainer)
 *     .handleChanges(docs -> {
 *         for (JsonNode item : docs) {
 *             // Implementation for handling and processing of each JsonNode item goes here
 *         }
 *     })
 *     .buildChangeFeedProcessor();
 * }
 */
public interface ChangeFeedProcessor {

    /**
     * Start listening for changes asynchronously.
     *
     * @return a representation of the deferred computation of this call.
     */
    Mono<Void> start();

    /**
     * Stops listening for changes asynchronously.
     *
     * @return a representation of the deferred computation of this call.
     */
    Mono<Void> stop();

    /**
     * Returns the state of the change feed processor.
     *
     * @return true if the change feed processor is currently active and running.
     */
    boolean isStarted();

    /**
     * Returns the current owner (host) and an approximation of the difference between the last processed item (defined
     *   by the state of the feed container) and the latest change in the container for each partition (lease
     *   item).
     * <p>
     * An empty map will be returned if the processor was not started or no lease items matching the current
     *   {@link ChangeFeedProcessor} instance's lease prefix could be found.
     *
     * @return a map representing the current owner and lease token, the current LSN and latest LSN, and the estimated
     *         lag, asynchronously.
     */
    Mono<Map<String, Integer>> getEstimatedLag();
}