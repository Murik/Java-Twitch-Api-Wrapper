package com.mb3364.twitch.api.resources;

import com.mb3364.http.RequestParams;
import com.mb3364.twitch.api.auth.Scopes;
import com.mb3364.twitch.api.handlers.*;
import com.mb3364.twitch.api.models.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * The {@link UsersResource} provides the functionality
 * to access the <code>/users</code> endpoints of the Twitch API.
 *
 * @author Matthew Bell
 */
public class UsersResource extends AbstractResource {

    private HttpResponse response;

    /**
     * Construct the resource using the Twitch API base URL and specified API version.
     *
     * @param baseUrl    the base URL of the Twitch API
     * @param apiVersion the requested version of the Twitch API
     */
    public UsersResource(String baseUrl, int apiVersion) {
        super(baseUrl, apiVersion);
    }

    /**
     * Gets a {@link GetUser} object based on the OAuth token provided.
     * <p>
     * If the user’s Twitch-registered email address is not verified, null is returned.
     * <p>
     * Get User returns more data than Get User by ID, because Get User is privileged.
     * <p>
     * Authenticated, required scope: {@link Scopes#USER_READ}
     *
     * @param handler the response handler
     */
    public void get(final GetUserResponseHandler handler) {
        String url = String.format("%s/user", getBaseUrl());

        http.get(url, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                try {
                    GetUser value = objectMapper.readValue(content, GetUser.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    /**
     * Gets a specified {@link User} object.
     *
     * @param user    the user to request
     * @param handler the response handler
     */
    public void get(final String user, final UserResponseHandler handler) {
        String url = String.format("%s/users/%s", getBaseUrl(), getUserId(user).get(0));

        http.get(url, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                try {
                    User value = objectMapper.readValue(content, User.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    /**
     * Checks if a specified user is subscribed to a specified channel.
     * <p>
     * Authenticated, required scope: {@link Scopes#USER_SUBSCRIPTIONS}
     *
     * @param user    the authenticated user's name
     * @param channel the channel name of the subscription
     * @param handler the response handler
     */
    public void getSubscription(final String user, final String channel, final UserSubscriptionResponseHandler handler) {
        // TODO: add hook for channel ID
        String url = String.format("%s/users/%s/subscriptions/%s", getBaseUrl(), getUserId(user).get(0), channel);

        http.get(url, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                try {
                    UserSubscription value = objectMapper.readValue(content, UserSubscription.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    /**
     * Returns a {@link UserFollows} object that contains a list of {@link Follow}
     * objects representing channels the user is following.
     *
     * @param user    the user's name
     * @param params  the optional request parameters:
     *                <ul>
     *                <li><code>limit</code>:  Maximum number of objects in array. Default is 25. Maximum is 100.</li>
     *                <li><code>offset</code>: Object offset for pagination. Default is 0.</li>
     *                <li><code>direction</code>: Sorting direction. Default is <code>desc</code>.
     *                Valid values are <code>asc</code> and <code>desc</code>.</li>
     *                <li><code>sortby</code>: Sort key. Default is <code>created_at</code>.
     *                Valid values are <code>created_at</code>, <code>last_broadcast</code>, and <code>login</code>.</li>
     *                </ul>
     * @param handler the response handler
     */
    public void getFollows(final String user, final RequestParams params, final UserFollowsResponseHandler handler) {
        String url = String.format("%s/users/%s/follows/channels", getBaseUrl(), getUserId(user).get(0));

        http.get(url, params, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                try {
                    UserFollows value = objectMapper.readValue(content, UserFollows.class);
                    handler.onSuccess(value.getTotal(), value.getFollows());
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    /**
     * Returns a {@link UserFollows} object that contains a list of {@link Follow}
     * objects representing channels the user is following.
     *
     * @param user    the user's name
     * @param handler the response handler
     */
    public void getFollows(final String user, final UserFollowsResponseHandler handler) {
        getFollows(user, new RequestParams(), handler);
    }

    /**
     * Checks if a specified user follows a specified channel.
     * If the user is following the channel, a {@link Follow} object is returned.
     *
     * @param user    the user
     * @param channel the channel
     * @param handler the response handler
     */
    public void getFollow(final String user, final String channel, final UserFollowResponseHandler handler) {
        // TODO: add hook for getting channel IDs
        String url = String.format("%s/users/%s/follows/channels/%s", getBaseUrl(), getUserId(user).get(0), channel);

        http.get(url, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                try {
                    Follow value = objectMapper.readValue(content, Follow.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    /**
     * Adds a specified user to the followers of a specified channel.
     * <p>
     * There is an error response (<code>422 Unprocessable Entity</code>) if the channel could not be followed.
     * <p>
     * Authenticated, required scope: {@link Scopes#USER_FOLLOWS_EDIT}
     *
     * @param user                the authenticated user
     * @param channel             the channel to follow
     * @param enableNotifications receive email/push notifications when channel goes live. Default is <code>false</code>.
     * @param handler             the response handler
     */
    public void follow(final String user, final String channel, final boolean enableNotifications, final UserFollowResponseHandler handler) {
        // TODO: add hooks for Channel IDs
        String url = String.format("%s/users/%s/follows/channels/%s", getBaseUrl(), getUserId(user).get(0), channel);

        RequestParams params = new RequestParams();
        params.put("notifications", Boolean.toString(enableNotifications));

        http.put(url, params, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                try {
                    Follow value = objectMapper.readValue(content, Follow.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    /**
     * Adds a specified user to the followers of a specified channel.
     * <p>
     * Authenticated, required scope: {@link Scopes#USER_FOLLOWS_EDIT}
     *
     * @param user    the authenticated user
     * @param channel the channel to follow
     * @param handler the response handler
     */
    public void follow(final String user, final String channel, final UserFollowResponseHandler handler) {
        follow(user, channel, false, handler);
    }

    /**
     * Deletes a specified user from the followers of a specified channel.
     * <p>
     * Authenticated, required scope: {@link Scopes#USER_FOLLOWS_EDIT}
     *
     * @param user    the authenticated user
     * @param channel the channel to unfollow
     * @param handler the response handler
     */
    public void unfollow(final String user, final String channel, final UserUnfollowResponseHandler handler) {
        // TODO: add hooks for getting Channel IDs
        String url = String.format("%s/users/%s/follows/channels/%s", getBaseUrl(), getUserId(user).get(0), channel);

        http.delete(url, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                handler.onSuccess();
            }
        });
    }

    /**
     * Returns a list of {@link Block} objects on <code>User</code>'s block list.
     * List sorted by recency, newest first.
     * Authenticated, required scope: {@link Scopes#USER_BLOCKS_READ}
     *
     * @param user    the authenticated user
     * @param params  the optional request parameters:
     *                <ul>
     *                <li><code>limit</code>: Integer: Maximum number of objects in array. Default: 25. Maximum: 100.</li>
     *                <li><code>offset</code>:Integer: Object offset for pagination. Default: 0.</li>
     *                </ul>
     * @param handler the response handler
     */
    public void getBlocks(final String user, final RequestParams params, final BlocksResponseHandler handler) {
        String url = String.format("%s/users/%s/blocks", getBaseUrl(), getUserId(user).get(0));

        http.get(url, params, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                try {
                    Blocks value = objectMapper.readValue(content, Blocks.class);
                    handler.onSuccess(value.getBlocks());
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    /**
     * Returns a list of {@link Block} objects on <code>User</code>'s block list.
     * List sorted by recency, newest first.
     * Authenticated, required scope: {@link Scopes#USER_BLOCKS_READ}
     *
     * @param user    the authenticated user
     * @param handler the response handler
     */
    public void getBlocks(final String user, final BlocksResponseHandler handler) {
        getBlocks(user, new RequestParams(), handler);
    }

    /**
     * Blocks a user; that is, adds a specified target user to the blocks list of a specified source user.
     * <p>
     * Authenticated, required scope: {@link Scopes#USER_BLOCKS_EDIT}
     *
     * @param user    the authenticated user
     * @param target  the user to block
     * @param handler the response handler
     */
    public void putBlock(final String user, final String target, final BlockResponseHandler handler) {
        String url = String.format("%s/users/%s/blocks/%s", getBaseUrl(), getUserId(user).get(0), target);

        http.put(url, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                try {
                    Block value = objectMapper.readValue(content, Block.class);
                    handler.onSuccess(value);
                } catch (IOException e) {
                    handler.onFailure(e);
                }
            }
        });
    }

    /**
     * Removes the {@link Block} of <code>target</code> for the authenticated <code>user</code>.
     * Authenticated, required scope: {@link Scopes#USER_BLOCKS_EDIT}
     *
     * @param user    the authenticated user
     * @param target  the user to unblock
     * @param handler the response handler
     */
    public void deleteBlock(final String user, final String target, final UnblockResponseHandler handler) {
        String url = String.format("%s/users/%s/blocks/%s", getBaseUrl(), getUserId(user).get(0), target);

        http.delete(url, new TwitchHttpResponseHandler(handler) {
            @Override
            public void onSuccess(int statusCode, Map<String, List<String>> headers, String content) {
                handler.onSuccess();
            }
        });
    }

    public List<String> getUserId(final String user) {
        String url = String.format("%s/users?login=%s", getBaseUrl(), user);

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        request.addHeader("Accept", "application/vnd.twitchtv.v5+json");
        request.addHeader("Client-ID", getClientId());
        try {
            response = client.execute(request);
            GetUserId value = objectMapper.readValue(new InputStreamReader(response.getEntity().getContent()), GetUserId.class);
            List<String> uId = new CopyOnWriteArrayList<>();
            value.getUsers().forEach(userId -> uId.add(userId.getId()));
            return uId;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
