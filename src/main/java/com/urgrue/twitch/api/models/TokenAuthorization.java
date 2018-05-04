package com.urgrue.twitch.api.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.urgrue.twitch.api.auth.Scopes;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "created_at",
        "scopes",
        "updated_at"

})
public class TokenAuthorization {


    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("scopes")
    private List<Scopes> scopes;
    @JsonProperty("updated_at")
    private Date updatedAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public List<Scopes> getScopes() {
        return scopes;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = new ArrayList<>();
        for (String s : scopes) {
            this.scopes.add(Scopes.fromString(s));
        }
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(createdAt)
                .append(updatedAt)
                .toHashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        TokenAuthorization that = (TokenAuthorization) o;

        return new EqualsBuilder()
                .append(createdAt, that.createdAt)
                .append(scopes, that.scopes)
                .append(updatedAt, that.updatedAt)
                .isEquals();
    }
}
