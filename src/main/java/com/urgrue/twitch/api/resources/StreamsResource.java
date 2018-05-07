package com.urgrue.twitch.api.resources;


import com.urgrue.twitch.api.auth.Scopes;
import com.urgrue.twitch.api.handlers.FeaturedStreamResponseHandler;
import com.urgrue.twitch.api.handlers.StreamResponseHandler;
import com.urgrue.twitch.api.handlers.StreamsResponseHandler;
import com.urgrue.twitch.api.handlers.StreamsSummaryResponseHandler;
import com.urgrue.twitch.api.httpclient.RequestParams;
import com.urgrue.twitch.api.models.*;
import io.netty.handler.codec.http.HttpHeaders;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The {@link StreamsResource} provides the functionality to access the <code>/streams</code> endpoints of the Twitch API.
 *
 * @author Matthew Bell (original author)
 * @author Ague Mort (contributing author)
 */
public class StreamsResource extends AbstractResource {

    private void httpGet(String url, RequestParams params, StreamsResponseHandler handler) {
        http.get(url, params, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, HttpHeaders headers, String content) {
                try {
                    Streams value = objectMapper.readValue(content, Streams.class);
                    handler.onSuccess(value.getTotal(), value.getStreams());
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    /**
     * Construct the resource using the Twitch API base URL and specified API version.
     *
     * @param baseUrl    the base URL of the Twitch API
     * @param apiVersion the requested version of the Twitch API
     */
    public StreamsResource(String baseUrl, int apiVersion) {
        super(baseUrl, apiVersion);
    }

    /**
     * Gets stream information (the {@link Streams} object) for a specified user.
     *
     * <p>The stream object in the onSuccess() response will be <code>null</code> if the stream is offline.</p>
     *
     * @param channelName the name of the Channel
     * @param params      optional query string parameters:
     *                    <ul>
     *                    <li><code>stream_type</code>: String: Constrains the type of streams returned.
     *                    Valid values: <code>live</code>, <code>playlist</code>, <code>all</code>.
     *                    Playlists are offline streams of VODs (Video on Demand) that appear live.
     *                    Default: <code>live</code>.</li>
     *                    </ul>
     * @param handler     the response handler
     */
    public void get(final String channelName, final RequestParams params, final StreamResponseHandler handler) {
        String channelId = getChannelId(channelName).get(0);
        System.out.println(channelId);
        String url = String.format("%s/streams/%s", getBaseUrl(), channelId);

        http.get(url, params, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, HttpHeaders headers, String content) {
                try {
                    StreamContainer value = objectMapper.readValue(content, StreamContainer.class);
                    handler.onSuccess(value.getStream());
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    /**
     * Gets stream information (the {@link Streams} object) for a specified user.
     *
     * <p>The stream object in the onSuccess() response will be <code>null</code> if the stream is offline.</p>
     *
     * @param channelName the name of the Channel
     * @param handler     the response handler
     */
    public void get(final String channelName, final StreamResponseHandler handler) {
        String channelId = getChannelId(channelName).get(0);
        System.out.println(channelId);
        String url = String.format("%s/streams/%s", getBaseUrl(), channelId);

        http.get(url, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, HttpHeaders headers, String content) {
                try {
                    StreamContainer value = objectMapper.readValue(content, StreamContainer.class);
                    handler.onSuccess(value.getStream());
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    /**
     * Gets a list of live streams.
     *
     * @param params  the optional request parameters:
     *                <ul>
     *                <li><code>channel</code>: Comma-Separated List of Channel IDs:
     *                Constrains the channel(s) of the streams returned.</li>
     *                <li><code>game</code>: String: Constrains the game of the streams returned.</li>
     *                <li><code>language</code>: String: Constrains the language of the streams returned.
     *                Valid value: a locale ID string; for example, <code>en</code>, <code>fi</code>, <code>es-mx</code>.
     *                Only one language can be specified.
     *                Default: all languages.</li>
     *                <li><code>stream_type</code>: String: Constrains the type of streams returned.
     *                Valid values: <code>live</code>, <code>playlist</code>, <code>all</code>.
     *                Playlists are offline streams of VODs (Video on Demand) that appear live.
     *                Default: <code>live</code>.</li>
     *                <li><code>limit</code>: Integer: Maximum number of objects to return, sorted by number of viewers.
     *                Default: 25. Maximum: 100.</li>
     *                <li><code>offset</code>: Integer: Object offset for pagination of results. Default: 0.</li>
     *                </ul>
     * @param handler the response handler
     */
    public void get(final RequestParams params, final StreamsResponseHandler handler) {
        String url = String.format("%s/streams", getBaseUrl());
        httpGet(url, params, handler);
    }

    /**
     * Gets a list of live streams with no optional query parameters.
     *
     * @param handler the response handler
     */
    public void get(final StreamsResponseHandler handler) {
        get(new RequestParams(), handler);
    }

    /**
     * Gets a summary of live streams.
     *
     * @param game    Only show stats for the set game
     * @param handler the response handler
     */
    public void getSummary(final String game, final StreamsSummaryResponseHandler handler) {
        String url = String.format("%s/streams/summary", getBaseUrl());
        RequestParams params = new RequestParams();
        params.put("game", game);

        http.get(url, params, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, HttpHeaders headers, String content) {
                try {
                    StreamsSummary value = objectMapper.readValue(content, StreamsSummary.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    /**
     * Returns a summary of current streams.
     *
     * @param handler the response handler
     */
    public void getSummary(final StreamsSummaryResponseHandler handler) {
        String url = String.format("%s/streams/summary", getBaseUrl());

        http.get(url, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, HttpHeaders headers, String content) {
                try {
                    StreamsSummary value = objectMapper.readValue(content, StreamsSummary.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    /**
     * Returns a list of featured (promoted) stream objects.
     *
     * @param params  the optional request parameters:
     *                <ul>
     *                <li><code>limit</code>:  Maximum number of objects in array. Default is 25. Maximum is 100.</li>
     *                <li><code>offset</code>: Object offset for pagination. Default is 0.</li>
     *                </ul>
     * @param handler the response handler
     */
    public void getFeatured(final RequestParams params, final FeaturedStreamResponseHandler handler) {
        String url = String.format("%s/streams/featured", getBaseUrl());

        http.get(url, params, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, HttpHeaders headers, String content) {
                try {
                    StreamsFeatured value = objectMapper.readValue(content, StreamsFeatured.class);
                    handler.onSuccess(value.getFeatured());
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    /**
     * Returns a list of featured (promoted) stream objects.
     *
     * @param handler the response handler
     */
    public void getFeatured(final FeaturedStreamResponseHandler handler) {
        getFeatured(new RequestParams(), handler);
    }

    /**
     * Returns a list of stream objects that the authenticated user is following.
     * Authenticated, required scope: {@link Scopes#USER_READ}
     *
     * @param params  the optional request parameters:
     *                <ul>
     *                <li><code>stream_type</code>: String: Constrains the type of streams returned.
     *                Valid values: <code>live</code>, <code>playlist</code>, <code>all</code>.
     *                Playlists are offline streams of VODs (Video on Demand) that appear live.
     *                Default: <code>live</code>.</li>
     *                <li><code>limit</code>: Integer: Maximum number of objects to return. Default: 25. Maximum: 100.</li>
     *                <li><code>offset</code>: Integer: Object offset for pagination of results. Default: 0.</li>
     *                </ul>
     * @param handler the response handler
     */
    public void getFollowed(final RequestParams params, final StreamsResponseHandler handler) {
        String url = String.format("%s/streams/followed", getBaseUrl());
        httpGet(url, params, handler);
    }

    /**
     * Returns a list of stream objects that the authenticated user is following.
     * Authenticated, required scope: {@link Scopes#USER_READ}
     *
     * @param handler the response handler
     */
    public void getFollowed(final StreamsResponseHandler handler) {
        getFollowed(new RequestParams(), handler);
    }
}
