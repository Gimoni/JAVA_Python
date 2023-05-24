package com.example.mapper;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class DeptMapperTest {
	
	@Autowired
	DeptMapper deptMapper;
	
	@Test
	void json() throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		
		
		int[] nums = {1, 2, 3, 4};
		String str = objectMapper.writeValueAsString(nums);
		System.out.println(str);
		
		var list = new ArrayList<Integer>();
		list.add(5);
		list.add(6);
		
		System.out.println(objectMapper.writeValueAsString(list));
		
		var map = new HashMap<String, String>();
		map.put("java", "자바");
		map.put("python", "파이썬");
		
		System.out.println(objectMapper.writeValueAsString(map));
		
		var dept = deptMapper.selectByDept(10);
		
		System.out.println(objectMapper.writeValueAsString(dept));
		
		var depts = deptMapper.selectAll();
		System.out.println(depts);
		System.out.println(objectMapper.writeValueAsString(depts));
		
	}

	@Test
	void selectAll() {
		var list = deptMapper.selectAll();
		System.out.println(list);
		
		assertNotNull(list);
		assertSame(4, list.size());
		
		assertThat(list).isNotNull();
		assertThat(list).isNotEmpty();
		assertThat(list.size()).isEqualTo(4);
	}
	
	@Test
	void selectByDept() {
		var dept = deptMapper.selectByDept(70);
		System.out.println(dept);
		
		assertNull(dept);
		assertThat(dept).isNull();

	}

}
