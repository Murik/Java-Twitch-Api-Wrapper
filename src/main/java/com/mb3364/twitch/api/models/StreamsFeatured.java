
package com.mb3364.twitch.api.models;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "featured"
})
public class StreamsFeatured {

    @JsonProperty("featured")
    private List<Featured> featured = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public StreamsFeatured() {
    }

    /**
     * 
     * @param featured
     */
    public StreamsFeatured(List<Featured> featured) {
        super();
        this.featured = featured;
    }

    @JsonProperty("featured")
    public List<Featured> getFeatured() {
        return featured;
    }

    @JsonProperty("featured")
    public void setFeatured(List<Featured> featured) {
        this.featured = featured;
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
        return new HashCodeBuilder().append(featured).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamsFeatured)) {
            return false;
        }
        StreamsFeatured rhs = ((StreamsFeatured) other);
        return new EqualsBuilder().append(featured, rhs.featured).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
