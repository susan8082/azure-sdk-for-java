/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.v2019_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata of IoT device/IoT Edge device to be configured.
 */
public class IoTDeviceInfo {
    /**
     * ID of the IoT device/edge device.
     */
    @JsonProperty(value = "deviceId", required = true)
    private String deviceId;

    /**
     * Host name for the IoT hub associated to the device.
     */
    @JsonProperty(value = "ioTHostHub", required = true)
    private String ioTHostHub;

    /**
     * IoT device authentication info.
     */
    @JsonProperty(value = "authentication")
    private Authentication authentication;

    /**
     * Get iD of the IoT device/edge device.
     *
     * @return the deviceId value
     */
    public String deviceId() {
        return this.deviceId;
    }

    /**
     * Set iD of the IoT device/edge device.
     *
     * @param deviceId the deviceId value to set
     * @return the IoTDeviceInfo object itself.
     */
    public IoTDeviceInfo withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get host name for the IoT hub associated to the device.
     *
     * @return the ioTHostHub value
     */
    public String ioTHostHub() {
        return this.ioTHostHub;
    }

    /**
     * Set host name for the IoT hub associated to the device.
     *
     * @param ioTHostHub the ioTHostHub value to set
     * @return the IoTDeviceInfo object itself.
     */
    public IoTDeviceInfo withIoTHostHub(String ioTHostHub) {
        this.ioTHostHub = ioTHostHub;
        return this;
    }

    /**
     * Get ioT device authentication info.
     *
     * @return the authentication value
     */
    public Authentication authentication() {
        return this.authentication;
    }

    /**
     * Set ioT device authentication info.
     *
     * @param authentication the authentication value to set
     * @return the IoTDeviceInfo object itself.
     */
    public IoTDeviceInfo withAuthentication(Authentication authentication) {
        this.authentication = authentication;
        return this;
    }

}
