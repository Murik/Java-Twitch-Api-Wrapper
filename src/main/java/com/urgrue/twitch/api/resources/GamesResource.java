package com.urgrue.twitch.api.resources;

import com.urgrue.twitch.api.handlers.TopGamesResponseHandler;
import com.urgrue.twitch.api.httpclient.RequestParams;
import com.urgrue.twitch.api.models.Games;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The {@link GamesResource} provides the functionality
 * to access the <code>/games</code> endpoints of the TwitchApiClient API.
 *
 * @author Matthew Bell
 */
public class GamesResource extends AbstractResource {

    /**
     * Construct the resource using the TwitchApiClient API base URL and specified API version.
     *
     * @param baseUrl    the base URL of the TwitchApiClient API
     * @param apiVersion the requested version of the TwitchApiClient API
     */
    public GamesResource(String baseUrl, int apiVersion) {
        super(baseUrl, apiVersion);
    }

    /**
     * Returns a list of games objects sorted by number of current viewers on TwitchApiClient, most popular first.
     *
     * @param params  the optional request parameters:
     *                <ul>
     *                <li><code>limit</code>:  the maximum number of objects in array. Maximum is 100.</li>
     *                <li><code>offset</code>: the object offset for pagination. Default is 0.</li>
     *                </ul>
     * @param handler the response handler
     */
    public void getTop(final RequestParams params, final TopGamesResponseHandler handler) {
        String url = String.format("%s/games/top", getBaseUrl());

        http.get(url, params, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                try {
                    Games value = objectMapper.readValue(content, Games.class);
                    handler.onSuccess(value.getTotal(), value.getTop());
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    /**
     * Returns a list of games objects sorted by number of current viewers on TwitchApiClient, most popular first.
     *
     * @param handler the response handler
     */
    public void getTop(TopGamesResponseHandler handler) {
        getTop(new RequestParams(), handler);
    }
}
