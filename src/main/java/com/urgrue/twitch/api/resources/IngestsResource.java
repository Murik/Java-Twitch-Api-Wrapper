package com.urgrue.twitch.api.resources;

import com.urgrue.twitch.api.handlers.IngestsResponseHandler;
import com.urgrue.twitch.api.models.Ingests;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The {@link IngestsResource} provides the functionality
 * to access the <code>/ingests</code> endpoints of the TwitchApiClient API.
 *
 * @author Matthew Bell
 */
public class IngestsResource extends AbstractResource {

    /**
     * Construct the resource using the TwitchApiClient API base URL and specified API version.
     *
     * @param baseUrl    the base URL of the TwitchApiClient API
     * @param apiVersion the requested version of the TwitchApiClient API
     */
    public IngestsResource(String baseUrl, int apiVersion) {
        super(baseUrl, apiVersion);
    }

    /**
     * Returns a list of ingest objects.
     *
     * @param handler the response handler
     */
    public void get(final IngestsResponseHandler handler) {
        String url = String.format("%s/ingests", getBaseUrl());

        http.get(url, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                try {
                    Ingests value = objectMapper.readValue(content, Ingests.class);
                    handler.onSuccess(value.getIngests());
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }
}
