package com.urgrue.twitch.api.handlers;

import com.urgrue.twitch.api.models.Vod;

import java.util.List;

/**
 * Created by Ague Mort of Veteran Software on 2/11/2017.
 * Original project by Matthew Bell
 */
public interface TopVideosResponseHandler extends BaseFailureHandler {
    void onSuccess(int total, List<Vod> videos);
}
