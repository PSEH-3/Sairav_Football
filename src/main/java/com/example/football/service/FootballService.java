package com.example.football.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.football.FootballApplication;
import com.example.football.gateway.APIGateway;
import com.example.football.model.CountryLeagueResponse;
import com.example.football.model.CountryResponse;
import com.example.football.model.StandingsSet;

@Service
public class FootballService {

	@Autowired
	APIGateway apiGateway ;
	
	public StandingsSet getStandings(String countryName,String leagueName,String teamName) {
		
		CountryResponse countries = apiGateway.getCountries();
		
		countries.getCountries().forEach(country->{
			FootballApplication.countryNameId.put(country.getCountryName(), country.getCountryId());
		});
		
		int countryId = FootballApplication.countryNameId.get(countryName);
		
		CountryLeagueResponse leagues = apiGateway.getLeagues(countryId);
		
		leagues.getLeagues().forEach(league->{
			FootballApplication.leagueNameId.put(league.getLeague_name(), league.getLeague_id());
		});
		
		int leagueId = FootballApplication.leagueNameId.get(leagueName) ;
		
		StandingsSet standings = apiGateway.getStandings(leagueId);
		return standings;	
	}
	
}
