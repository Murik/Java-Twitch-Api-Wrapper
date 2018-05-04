
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
    "alpha",
    "image",
    "svg"
})
public class Staff {

    @JsonProperty("alpha")
    private String alpha;
    @JsonProperty("image")
    private String image;
    @JsonProperty("svg")
    private String svg;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Staff() {
    }

    /**
     * 
     * @param svg
     * @param alpha
     * @param image
     */
    public Staff(String alpha, String image, String svg) {
        super();
        this.alpha = alpha;
        this.image = image;
        this.svg = svg;
    }

    @JsonProperty("alpha")
    public String getAlpha() {
        return alpha;
    }

    @JsonProperty("alpha")
    public void setAlpha(String alpha) {
        this.alpha = alpha;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("svg")
    public String getSvg() {
        return svg;
    }

    @JsonProperty("svg")
    public void setSvg(String svg) {
        this.svg = svg;
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
        return new HashCodeBuilder().append(alpha).append(image).append(svg).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Staff) == false) {
            return false;
        }
        Staff rhs = ((Staff) other);
        return new EqualsBuilder().append(alpha, rhs.alpha).append(image, rhs.image).append(svg, rhs.svg).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
