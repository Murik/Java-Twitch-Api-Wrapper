
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
    "name",
    "availability",
    "_id",
    "default",
    "url_template"
})
public class Ingest {

    @JsonProperty("name")
    private String name;
    @JsonProperty("availability")
    private Float availability;
    @JsonProperty("_id")
    private Integer id;
    @JsonProperty("default")
    private Boolean _default;
    @JsonProperty("url_template")
    private String urlTemplate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Ingest() {
    }

    /**
     * 
     * @param id
     * @param _default
     * @param name
     * @param urlTemplate
     * @param availability
     */
    public Ingest(String name, Float availability, Integer id, Boolean _default, String urlTemplate) {
        super();
        this.name = name;
        this.availability = availability;
        this.id = id;
        this._default = _default;
        this.urlTemplate = urlTemplate;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("availability")
    public Float getAvailability() {
        return availability;
    }

    @JsonProperty("availability")
    public void setAvailability(Float availability) {
        this.availability = availability;
    }

    @JsonProperty("_id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("default")
    public Boolean getDefault() {
        return _default;
    }

    @JsonProperty("default")
    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    @JsonProperty("url_template")
    public String getUrlTemplate() {
        return urlTemplate;
    }

    @JsonProperty("url_template")
    public void setUrlTemplate(String urlTemplate) {
        this.urlTemplate = urlTemplate;
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
        return new HashCodeBuilder().append(name).append(availability).append(id).append(_default).append(urlTemplate).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ingest) == false) {
            return false;
        }
        Ingest rhs = ((Ingest) other);
        return new EqualsBuilder().append(name, rhs.name).append(availability, rhs.availability).append(id, rhs.id).append(_default, rhs._default).append(urlTemplate, rhs.urlTemplate).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
