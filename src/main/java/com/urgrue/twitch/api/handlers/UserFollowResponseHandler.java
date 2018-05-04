package com.urgrue.twitch.api.handlers;

import com.urgrue.twitch.api.models.Follow;

public interface UserFollowResponseHandler extends BaseFailureHandler {
    void onSuccess(Follow follow);
}
