package com.example;

import org.junit.Assert; // JUnit4
import static org.junit.jupiter.api.Assertions.*;	//JUnit5
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Random3Test {

	@Test
	void random() {
		for (int i=0; i<100000; i++) {
			double value = Math.random();
			assertTrue(value>=0);
			assertTrue(value< 1); // 단정문 assert
			Assert.assertTrue(value>=0);
			Assert.assertTrue(value<1);
		}
	}
	
	@Test
	void random2() {
		for(int i=0; i<10000; i++) {
			int value = (int)(Math.random()*6 + 1);
			assertTrue(value>=1 && value<=6);
			assertFalse(value<=0 || value>6);
		}
	}
	
	@Test
	void random3() {
		Random r = new Random();
		for(int i=0; i<100; i++) {
			int value = r.nextInt();
			assertTrue(value > -Integer.MIN_VALUE);
			assertTrue(value <= Integer.MAX_VALUE);
		}
	}
	
	@Test
	void random4() {
		Random r = new Random();
		for(int i=0; i<10000; i++) {
			int value = r.nextInt(10);
			System.out.println(value);
			assertTrue(value >= 0 && value < 10);
			
			assertThat(value, not(10));
		}
	}
}
