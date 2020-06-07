// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The MetricNamespaceCollection model. */
@Fluent
public final class MetricNamespaceCollectionInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetricNamespaceCollectionInner.class);

    /*
     * The values for the metric namespaces.
     */
    @JsonProperty(value = "value", required = true)
    private List<MetricNamespaceInner> value;

    /**
     * Get the value property: The values for the metric namespaces.
     *
     * @return the value value.
     */
    public List<MetricNamespaceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The values for the metric namespaces.
     *
     * @param value the value value to set.
     * @return the MetricNamespaceCollectionInner object itself.
     */
    public MetricNamespaceCollectionInner withValue(List<MetricNamespaceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model MetricNamespaceCollectionInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}