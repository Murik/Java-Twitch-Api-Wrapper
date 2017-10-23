package com.mb3364.twitch.api.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Java-Twitch-Api-Wrapper
 *
 * @author Maxim Kulikov
 * @since 23.10.2017
 */
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
public class UserOnChannel {
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

    public UserOnChannel() {
    }

    public UserOnChannel(String id, String bio, String createdAt, String displayName, String logo, String name, String type, String updatedAt) {
        this.id = id;
        this.bio = bio;
        this.createdAt = createdAt;
        this.displayName = displayName;
        this.logo = logo;
        this.name = name;
        this.type = type;
        this.updatedAt = updatedAt;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .toHashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof UserOnChannel)) return false;

        UserOnChannel that = (UserOnChannel) o;

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
