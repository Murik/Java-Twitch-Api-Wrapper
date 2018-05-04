
package com.urgrue.twitch.api.models;

import com.fasterxml.jackson.annotation.*;
import com.urgrue.twitch.api.models.EmoticonImage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "emoticons"
})
public class EmoticonImages {

    @JsonProperty("emoticons")
    private List<EmoticonImage> emoticons = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public EmoticonImages() {
    }

    /**
     * 
     * @param emoticons
     */
    public EmoticonImages(List<EmoticonImage> emoticons) {
        super();
        this.emoticons = emoticons;
    }

    @JsonProperty("emoticons")
    public List<EmoticonImage> getEmoticons() {
        return emoticons;
    }

    @JsonProperty("emoticons")
    public void setEmoticons(List<EmoticonImage> emoticons) {
        this.emoticons = emoticons;
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
        return new HashCodeBuilder().append(emoticons).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EmoticonImages)) {
            return false;
        }
        EmoticonImages rhs = ((EmoticonImages) other);
        return new EqualsBuilder().append(emoticons, rhs.emoticons).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
