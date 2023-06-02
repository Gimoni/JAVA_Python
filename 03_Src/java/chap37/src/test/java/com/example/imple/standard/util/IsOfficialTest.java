package com.example.imple.standard.util;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.example.standard.util.Gender;
import com.example.standard.util.IsOfficial;

public class IsOfficialTest {

	@Test
	void enumToString() {
		for (var g : IsOfficial.values())
			System.out.println(g);
		
		System.out.println(IsOfficial.T);
		System.out.println(IsOfficial.F);
	}
	
	@Test
	void stringToEnum() {
		IsOfficial g1 = IsOfficial.valueOf("T");
		IsOfficial g2 = IsOfficial.valueOf("F");
		
		assertThrows(IllegalArgumentException.class, () -> {
			IsOfficial g3 = IsOfficial.valueOf("A");
		});
			
	}
}
