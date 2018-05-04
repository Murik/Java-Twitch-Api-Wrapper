package com.urgrue.twitch.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Teams {

    private List<Team> teams = new ArrayList<Team>();

    @Override
    public String toString() {
        return "Teams{" +
                "teams=" + teams +
                '}';
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }


}
