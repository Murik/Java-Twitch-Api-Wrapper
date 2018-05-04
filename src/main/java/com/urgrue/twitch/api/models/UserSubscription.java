
package com.urgrue.twitch.api.models;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_id",
    "channel",
    "created_at"
})
public class UserSubscription {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("channel")
    private Channel channel;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public UserSubscription() {
    }

    /**
     * 
     * @param id
     * @param createdAt
     * @param channel
     */
    public UserSubscription(String id, Channel channel, String createdAt) {
        super();
        this.id = id;
        this.channel = channel;
        this.createdAt = createdAt;
    }

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("channel")
    public Channel getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
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
        return new HashCodeBuilder().append(id).append(channel).append(createdAt).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UserSubscription)) {
            return false;
        }
        UserSubscription rhs = ((UserSubscription) other);
        return new EqualsBuilder().append(id, rhs.id).append(channel, rhs.channel).append(createdAt, rhs.createdAt)
                .append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
