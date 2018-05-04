
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
    "ingests"
})
public class Ingests {

    @JsonProperty("ingests")
    private List<Ingest> ingests = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Ingests() {
    }

    /**
     * 
     * @param ingests
     */
    public Ingests(List<Ingest> ingests) {
        super();
        this.ingests = ingests;
    }

    @JsonProperty("ingests")
    public List<Ingest> getIngests() {
        return ingests;
    }

    @JsonProperty("ingests")
    public void setIngests(List<Ingest> ingests) {
        this.ingests = ingests;
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
        return new HashCodeBuilder().append(ingests).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ingests) == false) {
            return false;
        }
        Ingests rhs = ((Ingests) other);
        return new EqualsBuilder().append(ingests, rhs.ingests).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
