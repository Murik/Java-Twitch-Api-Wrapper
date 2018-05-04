package com.urgrue.twitch.api.handlers;

import com.urgrue.twitch.api.models.Subscription;

public interface ChannelSubscriptionResponseHandler extends BaseFailureHandler {
    void onSuccess(Subscription subscription);
}
