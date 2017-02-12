package com.mb3364.twitch.api.handlers;

import com.mb3364.twitch.api.models.Subscription;

public interface ChannelSubscriptionResponseHandler extends BaseFailureHandler {
    void onSuccess(Subscription subscription);
}
