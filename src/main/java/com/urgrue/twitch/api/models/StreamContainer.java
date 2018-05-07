package com.urgrue.twitch.api.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StreamContainer {

    @JsonProperty("stream")
    private Stream stream;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonProperty("stream")
    public Stream getStream() {
        return stream;
    }

    @JsonProperty("stream")
    public void setStream(Stream stream) {
        this.stream = stream;
    }
}
