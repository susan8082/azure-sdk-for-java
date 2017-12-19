/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.keyvault.models;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DeletionRecoveryLevel.
 */
public final class DeletionRecoveryLevel {
    /** Static value Purgeable for DeletionRecoveryLevel. */
    public static final DeletionRecoveryLevel PURGEABLE = new DeletionRecoveryLevel("Purgeable");

    /** Static value Recoverable+Purgeable for DeletionRecoveryLevel. */
    public static final DeletionRecoveryLevel RECOVERABLE_PURGEABLE = new DeletionRecoveryLevel("Recoverable+Purgeable");

    /** Static value Recoverable for DeletionRecoveryLevel. */
    public static final DeletionRecoveryLevel RECOVERABLE = new DeletionRecoveryLevel("Recoverable");

    /** Static value Recoverable+ProtectedSubscription for DeletionRecoveryLevel. */
    public static final DeletionRecoveryLevel RECOVERABLE_PROTECTED_SUBSCRIPTION = new DeletionRecoveryLevel("Recoverable+ProtectedSubscription");

    private String value;

    /**
     * Creates a custom value for DeletionRecoveryLevel.
     * @param value the custom value
     */
    public DeletionRecoveryLevel(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DeletionRecoveryLevel)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        DeletionRecoveryLevel rhs = (DeletionRecoveryLevel) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
