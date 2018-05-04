package com.urgrue.twitch.api.handlers;

import com.urgrue.twitch.api.models.GetUser;

public interface GetUserResponseHandler extends BaseFailureHandler {
    void onSuccess(GetUser user);
}
