package com.urgrue.twitch.api.handlers;

import com.urgrue.twitch.api.models.Follow;

import java.util.List;

public interface UserFollowsResponseHandler extends BaseFailureHandler {
    void onSuccess(int total, List<Follow> follows);
}
