
package com.mb3364.twitch.api.models;

import java.util.HashMap;
import java.util.List;
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
    "_links",
    "emoticons"
})
public class Emoticons {

    @JsonProperty("_links")
    private Links links;
    @JsonProperty("emoticons")
    private List<Emoticon> emoticons = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Emoticons() {
    }

    /**
     * 
     * @param links
     * @param emoticons
     */
    public Emoticons(Links links, List<Emoticon> emoticons) {
        super();
        this.links = links;
        this.emoticons = emoticons;
    }

    @JsonProperty("_links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonProperty("emoticons")
    public List<Emoticon> getEmoticons() {
        return emoticons;
    }

    @JsonProperty("emoticons")
    public void setEmoticons(List<Emoticon> emoticons) {
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
        return new HashCodeBuilder().append(links).append(emoticons).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Emoticons) == false) {
            return false;
        }
        Emoticons rhs = ((Emoticons) other);
        return new EqualsBuilder().append(links, rhs.links).append(emoticons, rhs.emoticons).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
