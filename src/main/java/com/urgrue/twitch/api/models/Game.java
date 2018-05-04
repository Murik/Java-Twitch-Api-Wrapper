
package com.mb3364.twitch.api.models;

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
    "name",
    "popularity",
    "_id",
    "giantbomb_id",
    "box",
    "logo"
})
public class Game {

    @JsonProperty("name")
    private String name;
    @JsonProperty("popularity")
    private Integer popularity;
    @JsonProperty("_id")
    private Integer id;
    @JsonProperty("giantbomb_id")
    private Integer giantbombId;
    @JsonProperty("box")
    private Box box;
    @JsonProperty("logo")
    private Logo logo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Game() {
    }

    /**
     * 
     * @param id
     * @param logo
     * @param giantbombId
     * @param name
     * @param box
     * @param popularity
     */
    public Game(String name, Integer popularity, Integer id, Integer giantbombId, Box box, Logo logo) {
        super();
        this.name = name;
        this.popularity = popularity;
        this.id = id;
        this.giantbombId = giantbombId;
        this.box = box;
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

    @JsonProperty("popularity")
    public Integer getPopularity() {
        return popularity;
    }

    @JsonProperty("popularity")
    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    @JsonProperty("_id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("giantbomb_id")
    public Integer getGiantbombId() {
        return giantbombId;
    }

    @JsonProperty("giantbomb_id")
    public void setGiantbombId(Integer giantbombId) {
        this.giantbombId = giantbombId;
    }

    @JsonProperty("box")
    public Box getBox() {
        return box;
    }

    @JsonProperty("box")
    public void setBox(Box box) {
        this.box = box;
    }

    @JsonProperty("logo")
    public Logo getLogo() {
        return logo;
    }

    @JsonProperty("logo")
    public void setLogo(Logo logo) {
        this.logo = logo;
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
        return new HashCodeBuilder().append(name).append(popularity).append(id).append(giantbombId).append(box).append(logo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Game) == false) {
            return false;
        }
        Game rhs = ((Game) other);
        return new EqualsBuilder().append(name, rhs.name).append(popularity, rhs.popularity).append(id, rhs.id).append(giantbombId, rhs.giantbombId).append(box, rhs.box).append(logo, rhs.logo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
