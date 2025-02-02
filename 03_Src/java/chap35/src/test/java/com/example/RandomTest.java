package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Random;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RandomTest {
	
	Random r;
	
	@BeforeEach
	void before() {
		System.out.println("## @BeforeEach");
		// test case 수행 이전 
		r = new Random();
	}
	
	@AfterEach
	void after() {
		System.out.println("## @AfterEach");
		// test case 수행 이후 
	}
	
	@Test
	void random() {
		for(int i=0; i<100; i++) {
			int value = r.nextInt(30, 38);
			System.out.println(value);
			assertThat(value).isBetween(30, 37);
			assertThat(value).isNotEqualTo(38);
		}
	}
	
	@Test
	void random2() {
		System.out.println("random2()...");
	}
}
