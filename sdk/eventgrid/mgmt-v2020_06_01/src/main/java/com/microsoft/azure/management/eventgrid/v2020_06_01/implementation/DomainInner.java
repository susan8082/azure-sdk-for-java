/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_06_01.implementation;

import java.util.List;
import com.microsoft.azure.management.eventgrid.v2020_06_01.DomainProvisioningState;
import com.microsoft.azure.management.eventgrid.v2020_06_01.InputSchema;
import com.microsoft.azure.management.eventgrid.v2020_06_01.InputSchemaMapping;
import com.microsoft.azure.management.eventgrid.v2020_06_01.PublicNetworkAccess;
import com.microsoft.azure.management.eventgrid.v2020_06_01.InboundIpRule;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * EventGrid Domain.
 */
@JsonFlatten
public class DomainInner extends Resource {
    /**
     * List of private endpoint connections.
     */
    @JsonProperty(value = "properties.privateEndpointConnections")
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /**
     * Provisioning state of the domain. Possible values include: 'Creating',
     * 'Updating', 'Deleting', 'Succeeded', 'Canceled', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private DomainProvisioningState provisioningState;

    /**
     * Endpoint for the domain.
     */
    @JsonProperty(value = "properties.endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /**
     * This determines the format that Event Grid should expect for incoming
     * events published to the domain. Possible values include:
     * 'EventGridSchema', 'CustomEventSchema', 'CloudEventSchemaV1_0'.
     */
    @JsonProperty(value = "properties.inputSchema")
    private InputSchema inputSchema;

    /**
     * Information about the InputSchemaMapping which specified the info about
     * mapping event payload.
     */
    @JsonProperty(value = "properties.inputSchemaMapping")
    private InputSchemaMapping inputSchemaMapping;

    /**
     * Metric resource id for the domain.
     */
    @JsonProperty(value = "properties.metricResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String metricResourceId;

    /**
     * This determines if traffic is allowed over public network. By default it
     * is enabled.
     * You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules"
     * /&gt;. Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /**
     * This can be used to restrict traffic from specific IPs instead of all
     * IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     */
    @JsonProperty(value = "properties.inboundIpRules")
    private List<InboundIpRule> inboundIpRules;

    /**
     * Get list of private endpoint connections.
     *
     * @return the privateEndpointConnections value
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Set list of private endpoint connections.
     *
     * @param privateEndpointConnections the privateEndpointConnections value to set
     * @return the DomainInner object itself.
     */
    public DomainInner withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.privateEndpointConnections = privateEndpointConnections;
        return this;
    }

    /**
     * Get provisioning state of the domain. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Canceled', 'Failed'.
     *
     * @return the provisioningState value
     */
    public DomainProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get endpoint for the domain.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Get this determines the format that Event Grid should expect for incoming events published to the domain. Possible values include: 'EventGridSchema', 'CustomEventSchema', 'CloudEventSchemaV1_0'.
     *
     * @return the inputSchema value
     */
    public InputSchema inputSchema() {
        return this.inputSchema;
    }

    /**
     * Set this determines the format that Event Grid should expect for incoming events published to the domain. Possible values include: 'EventGridSchema', 'CustomEventSchema', 'CloudEventSchemaV1_0'.
     *
     * @param inputSchema the inputSchema value to set
     * @return the DomainInner object itself.
     */
    public DomainInner withInputSchema(InputSchema inputSchema) {
        this.inputSchema = inputSchema;
        return this;
    }

    /**
     * Get information about the InputSchemaMapping which specified the info about mapping event payload.
     *
     * @return the inputSchemaMapping value
     */
    public InputSchemaMapping inputSchemaMapping() {
        return this.inputSchemaMapping;
    }

    /**
     * Set information about the InputSchemaMapping which specified the info about mapping event payload.
     *
     * @param inputSchemaMapping the inputSchemaMapping value to set
     * @return the DomainInner object itself.
     */
    public DomainInner withInputSchemaMapping(InputSchemaMapping inputSchemaMapping) {
        this.inputSchemaMapping = inputSchemaMapping;
        return this;
    }

    /**
     * Get metric resource id for the domain.
     *
     * @return the metricResourceId value
     */
    public String metricResourceId() {
        return this.metricResourceId;
    }

    /**
     * Get this determines if traffic is allowed over public network. By default it is enabled.
     You can further restrict to specific IPs by configuring &lt;seealso cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules" /&gt;. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the publicNetworkAccess value
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set this determines if traffic is allowed over public network. By default it is enabled.
     You can further restrict to specific IPs by configuring &lt;seealso cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules" /&gt;. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set
     * @return the DomainInner object itself.
     */
    public DomainInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get this can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     *
     * @return the inboundIpRules value
     */
    public List<InboundIpRule> inboundIpRules() {
        return this.inboundIpRules;
    }

    /**
     * Set this can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     *
     * @param inboundIpRules the inboundIpRules value to set
     * @return the DomainInner object itself.
     */
    public DomainInner withInboundIpRules(List<InboundIpRule> inboundIpRules) {
        this.inboundIpRules = inboundIpRules;
        return this;
    }

}