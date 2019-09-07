package com.example.football.model;

import java.util.HashSet;
import java.util.Set;

public class CountryResponse {

	private Set<CountryDetails> countries = new HashSet<>();

	public Set<CountryDetails> getCountries() {
		return countries;
	}

	public void setCountries(Set<CountryDetails> countries) {
		this.countries = countries;
	}
	
}
