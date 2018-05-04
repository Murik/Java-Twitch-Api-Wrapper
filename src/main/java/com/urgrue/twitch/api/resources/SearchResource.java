package com.mb3364.twitch.api.resources;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import com.mb3364.http.RequestParams;
import com.mb3364.twitch.api.handlers.ChannelsResponseHandler;
import com.mb3364.twitch.api.handlers.GamesResponseHandler;
import com.mb3364.twitch.api.handlers.StreamsResponseHandler;
import com.mb3364.twitch.api.models.SearchChannels;
import com.mb3364.twitch.api.models.SearchGames;
import com.mb3364.twitch.api.models.SearchStreams;

/**
 * The {@link SearchResource} provides the functionality
 * to access the <code>/search</code> endpoints of the Twitch API.
 *
 * @author Matthew Bell
 */
public class SearchResource extends AbstractResource {

    /**
     * Construct the resource using the Twitch API base URL and specified API version.
     *
     * @param baseUrl    the base URL of the Twitch API
     * @param apiVersion the requested version of the Twitch API
     */
    public SearchResource(String baseUrl, int apiVersion) {
        super(baseUrl, apiVersion);
    }

    /**
     * Returns a list of channel objects matching the search query.
     *
     * @param query   the search query
     * @param params  the optional request parameters:
     *                <ul>
     *                <li><code>limit</code>:  the maximum number of objects in array. Maximum is 100.</li>
     *                <li><code>offset</code>: the object offset for pagination. Default is 0.</li>
     *                </ul>
     * @param handler the response handler
     */
    public void channels(final String query, final RequestParams params, final ChannelsResponseHandler handler) {
        String url = String.format("%s/search/channels", getBaseUrl());
        params.put("query", query);

        http.get(url, params, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                try {
                    SearchChannels value = objectMapper.readValue(content, SearchChannels.class);
                    handler.onSuccess(value.getTotal(), value.getChannels());
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    /**
     * Returns a list of channel objects matching the search query.
     *
     * @param query   the search query
     * @param handler the response handler
     */
    public void channels(String query, ChannelsResponseHandler handler) {
        channels(query, new RequestParams(), handler);
    }

    /**
     * Returns a list of game objects matching the search query.
     *
     * @param query   the search query
     * @param params  the optional request parameters:
     *                <ul>
     *                <li><code>live</code>:  If true, only returns games that are live on at least one channel.</li>
     *                </ul>
     * @param handler the response handler
     */
    public void games(final String query, final RequestParams params, final GamesResponseHandler handler) {
        String url = String.format("%s/search/games", getBaseUrl());
        params.put("query", query);

        http.get(url, params, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                try {
                    SearchGames value = objectMapper.readValue(content, SearchGames.class);
                    int gamesTotal = 0;
                    if (value.getGames() != null) {
                        gamesTotal = value.getGames().size();
                    }
                    handler.onSuccess(gamesTotal, value.getGames());
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    /**
     * Returns a list of game objects matching the search query.
     *
     * @param query   the search query
     * @param handler the response handler
     */
    public void games(final String query, final GamesResponseHandler handler) {
        games(query, new RequestParams(), handler);
    }

    /**
     * Returns a list of stream objects matching the search query.
     *
     * @param query   the search query
     * @param params  the optional request parameters:
     *                <ul>
     *                <li><code>limit</code>: Integer: The maximum number of objects in array. Maximum is 100.</li>
     *                <li><code>offset</code>: Integer: The object offset for pagination. Default is 0.</li>
     *                <li><code>hls</code>: Boolean: If true, returns only HLS streams; if false, only RTMP streams; if not set, both HLS and RTMP streams.
     *                HLS is HTTP Live Streaming, a live-streaming communications protocol.
     *                RTMP is Real-Time Media Protocol, an industry standard for moving video around a network.
     *                Default: not set.</li>
     *                </ul>
     * @param handler the response handler
     */
    public void streams(final String query, final RequestParams params, final StreamsResponseHandler handler) {
        String url = String.format("%s/search/streams", getBaseUrl());
        params.put("query", query);

        http.get(url, params, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                try {
                    SearchStreams value = objectMapper.readValue(content, SearchStreams.class);
                    handler.onSuccess(value.getTotal(), value.getStreams());
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    /**
     * Returns a list of stream objects matching the search query.
     *
     * @param query   the search query
     * @param handler the response handler
     */
    public void streams(final String query, final StreamsResponseHandler handler) {
        streams(query, new RequestParams(), handler);
    }
}
