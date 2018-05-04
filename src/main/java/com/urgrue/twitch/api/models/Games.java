
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
import com.urgrue.twitch.api.models.Top;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_total",
    "top"
})
public class Games {

    @JsonProperty("_total")
    private Integer total;
    @JsonProperty("top")
    private List<Top> top = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Games() {
    }

    /**
     * 
     * @param total
     * @param top
     */
    public Games(Integer total, List<Top> top) {
        super();
        this.total = total;
        this.top = top;
    }

    @JsonProperty("_total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("_total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("top")
    public List<Top> getTop() {
        return top;
    }

    @JsonProperty("top")
    public void setTop(List<Top> top) {
        this.top = top;
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
        return new HashCodeBuilder().append(total).append(top).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Games) == false) {
            return false;
        }
        Games rhs = ((Games) other);
        return new EqualsBuilder().append(total, rhs.total).append(top, rhs.top).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
