package com.urgrue.twitch.api.handlers;

import com.urgrue.twitch.api.models.Featured;

import java.util.List;

public interface FeaturedStreamResponseHandler extends BaseFailureHandler {
    void onSuccess(List<Featured> streams);
}
