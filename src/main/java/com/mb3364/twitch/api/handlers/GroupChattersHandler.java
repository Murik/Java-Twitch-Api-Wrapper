package com.mb3364.twitch.api.handlers;

import com.mb3364.twitch.api.models.ChattersGroup;

/**
 * Java-Twitch-Api-Wrapper
 *
 * @author Maxim Kulikov
 * @since 23.10.2017
 */
public interface GroupChattersHandler extends BaseFailureHandler {

    void onSuccess(ChattersGroup chattersGroup);
}
