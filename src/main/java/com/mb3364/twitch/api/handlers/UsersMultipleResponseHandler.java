package com.mb3364.twitch.api.handlers;

import java.util.List;
import com.mb3364.twitch.api.models.UserOnChannel;

/**
 * Java-Twitch-Api-Wrapper
 *
 * @author Maxim Kulikov
 * @since 23.10.2017
 */
public interface UsersMultipleResponseHandler extends BaseFailureHandler {
    void onSuccess(int total, List<UserOnChannel> users);
}

