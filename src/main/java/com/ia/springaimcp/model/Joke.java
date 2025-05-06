package com.ia.springaimcp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Joke(
        @JsonProperty("icon_url") String iconUrl,
        String id,
        String url,
        String value) {
}
