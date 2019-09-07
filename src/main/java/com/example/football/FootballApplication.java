package com.example.football;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.example.football")
@SpringBootApplication
public class FootballApplication {
	
	public static Map<String,Integer> countryNameId = new HashMap<>();
	public static Map<String,Integer> leagueNameId = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(FootballApplication.class, args);
	}

}
