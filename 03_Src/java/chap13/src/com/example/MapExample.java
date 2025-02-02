package com.example;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		var map = System.getenv();

		// 내부방법 (for문이 감춰짐) 
		map.forEach((k,v) -> System.out.printf("%s=%s\n", k, v));
	}
	
	public static void main3(String[] args) {
		System.currentTimeMillis();
		System.out.println();
		System.gc();		// Garbage collector
		
		var env = System.getenv();
		
		// 향상된 for문엔 Array, list, set 다 오지만 map은 그냥 올수 없기에 
		// entryset 메소드를 사용해서 set으로 변환해주어야 함. 
//		for (Entry<String, String> e : env.entrySet()) {
//			System.out.printf("%s=%s\n", e.getKey(), e.getValue());
//		}
		
		// key
//		for (String key : env.keySet()) {
//			System.out.printf("%s=%s\n", key, env.get(key));
//		}
		
//		for (String value: env.values())
//			System.out.println(value);
		
		System.out.println(env.get("java_home".toUpperCase()));
		System.out.println(env.containsKey("classpath".toUpperCase()));
		
	}
	
	public static void main2(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("java", 50000);
		map.put("python", 30000);
		map.put("html", 20000);
		
		System.out.println(map.get("html"));
		System.out.println(map.size());
		
		System.out.println(map.remove("python"));
		map.put("java", 40000);
		
		System.out.println(map);
		
		
	}

}
