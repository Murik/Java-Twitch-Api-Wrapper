package com.mb3364.twitch.api.handlers;

import com.mb3364.twitch.api.models.Featured;

import java.util.List;

public interface FeaturedStreamResponseHandler extends BaseFailureHandler {
    void onSuccess(List<Featured> streams);
}
