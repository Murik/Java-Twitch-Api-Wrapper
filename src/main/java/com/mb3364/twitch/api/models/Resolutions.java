
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
    "mobile"
})
public class Resolutions {

    @JsonProperty("chunked")
    private String chunked;
    @JsonProperty("high")
    private String high;
    @JsonProperty("low")
    private String low;
    @JsonProperty("medium")
    private String medium;
    @JsonProperty("mobile")
    private String mobile;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Resolutions() {
    }

    /**
     * 
     * @param chunked
     * @param high
     * @param low
     * @param medium
     * @param mobile
     */
    public Resolutions(String chunked, String high, String low, String medium, String mobile) {
        super();
        this.chunked = chunked;
        this.high = high;
        this.low = low;
        this.medium = medium;
        this.mobile = mobile;
    }

    @JsonProperty("chunked")
    public String getChunked() {
        return chunked;
    }

    @JsonProperty("chunked")
    public void setChunked(String chunked) {
        this.chunked = chunked;
    }

    @JsonProperty("high")
    public String getHigh() {
        return high;
    }

    @JsonProperty("high")
    public void setHigh(String high) {
        this.high = high;
    }

    @JsonProperty("low")
    public String getLow() {
        return low;
    }

    @JsonProperty("low")
    public void setLow(String low) {
        this.low = low;
    }

    @JsonProperty("medium")
    public String getMedium() {
        return medium;
    }

    @JsonProperty("medium")
    public void setMedium(String medium) {
        this.medium = medium;
    }

    @JsonProperty("mobile")
    public String getMobile() {
        return mobile;
    }

    @JsonProperty("mobile")
    public void setMobile(String mobile) {
        this.mobile = mobile;
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
        return new HashCodeBuilder().append(chunked).append(high).append(low).append(medium).append(mobile).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Resolutions) == false) {
            return false;
        }
        Resolutions rhs = ((Resolutions) other);
        return new EqualsBuilder().append(chunked, rhs.chunked).append(high, rhs.high).append(low, rhs.low).append(medium, rhs.medium).append(mobile, rhs.mobile).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
