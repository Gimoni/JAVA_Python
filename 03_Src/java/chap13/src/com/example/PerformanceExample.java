package com.example;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceExample {

	static class ListPerformance {
		int size;
		List<Integer> list;
		
		ListPerformance(int size, List<Integer> list) {
			this.size = size;
			this.list = list;
		}
		
		void create() {
			LocalTime start = LocalTime.now();
			for(int i=0; i<size; i++) {
				list.add(0, i); 
			}
			LocalTime end = LocalTime.now();
			
			String name = list.getClass().getName().substring(10);
			long elapse = start.until(end, ChronoUnit.MILLIS);
			
			String operator = "Create(add)";
			
			System.out.printf("%10s %-20s %5d건 : %5dms\n", name, operator, size, elapse);
		}
		
		void retrieve() {
			LocalTime start = LocalTime.now();
			for(int i=0; i<size; i++) {
				list.get(i); 
			}
			LocalTime end = LocalTime.now();
			
			String name = list.getClass().getName().substring(10);
			long elapse = start.until(end, ChronoUnit.MILLIS);
			
			String operator = "Retrieve(get)";
			
			System.out.printf("%10s %-20s %5d건 : %5dms\n", name, operator, size, elapse);
		}
		
		void update() {
			LocalTime start = LocalTime.now();
			for(int i=0; i<size; i++) {
				list.set(i, list.get(i)*10); 
			}
			LocalTime end = LocalTime.now();
			
			String name = list.getClass().getName().substring(10);
			long elapse = start.until(end, ChronoUnit.MILLIS);
			
			String operator = "Update(set)";
			System.out.printf("%10s %-20s %5d건 : %5dms\n", name, operator, size, elapse);
		}
		
		void delete() {
			LocalTime start = LocalTime.now();
			for(int i=0; i<size; i++) {
				list.remove(0); 
			}
			LocalTime end = LocalTime.now();
			
			String name = list.getClass().getName().substring(10);
			long elapse = start.until(end, ChronoUnit.MILLIS);
			
			String operator = "Delete(remove)";
			System.out.printf("%10s %-20s %5d건 : %5dms\n", name, operator, size, elapse);
		}
	}
	
	public static void main(String[] args) {
//		ListPerformance<Integer> a = 
//				new ListPerformance<>(500000, new ArrayList<Integer>());
		var a =  new ListPerformance(50000, new ArrayList<Integer>());
		var b =  new ListPerformance(50000, new LinkedList<Integer>());

		a.create();
		b.create();
		
		a.retrieve();
		b.retrieve();
		
		a.update();
		b.update();
		
		a.delete();
		b.delete();
	}

}
