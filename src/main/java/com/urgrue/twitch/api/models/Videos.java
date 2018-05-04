
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
    "_total",
    "videos"
})
public class Videos {

    @JsonProperty("_total")
    private Integer total;
    @JsonProperty("videos")
    private List<Video> videos = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Videos() {
    }

    /**
     * 
     * @param total
     * @param videos
     */
    public Videos(Integer total, List<Video> videos) {
        super();
        this.total = total;
        this.videos = videos;
    }

    @JsonProperty("_total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("_total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("videos")
    public List<Video> getVideos() {
        return videos;
    }

    @JsonProperty("videos")
    public void setVideos(List<Video> videos) {
        this.videos = videos;
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
        return new HashCodeBuilder().append(total).append(videos).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Videos) == false) {
            return false;
        }
        Videos rhs = ((Videos) other);
        return new EqualsBuilder().append(total, rhs.total).append(videos, rhs.videos).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
