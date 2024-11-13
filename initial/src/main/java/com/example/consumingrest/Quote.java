package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Resource representation class (model/domain class) for Quotes
 * 
 * Any properties that aren't bound should be ignored
 * 
 * Binding data to custom types: need to specify var name, exact same as key in JSON doc
 * If var name and key in JSON don't match, can use @JsonProperty to specify exact key
 * Don't need here, since they match
 * 
 * Need an additional class to embed the inner quotation. Next define Value.java
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Quote(String type, Value value) { }
