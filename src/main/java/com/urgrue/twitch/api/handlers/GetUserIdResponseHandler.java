package com.urgrue.twitch.api.handlers;

/**
 * Created by Ague Mort of Veteran Software on 2/11/2017.
 * Original project by Matthew Bell
 */
public interface GetUserIdResponseHandler extends BaseFailureHandler {
    void onSuccess(String userId);
}
