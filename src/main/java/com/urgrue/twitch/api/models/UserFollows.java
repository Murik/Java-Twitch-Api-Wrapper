
package com.urgrue.twitch.api.models;

import com.fasterxml.jackson.annotation.*;
import com.urgrue.twitch.api.models.Follow;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "follows",
    "_total"
})
public class UserFollows {

    @JsonProperty("follows")
    private List<Follow> follows = null;
    @JsonProperty("_total")
    private Integer total;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public UserFollows() {
    }

    /**
     * 
     * @param total
     * @param follows
     */
    public UserFollows(List<Follow> follows, Integer total) {
        super();
        this.follows = follows;
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

    @JsonProperty("_total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("_total")
    public void setTotal(Integer total) {
        this.total = total;
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
        return new HashCodeBuilder().append(follows).append(total).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UserFollows)) {
            return false;
        }
        UserFollows rhs = ((UserFollows) other);
        return new EqualsBuilder().append(follows, rhs.follows).append(total, rhs.total)
                .append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
