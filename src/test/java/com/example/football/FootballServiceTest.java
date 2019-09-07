package com.example.football;

import org.junit.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.football.gateway.APIGateway;
import com.example.football.model.StandingsSet;

@SpringBootTest
public class FootballServiceTest {

	@Mock
	APIGateway apiGateway ;
	
	@Test
	public StandingsSet getStandings(String cname , String lname , String tname ) {
		
		
		return null ;
	}
	
}
