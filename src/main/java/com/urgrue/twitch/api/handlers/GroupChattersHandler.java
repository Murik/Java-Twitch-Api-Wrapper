package com.urgrue.twitch.api.handlers;

import com.urgrue.twitch.api.models.ChattersGroup;

/**
 * Java-Twitch-Api-Wrapper
 *
 * @author Maxim Kulikov
 * @since 23.10.2017
 */
public interface GroupChattersHandler extends BaseFailureHandler {

    void onSuccess(ChattersGroup chattersGroup);
}
