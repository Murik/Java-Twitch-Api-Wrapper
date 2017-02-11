
package com.mb3364.twitch.api.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "chunked",
    "high",
    "low",
    "medium",
    "mobile",
    "audio_only"
})
public class Fps {

    @JsonProperty("chunked")
    private Float chunked;
    @JsonProperty("high")
    private Float high;
    @JsonProperty("low")
    private Float low;
    @JsonProperty("medium")
    private Float medium;
    @JsonProperty("mobile")
    private Float mobile;
    @JsonProperty("audio_only")
    private Integer audioOnly;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fps() {
    }

    /**
     * 
     * @param chunked
     * @param high
     * @param low
     * @param audioOnly
     * @param medium
     * @param mobile
     */
    public Fps(Float chunked, Float high, Float low, Float medium, Float mobile, Integer audioOnly) {
        super();
        this.chunked = chunked;
        this.high = high;
        this.low = low;
        this.medium = medium;
        this.mobile = mobile;
        this.audioOnly = audioOnly;
    }

    @JsonProperty("chunked")
    public Float getChunked() {
        return chunked;
    }

    @JsonProperty("chunked")
    public void setChunked(Float chunked) {
        this.chunked = chunked;
    }

    @JsonProperty("high")
    public Float getHigh() {
        return high;
    }

    @JsonProperty("high")
    public void setHigh(Float high) {
        this.high = high;
    }

    @JsonProperty("low")
    public Float getLow() {
        return low;
    }

    @JsonProperty("low")
    public void setLow(Float low) {
        this.low = low;
    }

    @JsonProperty("medium")
    public Float getMedium() {
        return medium;
    }

    @JsonProperty("medium")
    public void setMedium(Float medium) {
        this.medium = medium;
    }

    @JsonProperty("mobile")
    public Float getMobile() {
        return mobile;
    }

    @JsonProperty("mobile")
    public void setMobile(Float mobile) {
        this.mobile = mobile;
    }

    @JsonProperty("audio_only")
    public Integer getAudioOnly() {
        return audioOnly;
    }

    @JsonProperty("audio_only")
    public void setAudioOnly(Integer audioOnly) {
        this.audioOnly = audioOnly;
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
        return new HashCodeBuilder().append(chunked).append(high).append(low).append(medium).append(mobile).append(audioOnly).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fps) == false) {
            return false;
        }
        Fps rhs = ((Fps) other);
        return new EqualsBuilder().append(chunked, rhs.chunked).append(high, rhs.high).append(low, rhs.low).append(medium, rhs.medium).append(mobile, rhs.mobile).append(audioOnly, rhs.audioOnly).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
