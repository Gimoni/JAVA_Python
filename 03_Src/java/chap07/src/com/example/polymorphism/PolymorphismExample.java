package com.example.polymorphism;

public class PolymorphismExample {

	static class Vehicle {
		
		void drive () {
			System.out.println("드라이브 한다");
		}
	}
	
	static class Car extends Vehicle {
		
		void drive() {
			System.out.println("자동차가 달립니다");
		}
		
	}
	static class Truck extends Vehicle {
		
		void drive() {
			System.out.println("트럭이 달립니다");
		}
	}
	static class Motorcycle extends Vehicle {
		
		void drive() {
			System.out.println("오토바이가 달립니다");
		}
	}
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		Vehicle v2 = new Truck();
		Vehicle v3 = new Motorcycle();
		
//		v1.drive();
//		v2.drive();
//		v3.drive();
		
		run(v1);
		run(v2);
		run(v3);
	}
	
	static void run (Vehicle v) {	// 매개변수의 다형성
		v.drive();
		
		System.out.println(v instanceof Car);
	}

}
