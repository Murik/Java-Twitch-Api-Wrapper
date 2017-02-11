package com.mb3364.twitch.api.models;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "channels",
        "viewers"
})
public class StreamsSummary {

    @JsonProperty("channels")
    private Integer channels;
    @JsonProperty("viewers")
    private Integer viewers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public StreamsSummary() {
    }

    /**
     *
     * @param viewers
     * @param channels
     */
    public StreamsSummary(Integer channels, Integer viewers) {
        super();
        this.channels = channels;
        this.viewers = viewers;
    }

    @JsonProperty("channels")
    public Integer getChannels() {
        return channels;
    }

    @JsonProperty("channels")
    public void setChannels(Integer channels) {
        this.channels = channels;
    }

    @JsonProperty("viewers")
    public Integer getViewers() {
        return viewers;
    }

    @JsonProperty("viewers")
    public void setViewers(Integer viewers) {
        this.viewers = viewers;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(channels).append(viewers).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamsSummary)) {
            return false;
        }
        StreamsSummary rhs = ((StreamsSummary) other);
        return new EqualsBuilder().append(channels, rhs.channels).append(viewers, rhs.viewers).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}