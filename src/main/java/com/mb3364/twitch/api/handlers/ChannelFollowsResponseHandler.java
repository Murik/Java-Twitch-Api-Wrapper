package com.mb3364.twitch.api.handlers;

import com.mb3364.twitch.api.models.Follow;

import java.util.List;

public interface ChannelFollowsResponseHandler extends BaseFailureHandler {
    void onSuccess(int total, List<Follow> follows);
}
