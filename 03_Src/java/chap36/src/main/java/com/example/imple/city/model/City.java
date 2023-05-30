package com.example.imple.city.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {
	long id;
	String name;
	String countryCode;
	String district;
	long population;
	
}
