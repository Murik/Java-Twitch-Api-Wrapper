package com.mb3364.twitch.api.handlers;

import com.mb3364.twitch.api.models.GetUser;

public interface GetUserResponseHandler extends BaseFailureHandler {
    void onSuccess(GetUser user);
}
