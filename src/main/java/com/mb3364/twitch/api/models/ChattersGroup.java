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
 * https://tmi.twitch.tv/group/user/trinion/chatters
 * @since 23.10.2017
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "_links",
        "chatter_count",
        "chatters",


})
public class ChattersGroup {

    @JsonProperty("_links")
    private Object links;
    @JsonProperty("chatter_count")
    private int chatterCount;
    @JsonProperty("chatters")
    private Chatters chatters;

    public ChattersGroup() {
    }

    public ChattersGroup(String links, int chatterCount, Chatters chatters) {
        this.links = links;
        this.chatterCount = chatterCount;
        this.chatters = chatters;
    }

    public int getChatterCount() {
        return chatterCount;
    }

    public void setChatterCount(int chatterCount) {
        this.chatterCount = chatterCount;
    }

    public Chatters getChatters() {
        return chatters;
    }

    public void setChatters(Chatters chatters) {
        this.chatters = chatters;
    }

    public Object getLinks() {
        return links;
    }

    public void setLinks(Object links) {
        this.links = links;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(chatterCount)
                .append(chatters)
                .toHashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof ChattersGroup)) return false;

        ChattersGroup that = (ChattersGroup) o;

        return new EqualsBuilder()
                .append(chatterCount, that.chatterCount)
                .append(links, that.links)
                .append(chatters, that.chatters)
                .isEquals();
    }
}

