
package com.urgrue.twitch.api.models;

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
    "vods"
})
public class VideosTop {

    @JsonProperty("vods")
    private List<Vod> vods = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public VideosTop() {
    }

    /**
     * 
     * @param vods
     */
    public VideosTop(List<Vod> vods) {
        super();
        this.vods = vods;
    }

    @JsonProperty("vods")
    public List<Vod> getVods() {
        return vods;
    }

    @JsonProperty("vods")
    public void setVods(List<Vod> vods) {
        this.vods = vods;
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
        return new HashCodeBuilder().append(vods).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VideosTop) == false) {
            return false;
        }
        VideosTop rhs = ((VideosTop) other);
        return new EqualsBuilder().append(vods, rhs.vods).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
