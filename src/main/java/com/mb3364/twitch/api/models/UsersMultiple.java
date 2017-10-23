package com.mb3364.twitch.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Java-Twitch-Api-Wrapper
 *
 * @author Maxim Kulikov
 * @since 23.10.2017
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "_total",
        "users"
})
public class UsersMultiple {
    @JsonProperty("_total")
    private int total;
    @JsonProperty("users")
    private List<UserOnChannel> users;

    public UsersMultiple() {
    }

    public UsersMultiple(int total, List<UserOnChannel> users) {
        this.total = total;
        this.users = users;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<UserOnChannel> getUsers() {
        return users;
    }

    public void setUsers(List<UserOnChannel> users) {
        this.users = users;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(total)
                .append(users)
                .toHashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof UsersMultiple)) return false;

        UsersMultiple that = (UsersMultiple) o;

        return new EqualsBuilder()
                .append(total, that.total)
                .append(users, that.users)
                .isEquals();
    }
}
