
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
    "streams"
})
public class Streams {

    @JsonProperty("_total")
    private Integer total;
    @JsonProperty("streams")
    private List<Stream> streams = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Streams() {
    }

    /**
     * 
     * @param total
     * @param streams
     */
    public Streams(Integer total, List<Stream> streams) {
        super();
        this.total = total;
        this.streams = streams;
    }

    @JsonProperty("_total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("_total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("streams")
    public List<Stream> getStreams() {
        return streams;
    }

    @JsonProperty("streams")
    public void setStreams(List<Stream> streams) {
        this.streams = streams;
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
        return new HashCodeBuilder().append(total).append(streams).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Streams) == false) {
            return false;
        }
        Streams rhs = ((Streams) other);
        return new EqualsBuilder().append(total, rhs.total).append(streams, rhs.streams).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
