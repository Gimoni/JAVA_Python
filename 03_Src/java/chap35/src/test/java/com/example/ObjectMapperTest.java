package com.example;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.model.Dept;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ObjectMapperTest {

	static ObjectMapper objectMapper;
	
	@BeforeAll
	static void beforeAll() {
		objectMapper = new ObjectMapper();
	}
	
	@BeforeEach
	void beforeEach() {
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		
	}
	
	String json(Object obj) {
		String str = null;
		try {
			str =  objectMapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return str;
	}
	
	@Test
	void writeInt() {
		int num = 100;
		System.out.println(num);
		System.out.println(json(num));
		
		int[] nums = {1, 2, 3, 4};
		System.out.println(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println(json(nums));
	}
	
	@Test
	void writeBean() {
		var dept = new Dept();
		dept.setDeptno(10);
		dept.setDname("개발부");
		dept.setLoc("서울");
		
		System.out.println(dept);
		System.out.println(json(dept));
	}
	
	@Test
	void writeMap() {
		var env = System.getenv(); 		// 환경변수 가져옴
		System.out.println(env);
		System.out.println(json(env));
	}
}
