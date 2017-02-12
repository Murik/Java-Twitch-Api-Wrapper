
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
    "_cursor",
    "_total",
    "follows"
})
public class ChannelFollows {

    @JsonProperty("_cursor")
    private String cursor;
    @JsonProperty("_total")
    private Integer total;
    @JsonProperty("follows")
    private List<Follow> follows = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ChannelFollows() {
    }

    /**
     * 
     * @param follows
     * @param total
     * @param cursor
     */
    public ChannelFollows(String cursor, Integer total, List<Follow> follows) {
        super();
        this.cursor = cursor;
        this.total = total;
        this.follows = follows;
    }

    @JsonProperty("_cursor")
    public String getCursor() {
        return cursor;
    }

    @JsonProperty("_cursor")
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    @JsonProperty("_total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("_total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("follows")
    public List<Follow> getFollows() {
        return follows;
    }

    @JsonProperty("follows")
    public void setFollows(List<Follow> follows) {
        this.follows = follows;
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
        return new HashCodeBuilder().append(cursor).append(total).append(follows).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelFollows) == false) {
            return false;
        }
        ChannelFollows rhs = ((ChannelFollows) other);
        return new EqualsBuilder().append(cursor, rhs.cursor).append(total, rhs.total).append(follows, rhs.follows).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
