package com.example.standard.util;

import lombok.Getter;

public enum Continent {
	//'Asia','Europe','North America','Africa','Oceania','Antarctica','South America'
	Asia("Asia"),
	Europe("Europe"),
	NorthAmerica("North America"),
	Africa("Africa"),
	Oceania("Oceania"),
	Antarctica("Antarctica"),
	SouthAmerica("South America");
	
	@Getter
	String symbol;
	
	private Continent(String symbol) {
		this.symbol = symbol;
	}
}
