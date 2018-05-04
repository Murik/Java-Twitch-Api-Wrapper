package com.urgrue.twitch.api.handlers;

import java.util.List;
import com.urgrue.twitch.api.models.FollowUsers;

public interface ChannelFollowsResponseHandler extends BaseFailureHandler {
    void onSuccess(int total, List<FollowUsers> follows, String cursor);
}
