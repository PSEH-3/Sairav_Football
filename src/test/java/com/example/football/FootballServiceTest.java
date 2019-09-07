package com.example.football;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.football.gateway.APIGateway;
import com.example.football.model.Standings;
import com.example.football.model.StandingsSet;

@SpringBootTest
public class FootballServiceTest {

	@Mock
	APIGateway apiGateway ;
	
	@Test
	public void getStandings() {
		
		StandingsSet ss = new StandingsSet();
		
		Standings s= new Standings();
		s.setTeamId("1");
		s.setTeamName("Barcelona");
		s.setCountryName("Spain");
		s.setCountryName("32");
		s.setLeagueId("3");
		s.setLeagueName("EUFA");
		
		Set<Standings> set = new HashSet<Standings>();
		set.add(s);
		ss.setStandings(set);
		
		assertEquals(ss, apiGateway.getStandings(3));
	}
	
}
