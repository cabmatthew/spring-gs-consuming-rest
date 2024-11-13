package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Resource representation class (model) for Values
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Value(Long id, String quote) { }

