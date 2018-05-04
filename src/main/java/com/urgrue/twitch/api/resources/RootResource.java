package com.urgrue.twitch.api.resources;

import java.io.IOException;
import com.urgrue.twitch.api.handlers.TokenResponseHandler;
import com.urgrue.twitch.api.models.Root;
import io.netty.handler.codec.http.HttpHeaders;

/**
 * The {@link RootResource} provides the functionality
 * to access the root <code>/</code> endpoints of the Twitch API.
 *
 * @author Matthew Bell
 */
public class RootResource extends AbstractResource {

    /**
     * Construct the resource using the Twitch API base URL and specified API version.
     *
     * @param baseUrl    the base URL of the Twitch API
     * @param apiVersion the requested version of the Twitch API
     */
    public RootResource(String baseUrl, int apiVersion) {
        super(baseUrl, apiVersion);
    }

    /**
     * Authentication status. If you are authenticated, the response includes
     * the status of your token and links to other related resources.
     *
     * @param handler the response handler
     */
    public void get(final TokenResponseHandler handler) {
        String url = String.format("%s/", getBaseUrl());

        http.get(url, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, HttpHeaders headers, String content) {
                try {
                    Root value = objectMapper.readValue(content, Root.class);
                    handler.onSuccess(value.getToken());
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });

    }
}
