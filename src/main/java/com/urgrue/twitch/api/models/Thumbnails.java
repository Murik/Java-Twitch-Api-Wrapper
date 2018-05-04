
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
    "small",
    "medium",
    "large",
    "template"
})
public class Thumbnails {

    @JsonProperty("small")
    private List<Small> small = null;
    @JsonProperty("medium")
    private List<Medium> medium = null;
    @JsonProperty("large")
    private List<Large> large = null;
    @JsonProperty("template")
    private List<Template> template = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Thumbnails() {
    }

    /**
     * 
     * @param template
     * @param small
     * @param large
     * @param medium
     */
    public Thumbnails(List<Small> small, List<Medium> medium, List<Large> large, List<Template> template) {
        super();
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.template = template;
    }

    @JsonProperty("small")
    public List<Small> getSmall() {
        return small;
    }

    @JsonProperty("small")
    public void setSmall(List<Small> small) {
        this.small = small;
    }

    @JsonProperty("medium")
    public List<Medium> getMedium() {
        return medium;
    }

    @JsonProperty("medium")
    public void setMedium(List<Medium> medium) {
        this.medium = medium;
    }

    @JsonProperty("large")
    public List<Large> getLarge() {
        return large;
    }

    @JsonProperty("large")
    public void setLarge(List<Large> large) {
        this.large = large;
    }

    @JsonProperty("template")
    public List<Template> getTemplate() {
        return template;
    }

    @JsonProperty("template")
    public void setTemplate(List<Template> template) {
        this.template = template;
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
        return new HashCodeBuilder().append(small).append(medium).append(large).append(template).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Thumbnails) == false) {
            return false;
        }
        Thumbnails rhs = ((Thumbnails) other);
        return new EqualsBuilder().append(small, rhs.small).append(medium, rhs.medium).append(large, rhs.large).append(template, rhs.template).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
