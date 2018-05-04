
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
    "_id",
    "bio",
    "created_at",
    "display_name",
    "email",
    "email_verified",
    "logo",
    "name",
    "notifications",
    "partnered",
    "twitter_connected",
    "type",
    "updated_at"
})
public class GetUser {

    @JsonProperty("_id")
    private Integer id;
    @JsonProperty("bio")
    private String bio;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("email_verified")
    private Boolean emailVerified;
    @JsonProperty("logo")
    private String logo;
    @JsonProperty("name")
    private String name;
    @JsonProperty("notifications")
    private Notifications notifications;
    @JsonProperty("partnered")
    private Boolean partnered;
    @JsonProperty("twitter_connected")
    private Boolean twitterConnected;
    @JsonProperty("type")
    private String type;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetUser() {
    }

    /**
     * 
     * @param logo
     * @param type
     * @param emailVerified
     * @param updatedAt
     * @param id
     * @param bio
     * @param email
     * @param notifications
     * @param createdAt
     * @param name
     * @param twitterConnected
     * @param displayName
     * @param partnered
     */
    public GetUser(Integer id, String bio, String createdAt, String displayName, String email, Boolean emailVerified, String logo, String name, Notifications notifications, Boolean partnered, Boolean twitterConnected, String type, String updatedAt) {
        super();
        this.id = id;
        this.bio = bio;
        this.createdAt = createdAt;
        this.displayName = displayName;
        this.email = email;
        this.emailVerified = emailVerified;
        this.logo = logo;
        this.name = name;
        this.notifications = notifications;
        this.partnered = partnered;
        this.twitterConnected = twitterConnected;
        this.type = type;
        this.updatedAt = updatedAt;
    }

    @JsonProperty("_id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("bio")
    public String getBio() {
        return bio;
    }

    @JsonProperty("bio")
    public void setBio(String bio) {
        this.bio = bio;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("email_verified")
    public Boolean getEmailVerified() {
        return emailVerified;
    }

    @JsonProperty("email_verified")
    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    @JsonProperty("logo")
    public String getLogo() {
        return logo;
    }

    @JsonProperty("logo")
    public void setLogo(String logo) {
        this.logo = logo;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("notifications")
    public Notifications getNotifications() {
        return notifications;
    }

    @JsonProperty("notifications")
    public void setNotifications(Notifications notifications) {
        this.notifications = notifications;
    }

    @JsonProperty("partnered")
    public Boolean getPartnered() {
        return partnered;
    }

    @JsonProperty("partnered")
    public void setPartnered(Boolean partnered) {
        this.partnered = partnered;
    }

    @JsonProperty("twitter_connected")
    public Boolean getTwitterConnected() {
        return twitterConnected;
    }

    @JsonProperty("twitter_connected")
    public void setTwitterConnected(Boolean twitterConnected) {
        this.twitterConnected = twitterConnected;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
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
        return new HashCodeBuilder().append(id).append(bio).append(createdAt).append(displayName).append(email).append(emailVerified).append(logo).append(name).append(notifications).append(partnered).append(twitterConnected).append(type).append(updatedAt).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GetUser) == false) {
            return false;
        }
        GetUser rhs = ((GetUser) other);
        return new EqualsBuilder().append(id, rhs.id).append(bio, rhs.bio).append(createdAt, rhs.createdAt).append(displayName, rhs.displayName).append(email, rhs.email).append(emailVerified, rhs.emailVerified).append(logo, rhs.logo).append(name, rhs.name).append(notifications, rhs.notifications).append(partnered, rhs.partnered).append(twitterConnected, rhs.twitterConnected).append(type, rhs.type).append(updatedAt, rhs.updatedAt).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
