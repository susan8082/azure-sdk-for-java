/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2020_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a resource Id to source Key Vault.
 */
public class KeyVaultKeyReferenceSourceVault {
    /**
     * Resource Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get resource Id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource Id.
     *
     * @param id the id value to set
     * @return the KeyVaultKeyReferenceSourceVault object itself.
     */
    public KeyVaultKeyReferenceSourceVault withId(String id) {
        this.id = id;
        return this;
    }

}