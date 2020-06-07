// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The KeyValueElement model. */
@Fluent
public final class KeyValueElement {
    /*
     * The text content of the key or value.
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /*
     * Bounding box of the key or value.
     */
    @JsonProperty(value = "boundingBox")
    private List<Float> boundingBox;

    /*
     * When includeTextDetails is set to true, a list of references to the text
     * elements constituting this key or value.
     */
    @JsonProperty(value = "elements")
    private List<String> elements;

    /**
     * Get the text property: The text content of the key or value.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: The text content of the key or value.
     *
     * @param text the text value to set.
     * @return the KeyValueElement object itself.
     */
    public KeyValueElement setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the boundingBox property: Bounding box of the key or value.
     *
     * @return the boundingBox value.
     */
    public List<Float> getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * Set the boundingBox property: Bounding box of the key or value.
     *
     * @param boundingBox the boundingBox value to set.
     * @return the KeyValueElement object itself.
     */
    public KeyValueElement setBoundingBox(List<Float> boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * Get the elements property: When includeTextDetails is set to true, a list of references to the text elements
     * constituting this key or value.
     *
     * @return the elements value.
     */
    public List<String> getElements() {
        return this.elements;
    }

    /**
     * Set the elements property: When includeTextDetails is set to true, a list of references to the text elements
     * constituting this key or value.
     *
     * @param elements the elements value to set.
     * @return the KeyValueElement object itself.
     */
    public KeyValueElement setElements(List<String> elements) {
        this.elements = elements;
        return this;
    }
}