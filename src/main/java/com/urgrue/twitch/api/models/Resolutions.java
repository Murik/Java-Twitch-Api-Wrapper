
package com.urgrue.twitch.api.models;

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
    "1080p",
    "144p",
    "240p",
    "360p",
    "480p",
    "720p"
})
public class Resolutions {

    @JsonProperty("1080p")
    private String _1080p;
    @JsonProperty("144p")
    private String _144p;
    @JsonProperty("240p")
    private String _240p;
    @JsonProperty("360p")
    private String _360p;
    @JsonProperty("480p")
    private String _480p;
    @JsonProperty("720p")
    private String _720p;
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
     * @param _1080p
     * @param _720p
     * @param _144p
     * @param _480p
     * @param _360p
     * @param _240p
     */
    public Resolutions(String _1080p, String _144p, String _240p, String _360p, String _480p, String _720p) {
        super();
        this._1080p = _1080p;
        this._144p = _144p;
        this._240p = _240p;
        this._360p = _360p;
        this._480p = _480p;
        this._720p = _720p;
    }

    @JsonProperty("1080p")
    public String get1080p() {
        return _1080p;
    }

    @JsonProperty("1080p")
    public void set1080p(String _1080p) {
        this._1080p = _1080p;
    }

    @JsonProperty("144p")
    public String get144p() {
        return _144p;
    }

    @JsonProperty("144p")
    public void set144p(String _144p) {
        this._144p = _144p;
    }

    @JsonProperty("240p")
    public String get240p() {
        return _240p;
    }

    @JsonProperty("240p")
    public void set240p(String _240p) {
        this._240p = _240p;
    }

    @JsonProperty("360p")
    public String get360p() {
        return _360p;
    }

    @JsonProperty("360p")
    public void set360p(String _360p) {
        this._360p = _360p;
    }

    @JsonProperty("480p")
    public String get480p() {
        return _480p;
    }

    @JsonProperty("480p")
    public void set480p(String _480p) {
        this._480p = _480p;
    }

    @JsonProperty("720p")
    public String get720p() {
        return _720p;
    }

    @JsonProperty("720p")
    public void set720p(String _720p) {
        this._720p = _720p;
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
        return new HashCodeBuilder().append(_1080p).append(_144p).append(_240p).append(_360p).append(_480p).append(_720p).append(additionalProperties).toHashCode();
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
        return new EqualsBuilder().append(_1080p, rhs._1080p).append(_144p, rhs._144p).append(_240p, rhs._240p).append(_360p, rhs._360p).append(_480p, rhs._480p).append(_720p, rhs._720p).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
