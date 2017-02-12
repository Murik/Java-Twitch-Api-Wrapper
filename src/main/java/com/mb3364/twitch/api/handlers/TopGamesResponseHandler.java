package com.mb3364.twitch.api.handlers;

import com.mb3364.twitch.api.models.Top;

import java.util.List;

public interface TopGamesResponseHandler extends BaseFailureHandler {
    void onSuccess(int total, List<Top> games);
}
