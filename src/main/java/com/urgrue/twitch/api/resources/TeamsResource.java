package com.urgrue.twitch.api.resources;

import com.urgrue.twitch.api.handlers.TeamResponseHandler;
import com.urgrue.twitch.api.handlers.TeamsResponseHandler;
import com.urgrue.twitch.api.httpclient.RequestParams;
import com.urgrue.twitch.api.models.Team;
import com.urgrue.twitch.api.models.Teams;
import io.netty.handler.codec.http.HttpHeaders;

import java.io.IOException;

/**
 * The {@link TeamsResource} provides the functionality
 * to access the <code>/teams</code> endpoints of the TwitchApiClient API.
 *
 * @author Matthew Bell (original author)
 * @author Ague Mort (contributing author)
 */
public class TeamsResource extends AbstractResource {

    /**
     * Construct the resource using the TwitchApiClient API base URL and specified API version.
     *
     * @param baseUrl    the base URL of the TwitchApiClient API
     * @param apiVersion the requested version of the TwitchApiClient API
     */
    public TeamsResource(String baseUrl, int apiVersion) {
        super(baseUrl, apiVersion);
    }

    /**
     * Gets all active teams.
     *
     * @param params  the optional request parameters:
     *                <ul>
     *                <li><code>limit</code>: Integer: Maximum number of objects to return, sorted by creation date.
     *                Default: 25. Maximum: 100.</li>
     *                <li><code>offset</code>: Integer: Object offset for pagination of results. Default: 0.</li>
     *                </ul>
     * @param handler the response handler
     */
    public void get(final RequestParams params, final TeamsResponseHandler handler) {
        String url = String.format("%s/teams", getBaseUrl());

        http.get(url, params, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, HttpHeaders headers, String content) {
                try {
                    Teams value = objectMapper.readValue(content, Teams.class);
                    handler.onSuccess(value.getTeams());
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    /**
     * Gets all active teams.
     *
     * @param handler the response handler
     */
    public void get(final TeamsResponseHandler handler) {
        get(new RequestParams(), handler);
    }

    /**
     * Returns a specified {@link Team} object.
     *
     * @param team    the name of the {@link Team}
     * @param handler the response handler
     */
    public void get(final String team, final TeamResponseHandler handler) {
        String url = String.format("%s/teams/%s", getBaseUrl(), team);

        http.get(url, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, HttpHeaders headers, String content) {
                try {
                    Team value = objectMapper.readValue(content, Team.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }
}
