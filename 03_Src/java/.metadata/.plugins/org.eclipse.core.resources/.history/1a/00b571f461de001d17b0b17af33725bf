package com.example;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.function.Consumer;

import util.Alpha;

public class AlphaSortExample2 {

	public static void main(String[] args) {
		var al = new ArrayList<Alpha>();
		var ll = new LinkedList<Alpha>();
		
		for(int i=0; i<5000000; i++) {
			var alpha = new Alpha();
			al.add(alpha);
			ll.add(alpha);
		}
		
		System.out.println(al.size());
		System.out.println(ll.size());
		
		Comparator<Alpha> comp = (a, b) -> {
				int rtn= a.getLine() - b.getLine();
				
				if (rtn==0)
					rtn = a.getColumn() - b.getColumn();
				return rtn;
		};
		
		var start = LocalTime.now();
		al.sort(comp);
		var end = LocalTime.now();
		System.out.println(start.until(end, ChronoUnit.MILLIS));
		
		start = LocalTime.now();
		ll.sort(comp);
		end = LocalTime.now();
		System.out.println(start.until(end, ChronoUnit.MILLIS));
		
	}
}
