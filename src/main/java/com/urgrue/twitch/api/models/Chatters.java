package com.urgrue.twitch.api.models;

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
        "moderators",
        "staff",
        "admins",
        "global_mods",
        "viewers"
})
public class Chatters {

    @JsonProperty("moderators")
    private List<String> moderators;
    @JsonProperty("staff")
    private List<String> staff;
    @JsonProperty("admins")
    private List<String> admins;
    @JsonProperty("global_mods")
    private List<String> globalMods;
    @JsonProperty("viewers")
    private List<String> viewers;

    public Chatters() {
    }

    public Chatters(List<String> moderators, List<String> staff, List<String> admins, List<String> globalMods, List<String> viewers) {
        this.moderators = moderators;
        this.staff = staff;
        this.admins = admins;
        this.globalMods = globalMods;
        this.viewers = viewers;
    }

    public List<String> getAdmins() {
        return admins;
    }

    public void setAdmins(List<String> admins) {
        this.admins = admins;
    }

    public List<String> getGlobalMods() {
        return globalMods;
    }

    public void setGlobalMods(List<String> globalMods) {
        this.globalMods = globalMods;
    }

    public List<String> getModerators() {
        return moderators;
    }

    public void setModerators(List<String> moderators) {
        this.moderators = moderators;
    }

    public List<String> getStaff() {
        return staff;
    }

    public void setStaff(List<String> staff) {
        this.staff = staff;
    }

    public List<String> getViewers() {
        return viewers;
    }

    public void setViewers(List<String> viewers) {
        this.viewers = viewers;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(moderators)
                .append(staff)
                .append(admins)
                .append(globalMods)
                .append(viewers)
                .toHashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Chatters)) return false;

        Chatters chatters = (Chatters) o;

        return new EqualsBuilder()
                .append(moderators, chatters.moderators)
                .append(staff, chatters.staff)
                .append(admins, chatters.admins)
                .append(globalMods, chatters.globalMods)
                .append(viewers, chatters.viewers)
                .isEquals();
    }
}
