package com.urgrue.twitch.api.models;

/**
 * Java-Twitch-Api-Wrapper
 * Created by maxim on 26.09.2017.
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "_id",
        "bio",
        "created_at",
        "display_name",
        "logo",
        "name",
        "type",
        "updated_at"
})
public class FollowUser {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("bio")
    private String bio;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("logo")
    private String logo;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("updated_at")
    private String updatedAt;

    /**
     * No args constructor for use in serialization
     */
    public FollowUser() {
    }

    /**
     * @param id
     * @param bio
     * @param createdAt
     * @param displayName
     * @param logo
     * @param name
     * @param type
     * @param updatedAt
     */
    public FollowUser(String id, String bio, String createdAt, String displayName, String logo, String name, String type, String updatedAt) {
        this.id = id;
        this.bio = bio;
        this.createdAt = createdAt;
        this.displayName = displayName;
        this.logo = logo;
        this.name = name;
        this.type = type;
        this.updatedAt = updatedAt;
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

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
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
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(bio)
                .append(createdAt)
                .append(displayName)
                .append(logo)
                .append(name)
                .append(type)
                .append(updatedAt)
                .toHashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        FollowUser that = (FollowUser) o;

        return new EqualsBuilder()
                .append(id, that.id)
                .append(bio, that.bio)
                .append(createdAt, that.createdAt)
                .append(displayName, that.displayName)
                .append(logo, that.logo)
                .append(name, that.name)
                .append(type, that.type)
                .append(updatedAt, that.updatedAt)
                .isEquals();
    }
}
