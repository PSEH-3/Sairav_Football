package com.example.football.model;

public class StandingsResponse {

	private int countryId ;
	private String countryName ;
	private int leagueId ;
	private String leagueName ;
	private String teamId ;
	private String teamName ;
	private String overallLeaguePosition ;
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getLeagueId() {
		return leagueId;
	}
	public void setLeagueId(int leagueId) {
		this.leagueId = leagueId;
	}
	public String getLeagueName() {
		return leagueName;
	}
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	
	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getOverallLeaguePosition() {
		return overallLeaguePosition;
	}
	public void setOverallLeaguePosition(String overallLeaguePosition) {
		this.overallLeaguePosition = overallLeaguePosition;
	}
	
	
	
}
