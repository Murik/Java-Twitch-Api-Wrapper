package com.mb3364.twitch.api.models;

/**
 * Java-Twitch-Api-Wrapper
 * Created by maxim on 26.09.2017.
 */


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
        "created_at",
        "notifications",
        "channel"
})
public class FollowUsers {

    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("notifications")
    private Boolean notifications;
    @JsonProperty("user")
    private FollowUser user;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public FollowUsers() {
    }

    /**
     * @param notifications
     * @param createdAt
     * @param user
     */
    public FollowUsers(String createdAt, Boolean notifications, FollowUser user) {
        super();
        this.createdAt = createdAt;
        this.notifications = notifications;
        this.user = user;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonProperty("channel")
    public FollowUser getUser() {
        return user;
    }

    @JsonProperty("channel")
    public void setUser(FollowUser user) {
        this.user = user;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("notifications")
    public Boolean getNotifications() {
        return notifications;
    }

    @JsonProperty("notifications")
    public void setNotifications(Boolean notifications) {
        this.notifications = notifications;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(createdAt).append(notifications).append(user).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FollowUsers) == false) {
            return false;
        }
        FollowUsers rhs = ((FollowUsers) other);
        return new EqualsBuilder().append(createdAt, rhs.createdAt).append(notifications, rhs.notifications).append(user, rhs.user).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
