
package com.urgrue.twitch.api.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.urgrue.twitch.api.models.Fps;
import com.urgrue.twitch.api.models.Preview;
import com.urgrue.twitch.api.models.Resolutions;
import com.urgrue.twitch.api.models.Thumbnails;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "description",
    "description_html",
    "broadcast_id",
    "broadcast_type",
    "status",
    "tag_list",
    "views",
    "url",
    "language",
    "viewable",
    "viewable_at",
    "animated_preview_url",
    "_id",
    "recorded_at",
    "game",
    "length",
    "preview",
    "thumbnails",
    "fps",
    "resolutions",
    "created_at",
    "published_at",
    "channel",
    "muted_segments"
})
public class Video {

    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("description_html")
    private String descriptionHtml;
    @JsonProperty("broadcast_id")
    private Integer broadcastId;
    @JsonProperty("broadcast_type")
    private String broadcastType;
    @JsonProperty("status")
    private String status;
    @JsonProperty("tag_list")
    private String tagList;
    @JsonProperty("views")
    private Integer views;
    @JsonProperty("url")
    private String url;
    @JsonProperty("language")
    private String language;
    @JsonProperty("viewable")
    private String viewable;
    @JsonProperty("viewable_at")
    private Object viewableAt;
    @JsonProperty("animated_preview_url")
    private String animatedPreviewUrl;
    @JsonProperty("_id")
    private String id;
    @JsonProperty("recorded_at")
    private String recordedAt;
    @JsonProperty("game")
    private String game;
    @JsonProperty("length")
    private Integer length;
    @JsonProperty("preview")
    private Preview preview;
    @JsonProperty("thumbnails")
    private Thumbnails thumbnails;
    @JsonProperty("fps")
    private Fps fps;
    @JsonProperty("resolutions")
    private Resolutions resolutions;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("published_at")
    private String publishedAt;
    @JsonProperty("channel")
    private Channel channel;
    @JsonProperty("muted_segments")
    private Object mutedSegments;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Video() {
    }

