package com.urgrue.twitch.api.resources;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.urgrue.twitch.api.handlers.BaseFailureHandler;
import com.urgrue.twitch.api.httpclient.HttpClient;
import com.urgrue.twitch.api.httpclient.HttpResponseHandler;
import com.urgrue.twitch.api.httpclient.NingAsyncHttpClient;
import com.urgrue.twitch.api.models.Error;
import io.netty.handler.codec.http.HttpHeaders;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * AbstractResource is the abstract base class of a TwitchApiClient resource.
 * A resource provides the functionality to access the REST endpoints of the TwitchApiClient API.
 *
 * @author Matthew Bell
 */
public abstract class AbstractResource {

    protected static final ObjectMapper objectMapper = new ObjectMapper(); // can reuse
    protected static final HttpClient http = new NingAsyncHttpClient(); // can reuse

    private final String baseUrl; // Base url for twitch rest api

    /**
     * Construct a resource using the TwitchApiClient API base URL and specified API version.
     *
     * @param baseUrl    the base URL of the TwitchApiClient API
     * @param apiVersion the requested version of the TwitchApiClient API
     */
    protected AbstractResource(String baseUrl, int apiVersion) {
        this.baseUrl = baseUrl;
        // Specify API version
        http.setHeader("ACCEPT", "application/vnd.twitchtv.v" + Integer.toString(apiVersion) + "+json");
        configureObjectMapper();
    }

    /**
     * Configure the Jackson JSON {@link ObjectMapper} to properly parse the API responses.
     */
    private void configureObjectMapper() {
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
    }

    /**
     * Sets the authentication access token to be included in the HTTP headers of each
     * API request.
     *
     * @param accessToken the user's authentication access token
     */
    public void setAuthAccessToken(String accessToken) {
        if (accessToken != null && accessToken.length() > 0) {
            http.setHeader("Authorization", String.format("OAuth %s", accessToken));
        } else {
            http.removeHeader("Authorization");
        }
    }

    /**
     * Sets the application's client ID to be included in the HTTP headers of each API request.
     *
     * @param clientId the application's client ID
     */
    public void setClientId(String clientId) {
        if (clientId != null && clientId.length() > 0) {
            http.setHeader("Client-ID", clientId);
        } else {
            http.removeHeader("Client-ID");
        }
    }

    /**
     * Get the base URL to the TwitchApiClient API. Intended to be called by subclasses when generating
     * their resource URL endpoint.
     *
     * @return the base URL to the TwitchApiClient API
     */
    protected String getBaseUrl() {
        return baseUrl;
    }

    /**
     * Handles HTTP response's from the TwitchApiClient API.
     * <p>Since all Http failure logic is the same, we handle it all in one place: here.</p>
     */
    protected static abstract class TwitchHttpResponseHandler extends HttpResponseHandler {

        public TwitchHttpResponseHandler(BaseFailureHandler apiHandler) {
            super(apiHandler);
        }

        @Override
        public abstract void onSuccess(int statusCode, HttpHeaders headers, String content);

        @Override
        public void onFailure(int statusCode, HttpHeaders headers, String content) {
            try {
                if (content.length() > 0) {
                    Error error = objectMapper.readValue(content, Error.class);
                    getApiHandler().onFailure(statusCode, error.getStatusText(), error.getMessage());
                } else {
                    getApiHandler().onFailure(statusCode, "", "");
                }
            } catch (IOException e) {
                getApiHandler().onFailure(e);
            }
        }

        @Override
        public void onFailure(Throwable throwable) {
            getApiHandler().onFailure(throwable);
        }
    }
}
