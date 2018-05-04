package com.urgrue.twitch.api.handlers;

import com.urgrue.twitch.api.models.Community;

/**
 * Created by Ague Mort of Veteran Software on 2/11/2017.
 * Original project by Matthew Bell
 */
public interface CommunityResponseHandler extends BaseFailureHandler {
    void onSuccess(Community community);
}
