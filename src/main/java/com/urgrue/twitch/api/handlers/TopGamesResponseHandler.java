package com.urgrue.twitch.api.handlers;

import com.urgrue.twitch.api.models.Top;

import java.util.List;

public interface TopGamesResponseHandler extends BaseFailureHandler {
    void onSuccess(int total, List<Top> games);
}
