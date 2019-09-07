package com.example.football.gateway;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.football.model.CountryLeagueResponse;
import com.example.football.model.CountryResponse;
import com.example.football.model.StandingsSet;

@Component
public class APIGateway {

	private static final String baseUrl = "https://apiv2.apifootball.com/";
	private static final String action_standings = "?action=get_standings&league_id=";
	private static final String url_api_key = "&APIkey=";
	private static final String apiKey = "9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978";
	private static final String action_getLeagues = "?action=get_leagues&country_id=";
	private static final String action_getCountries = "?action=get_countries";

	public StandingsSet getStandings(int leagueId) {

		RestTemplate restTemplate = new RestTemplate();

		StandingsSet standings = restTemplate.getForObject(baseUrl+action_standings+leagueId+url_api_key+apiKey, StandingsSet.class);

		return standings;

	}


	public CountryLeagueResponse getLeagues(int countryId) {

		RestTemplate restTemplate = new RestTemplate();

		CountryLeagueResponse leagues = restTemplate.getForObject(baseUrl+action_getLeagues+countryId+url_api_key+apiKey, CountryLeagueResponse.class);

		return leagues ;
	}

	public CountryResponse getCountries() {

		RestTemplate restTemplate = new RestTemplate();

		CountryResponse countries = restTemplate.getForObject(baseUrl+action_getCountries+url_api_key+apiKey, CountryResponse.class);

		return countries ;
	}

}
