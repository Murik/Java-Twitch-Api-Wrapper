
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
    "game",
    "viewers",
    "channels"
})
public class Top {

    @JsonProperty("game")
    private Game game;
    @JsonProperty("viewers")
    private Integer viewers;
    @JsonProperty("channels")
    private Integer channels;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Top() {
    }

    /**
     * 
     * @param viewers
     * @param channels
     * @param game
     */
    public Top(Game game, Integer viewers, Integer channels) {
        super();
        this.game = game;
        this.viewers = viewers;
        this.channels = channels;
    }

    @JsonProperty("game")
    public Game getGame() {
        return game;
    }

    @JsonProperty("game")
    public void setGame(Game game) {
        this.game = game;
    }

    @JsonProperty("viewers")
    public Integer getViewers() {
        return viewers;
    }

    @JsonProperty("viewers")
    public void setViewers(Integer viewers) {
        this.viewers = viewers;
    }

    @JsonProperty("channels")
    public Integer getChannels() {
        return channels;
    }

    @JsonProperty("channels")
    public void setChannels(Integer channels) {
        this.channels = channels;
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
        return new HashCodeBuilder().append(game).append(viewers).append(channels).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Top) == false) {
            return false;
        }
        Top rhs = ((Top) other);
        return new EqualsBuilder().append(game, rhs.game).append(viewers, rhs.viewers).append(channels, rhs.channels).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
