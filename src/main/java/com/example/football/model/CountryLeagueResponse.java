package com.example.football.model;

import java.util.HashSet;
import java.util.Set;

public class CountryLeagueResponse {

	private Set<CountryLeagueInfo> leagues = new HashSet<>();

	public Set<CountryLeagueInfo> getLeagues() {
		return leagues;
	}

	public void setLeagues(Set<CountryLeagueInfo> leagues) {
		this.leagues = leagues;
	}

	
}
