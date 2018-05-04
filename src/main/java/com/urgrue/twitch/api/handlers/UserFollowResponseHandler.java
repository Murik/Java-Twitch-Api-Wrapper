package com.mb3364.twitch.api.handlers;

import com.mb3364.twitch.api.models.Follow;

public interface UserFollowResponseHandler extends BaseFailureHandler {
    void onSuccess(Follow follow);
}
