package com.mb3364.twitch.api.models;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "_id",
        "broadcaster_language",
        "created_at",
        "display_name",
        "email",
        "followers",
        "game",
        "language",
        "logo",
        "mature",
        "name",
        "partner",
        "profile_banner",
        "profile_banner_background_color",
        "status",
        "stream_key",
        "updated_at",
        "url",
        "video_banner",
        "views"
})
public class Channel {

    @JsonProperty("_id")
    private Integer id;
    @JsonProperty("broadcaster_language")
    private String broadcasterLanguage;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("followers")
    private Integer followers;
    @JsonProperty("game")
    private String game;
    @JsonProperty("language")
    private String language;
    @JsonProperty("logo")
    private String logo;
    @JsonProperty("mature")
    private Boolean mature;
    @JsonProperty("name")
    private String name;
    @JsonProperty("partner")
    private Boolean partner;
    @JsonProperty("profile_banner")
    private Object profileBanner;
    @JsonProperty("profile_banner_background_color")
    private Object profileBannerBackgroundColor;
    @JsonProperty("status")
    private String status;
    @JsonProperty("stream_key")
    private String streamKey;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("url")
    private String url;
    @JsonProperty("video_banner")
    private Object videoBanner;
    @JsonProperty("views")
    private Integer views;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Channel() {
    }

    /**
     *
     * @param logo
     * @param status
     * @param profileBanner
     * @param streamKey
     * @param game
     * @param url
     * @param videoBanner
     * @param updatedAt
     * @param id
     * @param followers
     * @param email
     * @param views
     * @param createdAt
     * @param mature
     * @param name
     * @param partner
     * @param language
     * @param displayName
     * @param broadcasterLanguage
     * @param profileBannerBackgroundColor
     */
    public Channel(Integer id, String broadcasterLanguage, String createdAt, String displayName, String email, Integer followers, String game, String language, String logo, Boolean mature, String name, Boolean partner, Object profileBanner, Object profileBannerBackgroundColor, String status, String streamKey, String updatedAt, String url, Object videoBanner, Integer views) {
        super();
        this.id = id;
        this.broadcasterLanguage = broadcasterLanguage;
        this.createdAt = createdAt;
        this.displayName = displayName;
        this.email = email;
        this.followers = followers;
        this.game = game;
        this.language = language;
        this.logo = logo;
        this.mature = mature;
        this.name = name;
        this.partner = partner;
        this.profileBanner = profileBanner;
        this.profileBannerBackgroundColor = profileBannerBackgroundColor;
        this.status = status;
        this.streamKey = streamKey;
        this.updatedAt = updatedAt;
        this.url = url;
        this.videoBanner = videoBanner;
        this.views = views;
    }

    @JsonProperty("_id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("broadcaster_language")
    public String getBroadcasterLanguage() {
        return broadcasterLanguage;
    }

    @JsonProperty("broadcaster_language")
    public void setBroadcasterLanguage(String broadcasterLanguage) {
        this.broadcasterLanguage = broadcasterLanguage;
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

    @JsonProperty("followers")
    public Integer getFollowers() {
        return followers;
    }

    @JsonProperty("followers")
    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    @JsonProperty("game")
    public String getGame() {
        return game;
    }

    @JsonProperty("game")
    public void setGame(String game) {
        this.game = game;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("logo")
    public String getLogo() {
        return logo;
    }

    @JsonProperty("logo")
    public void setLogo(String logo) {
        this.logo = logo;
    }

    @JsonProperty("mature")
    public Boolean getMature() {
        return mature;
    }

    @JsonProperty("mature")
    public void setMature(Boolean mature) {
        this.mature = mature;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("partner")
    public Boolean getPartner() {
        return partner;
    }

    @JsonProperty("partner")
    public void setPartner(Boolean partner) {
        this.partner = partner;
    }

    @JsonProperty("profile_banner")
    public Object getProfileBanner() {
        return profileBanner;
    }

    @JsonProperty("profile_banner")
    public void setProfileBanner(Object profileBanner) {
        this.profileBanner = profileBanner;
    }

    @JsonProperty("profile_banner_background_color")
    public Object getProfileBannerBackgroundColor() {
        return profileBannerBackgroundColor;
    }

    @JsonProperty("profile_banner_background_color")
    public void setProfileBannerBackgroundColor(Object profileBannerBackgroundColor) {
        this.profileBannerBackgroundColor = profileBannerBackgroundColor;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("stream_key")
    public String getStreamKey() {
        return streamKey;
    }

    @JsonProperty("stream_key")
    public void setStreamKey(String streamKey) {
        this.streamKey = streamKey;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("video_banner")
    public Object getVideoBanner() {
        return videoBanner;
    }

    @JsonProperty("video_banner")
    public void setVideoBanner(Object videoBanner) {
        this.videoBanner = videoBanner;
    }

    @JsonProperty("views")
    public Integer getViews() {
        return views;
    }

    @JsonProperty("views")
    public void setViews(Integer views) {
        this.views = views;
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
        return new HashCodeBuilder().append(id).append(broadcasterLanguage).append(createdAt).append(displayName)
                .append(email).append(followers).append(game).append(language).append(logo).append(mature).append(name)
                .append(partner).append(profileBanner).append(profileBannerBackgroundColor).append(status)
                .append(streamKey).append(updatedAt).append(url).append(videoBanner).append(views)
                .append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Channel)) {
            return false;
        }
        Channel rhs = ((Channel) other);
        return new EqualsBuilder().append(id, rhs.id).append(broadcasterLanguage, rhs.broadcasterLanguage)
                .append(createdAt, rhs.createdAt).append(displayName, rhs.displayName).append(email, rhs.email)
                .append(followers, rhs.followers).append(game, rhs.game).append(language, rhs.language)
                .append(logo, rhs.logo).append(mature, rhs.mature).append(name, rhs.name).append(partner, rhs.partner)
                .append(profileBanner, rhs.profileBanner)
                .append(profileBannerBackgroundColor, rhs.profileBannerBackgroundColor).append(status, rhs.status)
                .append(streamKey, rhs.streamKey).append(updatedAt, rhs.updatedAt).append(url, rhs.url)
                .append(videoBanner, rhs.videoBanner).append(views, rhs.views)
                .append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}