    /**
     * 
     * @param resolutions
     * @param viewableAt
     * @param broadcastId
     * @param id
     * @param publishedAt
     * @param title
     * @param viewable
     * @param description
     * @param createdAt
     * @param length
     * @param status
     * @param broadcastType
     * @param fps
     * @param animatedPreviewUrl
     * @param game
     * @param thumbnails
     * @param mutedSegments
     * @param url
     * @param recordedAt
     * @param preview
     * @param views
     * @param language
     * @param tagList
     * @param channel
     * @param descriptionHtml
     */
    public Video(String title, String description, String descriptionHtml, Integer broadcastId, String broadcastType, String status, String tagList, Integer views, String url, String language, String viewable, Object viewableAt, String animatedPreviewUrl, String id, String recordedAt, String game, Integer length, Preview preview, Thumbnails thumbnails, Fps fps, Resolutions resolutions, String createdAt, String publishedAt, Channel channel, Object mutedSegments) {
        super();
        this.title = title;
        this.description = description;
        this.descriptionHtml = descriptionHtml;
        this.broadcastId = broadcastId;
        this.broadcastType = broadcastType;
        this.status = status;
        this.tagList = tagList;
        this.views = views;
        this.url = url;
        this.language = language;
        this.viewable = viewable;
        this.viewableAt = viewableAt;
        this.animatedPreviewUrl = animatedPreviewUrl;
        this.id = id;
        this.recordedAt = recordedAt;
        this.game = game;
        this.length = length;
        this.preview = preview;
        this.thumbnails = thumbnails;
        this.fps = fps;
        this.resolutions = resolutions;
        this.createdAt = createdAt;
        this.publishedAt = publishedAt;
        this.channel = channel;
        this.mutedSegments = mutedSegments;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("description_html")
    public String getDescriptionHtml() {
        return descriptionHtml;
    }

    @JsonProperty("description_html")
    public void setDescriptionHtml(String descriptionHtml) {
        this.descriptionHtml = descriptionHtml;
    }

    @JsonProperty("broadcast_id")
    public Integer getBroadcastId() {
        return broadcastId;
    }

    @JsonProperty("broadcast_id")
    public void setBroadcastId(Integer broadcastId) {
        this.broadcastId = broadcastId;
    }

    @JsonProperty("broadcast_type")
    public String getBroadcastType() {
        return broadcastType;
    }

    @JsonProperty("broadcast_type")
    public void setBroadcastType(String broadcastType) {
        this.broadcastType = broadcastType;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("tag_list")
    public String getTagList() {
        return tagList;
    }

    @JsonProperty("tag_list")
    public void setTagList(String tagList) {
        this.tagList = tagList;
    }

    @JsonProperty("views")
    public Integer getViews() {
        return views;
    }

    @JsonProperty("views")
    public void setViews(Integer views) {
        this.views = views;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("viewable")
    public String getViewable() {
        return viewable;
    }

    @JsonProperty("viewable")
    public void setViewable(String viewable) {
        this.viewable = viewable;
    }

    @JsonProperty("viewable_at")
    public Object getViewableAt() {
        return viewableAt;
    }

    @JsonProperty("viewable_at")
    public void setViewableAt(Object viewableAt) {
        this.viewableAt = viewableAt;
    }

    @JsonProperty("animated_preview_url")
    public String getAnimatedPreviewUrl() {
        return animatedPreviewUrl;
    }

    @JsonProperty("animated_preview_url")
    public void setAnimatedPreviewUrl(String animatedPreviewUrl) {
        this.animatedPreviewUrl = animatedPreviewUrl;
    }

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("recorded_at")
    public String getRecordedAt() {
        return recordedAt;
    }

    @JsonProperty("recorded_at")
    public void setRecordedAt(String recordedAt) {
        this.recordedAt = recordedAt;
    }

    @JsonProperty("game")
    public String getGame() {
        return game;
    }

    @JsonProperty("game")
    public void setGame(String game) {
        this.game = game;
    }

    @JsonProperty("length")
    public Integer getLength() {
        return length;
    }

    @JsonProperty("length")
    public void setLength(Integer length) {
        this.length = length;
    }

    @JsonProperty("preview")
    public Preview getPreview() {
        return preview;
    }

    @JsonProperty("preview")
    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    @JsonProperty("thumbnails")
    public Thumbnails getThumbnails() {
        return thumbnails;
    }

    @JsonProperty("thumbnails")
    public void setThumbnails(Thumbnails thumbnails) {
        this.thumbnails = thumbnails;
    }

    @JsonProperty("fps")
    public Fps getFps() {
        return fps;
    }

    @JsonProperty("fps")
    public void setFps(Fps fps) {
        this.fps = fps;
    }

    @JsonProperty("resolutions")
    public Resolutions getResolutions() {
        return resolutions;
    }

    @JsonProperty("resolutions")
    public void setResolutions(Resolutions resolutions) {
        this.resolutions = resolutions;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("published_at")
    public String getPublishedAt() {
        return publishedAt;
    }

    @JsonProperty("published_at")
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    @JsonProperty("channel")
    public Channel getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    @JsonProperty("muted_segments")
    public Object getMutedSegments() {
        return mutedSegments;
    }

    @JsonProperty("muted_segments")
    public void setMutedSegments(Object mutedSegments) {
        this.mutedSegments = mutedSegments;
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
        return new HashCodeBuilder().append(title).append(description).append(descriptionHtml).append(broadcastId).append(broadcastType).append(status).append(tagList).append(views).append(url).append(language).append(viewable).append(viewableAt).append(animatedPreviewUrl).append(id).append(recordedAt).append(game).append(length).append(preview).append(thumbnails).append(fps).append(resolutions).append(createdAt).append(publishedAt).append(channel).append(mutedSegments).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Video) == false) {
            return false;
        }
        Video rhs = ((Video) other);
        return new EqualsBuilder().append(title, rhs.title).append(description, rhs.description).append(descriptionHtml, rhs.descriptionHtml).append(broadcastId, rhs.broadcastId).append(broadcastType, rhs.broadcastType).append(status, rhs.status).append(tagList, rhs.tagList).append(views, rhs.views).append(url, rhs.url).append(language, rhs.language).append(viewable, rhs.viewable).append(viewableAt, rhs.viewableAt).append(animatedPreviewUrl, rhs.animatedPreviewUrl).append(id, rhs.id).append(recordedAt, rhs.recordedAt).append(game, rhs.game).append(length, rhs.length).append(preview, rhs.preview).append(thumbnails, rhs.thumbnails).append(fps, rhs.fps).append(resolutions, rhs.resolutions).append(createdAt, rhs.createdAt).append(publishedAt, rhs.publishedAt).append(channel, rhs.channel).append(mutedSegments, rhs.mutedSegments).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
