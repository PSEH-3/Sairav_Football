package com.example.football.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.football.FootballApplication;
import com.example.football.gateway.APIGateway;
import com.example.football.model.CountryDetails;
import com.example.football.model.CountryLeagueResponse;
import com.example.football.model.StandingsSet;

@Service
public class FootballService {

	@Autowired
	APIGateway apiGateway ;
	
	public StandingsSet getStandings(String countryName,String leagueName,String teamName) {
		
		List<CountryDetails> countries = apiGateway.getCountries();
		
		System.out.println(countries);
		
		
		countries.forEach(country->{
			FootballApplication.countryNameId.put(country.getCountry_name(), country.getCountry_id());
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
