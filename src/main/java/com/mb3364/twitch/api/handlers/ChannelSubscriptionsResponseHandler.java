package com.mb3364.twitch.api.handlers;

import com.mb3364.twitch.api.models.Subscription;

import java.util.List;

public interface ChannelSubscriptionsResponseHandler extends BaseFailureHandler {
    void onSuccess(int total, List<Subscription> subscriptions);
}
