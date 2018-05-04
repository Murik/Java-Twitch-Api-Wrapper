
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
    "avatar_image_url",
    "cover_image_url",
    "description",
    "description_html",
    "language",
    "name",
    "owner_id",
    "rules",
    "rules_html",
    "summary"
})
public class Community {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("avatar_image_url")
    private String avatarImageUrl;
    @JsonProperty("cover_image_url")
    private String coverImageUrl;
    @JsonProperty("description")
    private String description;
    @JsonProperty("description_html")
    private String descriptionHtml;
    @JsonProperty("language")
    private String language;
    @JsonProperty("name")
    private String name;
    @JsonProperty("owner_id")
    private String ownerId;
    @JsonProperty("rules")
    private String rules;
    @JsonProperty("rules_html")
    private String rulesHtml;
    @JsonProperty("summary")
    private String summary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Community() {
    }

    /**
     * 
     * @param summary
     * @param id
     * @param ownerId
     * @param description
     * @param name
     * @param avatarImageUrl
     * @param language
     * @param rulesHtml
     * @param coverImageUrl
     * @param rules
     * @param descriptionHtml
     */
    public Community(String id, String avatarImageUrl, String coverImageUrl, String description, String descriptionHtml, String language, String name, String ownerId, String rules, String rulesHtml, String summary) {
        super();
        this.id = id;
        this.avatarImageUrl = avatarImageUrl;
        this.coverImageUrl = coverImageUrl;
        this.description = description;
        this.descriptionHtml = descriptionHtml;
        this.language = language;
        this.name = name;
        this.ownerId = ownerId;
        this.rules = rules;
        this.rulesHtml = rulesHtml;
        this.summary = summary;
    }

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("avatar_image_url")
    public String getAvatarImageUrl() {
        return avatarImageUrl;
    }

    @JsonProperty("avatar_image_url")
    public void setAvatarImageUrl(String avatarImageUrl) {
        this.avatarImageUrl = avatarImageUrl;
    }

    @JsonProperty("cover_image_url")
    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    @JsonProperty("cover_image_url")
    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
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

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("owner_id")
    public String getOwnerId() {
        return ownerId;
    }

    @JsonProperty("owner_id")
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    @JsonProperty("rules")
    public String getRules() {
        return rules;
    }

    @JsonProperty("rules")
    public void setRules(String rules) {
        this.rules = rules;
    }

    @JsonProperty("rules_html")
    public String getRulesHtml() {
        return rulesHtml;
    }

    @JsonProperty("rules_html")
    public void setRulesHtml(String rulesHtml) {
        this.rulesHtml = rulesHtml;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
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
        return new HashCodeBuilder().append(id).append(avatarImageUrl).append(coverImageUrl).append(description).append(descriptionHtml).append(language).append(name).append(ownerId).append(rules).append(rulesHtml).append(summary).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Community) == false) {
            return false;
        }
        Community rhs = ((Community) other);
        return new EqualsBuilder().append(id, rhs.id).append(avatarImageUrl, rhs.avatarImageUrl).append(coverImageUrl, rhs.coverImageUrl).append(description, rhs.description).append(descriptionHtml, rhs.descriptionHtml).append(language, rhs.language).append(name, rhs.name).append(ownerId, rhs.ownerId).append(rules, rhs.rules).append(rulesHtml, rhs.rulesHtml).append(summary, rhs.summary).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
