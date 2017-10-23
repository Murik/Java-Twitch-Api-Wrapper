package com.mb3364.twitch.api.resources;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import com.mb3364.twitch.api.handlers.GroupChattersHandler;
import com.mb3364.twitch.api.models.ChattersGroup;

/**
 * Java-Twitch-Api-Wrapper
 *
 * @autor Maxim Kulikov
 * @since 23.10.2017
 */
public class GroupResource extends AbstractResource {

    public GroupResource(String baseUrl, int apiVersion) {
        super(baseUrl, apiVersion);
    }

    public void getChatters(final String channel, final GroupChattersHandler handler) {
        String url = String.format("https://tmi.twitch.tv/group/user/%s/chatters", channel);

        http.get(url, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                try {
                    ChattersGroup value = objectMapper.readValue(content, ChattersGroup.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });


    }
}
