package com.urgrue.twitch.api.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_total",
    "subscriptions"
})
public class ChannelSubscriptions {

    @JsonProperty("_total")
    private Integer total;
    @JsonProperty("subscriptions")
    private List<Subscription> subscriptions = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public ChannelSubscriptions() {
    }

    /**
     *
     * @param total
     * @param subscriptions
     */
    public ChannelSubscriptions(Integer total, List<Subscription> subscriptions) {
        super();
        this.total = total;
        this.subscriptions = subscriptions;
    }

    @JsonProperty("_total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("_total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("subscriptions")
    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    @JsonProperty("subscriptions")
    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(total).append(subscriptions).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelSubscriptions) == false) {
            return false;
        }
        ChannelSubscriptions rhs = ((ChannelSubscriptions) other);
        return new EqualsBuilder().append(total, rhs.total).append(subscriptions, rhs.subscriptions).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
