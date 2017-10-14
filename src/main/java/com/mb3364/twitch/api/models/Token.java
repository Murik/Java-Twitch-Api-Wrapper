package com.mb3364.twitch.api.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "authorization",
        "client_id",
        "user_id",
        "user_name",
        "valid"
})
public class Token {

    @JsonProperty("authorization")
    private TokenAuthorization authorization;
    @JsonProperty("client_id")
    private String clientId;
    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("user_name")
    private String userName;
    @JsonProperty("valid")
    private boolean valid;

    /**
     * No args constructor for use in serialization
     */
    public Token() {
    }

    /**
     * @param authorization
     * @param clientId
     * @param userId
     * @param userName
     * @param valid
     */
    public Token(TokenAuthorization authorization, String clientId, String userId, String userName, boolean valid) {
        this.authorization = authorization;
        this.clientId = clientId;
        this.userId = userId;
        this.userName = userName;
        this.valid = valid;
    }

    public TokenAuthorization getAuthorization() {
        return authorization;
    }

    public void setAuthorization(TokenAuthorization authorization) {
        this.authorization = authorization;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(authorization)
                .append(clientId)
                .append(userId)
                .append(userName)
                .append(valid)
                .toHashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Token token = (Token) o;

        return new EqualsBuilder()
                .append(valid, token.valid)
                .append(authorization, token.authorization)
                .append(clientId, token.clientId)
                .append(userId, token.userId)
                .append(userName, token.userName)
                .isEquals();
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}
