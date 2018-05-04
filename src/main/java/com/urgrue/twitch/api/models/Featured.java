
package com.urgrue.twitch.api.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.urgrue.twitch.api.models.Stream;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "text",
    "title",
    "sponsored",
    "priority",
    "scheduled",
    "image",
    "stream"
})
public class Featured {

    @JsonProperty("text")
    private String text;
    @JsonProperty("title")
    private String title;
    @JsonProperty("sponsored")
    private Boolean sponsored;
    @JsonProperty("priority")
    private Integer priority;
    @JsonProperty("scheduled")
    private Boolean scheduled;
    @JsonProperty("image")
    private String image;
    @JsonProperty("stream")
    private Stream stream;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Featured() {
    }

    /**
     * 
     * @param stream
     * @param scheduled
     * @param title
     * @param text
     * @param priority
     * @param image
     * @param sponsored
     */
    public Featured(String text, String title, Boolean sponsored, Integer priority, Boolean scheduled, String image, Stream stream) {
        super();
        this.text = text;
        this.title = title;
        this.sponsored = sponsored;
        this.priority = priority;
        this.scheduled = scheduled;
        this.image = image;
        this.stream = stream;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("sponsored")
    public Boolean getSponsored() {
        return sponsored;
    }

    @JsonProperty("sponsored")
    public void setSponsored(Boolean sponsored) {
        this.sponsored = sponsored;
    }

    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @JsonProperty("scheduled")
    public Boolean getScheduled() {
        return scheduled;
    }

    @JsonProperty("scheduled")
    public void setScheduled(Boolean scheduled) {
        this.scheduled = scheduled;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("stream")
    public Stream getStream() {
        return stream;
    }

    @JsonProperty("stream")
    public void setStream(Stream stream) {
        this.stream = stream;
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
        return new HashCodeBuilder().append(text).append(title).append(sponsored).append(priority).append(scheduled).append(image).append(stream).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Featured) == false) {
            return false;
        }
        Featured rhs = ((Featured) other);
        return new EqualsBuilder().append(text, rhs.text).append(title, rhs.title).append(sponsored, rhs.sponsored).append(priority, rhs.priority).append(scheduled, rhs.scheduled).append(image, rhs.image).append(stream, rhs.stream).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
