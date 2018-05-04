
package com.urgrue.twitch.api.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.urgrue.twitch.api.models.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "global_mod",
    "admin",
    "broadcaster",
    "mod",
    "staff",
    "turbo",
    "subscriber"
})
public class ChannelBadges {

    @JsonProperty("global_mod")
    private GlobalMod globalMod;
    @JsonProperty("admin")
    private Admin admin;
    @JsonProperty("broadcaster")
    private Broadcaster broadcaster;
    @JsonProperty("mod")
    private Mod mod;
    @JsonProperty("staff")
    private Staff staff;
    @JsonProperty("turbo")
    private Turbo turbo;
    @JsonProperty("subscriber")
    private Subscriber subscriber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ChannelBadges() {
    }

    /**
     * 
     * @param staff
     * @param admin
     * @param mod
     * @param broadcaster
     * @param globalMod
     * @param subscriber
     * @param turbo
     */
    public ChannelBadges(GlobalMod globalMod, Admin admin, Broadcaster broadcaster, Mod mod, Staff staff, Turbo turbo, Subscriber subscriber) {
        super();
        this.globalMod = globalMod;
        this.admin = admin;
        this.broadcaster = broadcaster;
        this.mod = mod;
        this.staff = staff;
        this.turbo = turbo;
        this.subscriber = subscriber;
    }

    @JsonProperty("global_mod")
    public GlobalMod getGlobalMod() {
        return globalMod;
    }

    @JsonProperty("global_mod")
    public void setGlobalMod(GlobalMod globalMod) {
        this.globalMod = globalMod;
    }

    @JsonProperty("admin")
    public Admin getAdmin() {
        return admin;
    }

    @JsonProperty("admin")
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    @JsonProperty("broadcaster")
    public Broadcaster getBroadcaster() {
        return broadcaster;
    }

    @JsonProperty("broadcaster")
    public void setBroadcaster(Broadcaster broadcaster) {
        this.broadcaster = broadcaster;
    }

    @JsonProperty("mod")
    public Mod getMod() {
        return mod;
    }

    @JsonProperty("mod")
    public void setMod(Mod mod) {
        this.mod = mod;
    }

    @JsonProperty("staff")
    public Staff getStaff() {
        return staff;
    }

    @JsonProperty("staff")
    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    @JsonProperty("turbo")
    public Turbo getTurbo() {
        return turbo;
    }

    @JsonProperty("turbo")
    public void setTurbo(Turbo turbo) {
        this.turbo = turbo;
    }

    @JsonProperty("subscriber")
    public Subscriber getSubscriber() {
        return subscriber;
    }

    @JsonProperty("subscriber")
    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
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
        return new HashCodeBuilder().append(globalMod).append(admin).append(broadcaster).append(mod).append(staff).append(turbo).append(subscriber).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelBadges) == false) {
            return false;
        }
        ChannelBadges rhs = ((ChannelBadges) other);
        return new EqualsBuilder().append(globalMod, rhs.globalMod).append(admin, rhs.admin).append(broadcaster, rhs.broadcaster).append(mod, rhs.mod).append(staff, rhs.staff).append(turbo, rhs.turbo).append(subscriber, rhs.subscriber).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
