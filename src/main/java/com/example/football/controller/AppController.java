package com.example.football.controller;



import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.football.FootballApplication;
import com.example.football.model.StandingsResponse;
import com.example.football.model.StandingsSet;
import com.example.football.service.FootballService;

@Controller
@RequestMapping("football")
public class AppController {

	@Autowired
	FootballService footballService ;
		
	@RequestMapping(value="/standings",method= RequestMethod.GET)
	public StandingsResponse getStandings(@RequestParam("countryName") String countryName,
			@RequestParam("leagueName") String leagueName , @RequestParam("teamName") String teamName) {
		
		StandingsSet standings = footballService.getStandings(countryName, leagueName, teamName);
		StandingsResponse sr = new StandingsResponse();
		standings.getStandings().forEach(standing->{
			if(standing.getCountryName().equals(countryName)
					&& standing.getLeagueName().equals(leagueName)
					&& standing.getTeamName().equals(teamName)) {
				sr.setCountryId(FootballApplication.countryNameId.get(countryName));
				sr.setCountryName(countryName);
				sr.setLeagueId(FootballApplication.leagueNameId.get(leagueName));
				sr.setLeagueName(leagueName);
				sr.setTeamId(standing.getTeamId());
				sr.setTeamName(teamName);
				sr.setOverallLeaguePosition(standing.getOverallLeaguePosition());
				
			}
		});
		return sr ;
	}
}
