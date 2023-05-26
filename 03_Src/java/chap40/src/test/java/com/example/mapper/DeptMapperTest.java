package com.example.mapper;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Dept;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
public class DeptMapperTest {

	@Autowired
	DeptMapper deptMapper;
	
	@Autowired 
	ObjectMapper objectMapper;
	
	@Test
	void selectAll() throws IOException {
		var list = deptMapper.selectAll();
		
		System.out.println(list);
		objectMapper.createGenerator(System.out)
					.useDefaultPrettyPrinter()
					.writeObject(list);
	}
	
	@Test
	void selectDeptno() {
		var dept = deptMapper.selectByDeptno(10);
		System.out.println(dept);
		assertSame(10, dept.getDeptno());
		
		dept = deptMapper.selectByDeptno(90);
		System.out.println(dept);
		assertNull(dept);
	}
	
	@Test
	@Transactional
	void insert() {
		deptMapper.insert(50, "개발부","부산");
		System.out.println(deptMapper.selectByDeptno(50));
		
		deptMapper.insert(60, "개발2부", null);
		System.out.println(deptMapper.selectByDeptno(60));
		
		try {
			deptMapper.insert(50, "개발3부", "서울");
		} catch (Exception e) {
			System.out.println("50번 부서는 사용할 수 없습니다. 이미 사용중. ");
		}
		
		try {
			deptMapper.insert(70, null, null);			
		} catch (DataIntegrityViolationException e) {
			System.out.println(e.getMessage());
		}
		
		assertThrows(DataIntegrityViolationException.class, () ->{
			deptMapper.insert(100, "총무부", null);
		});
	}
	
	@Test
	@Transactional
	void insertDept() throws IOException {
		var dept = new Dept(50,"개발1부", "경기");
		int cnt = deptMapper.insertDept(dept);
		assertThat(cnt).isEqualTo(1);

		dept = new Dept(60, "개발2부", null);
		cnt = deptMapper.insertDept(dept);
		assertThat(cnt).isEqualTo(1);
		
		assertThrows(DuplicateKeyException.class, ()-> {
			deptMapper.insertDept(new Dept(60, "개발3부", null));
		}); // 개발3부가 이미 존재하기 때문에 DuplicateKeyException이 발생할 것이라는 것을 테스트에 작성.
		
		assertThrows(DataIntegrityViolationException.class, ()->{
			deptMapper.insertDept(new Dept(60, null, null));			
		});	// null이 들어갈 수 없는 DataIntegrityViolationException을 확신하는 테스트.
		
		assertThrows(DataIntegrityViolationException.class, () ->{
			deptMapper.insertDept(new Dept(100, "개발부", null));
		}); // deptno는 2자리 수로 작성되게 설정이 되어 있기때문에 100이라는 넘버는 올수 없다 
		// 따라서 DataIntegrityViolationExecption 발생을 확신하는 코드 작성으로 테스트 성공시킨다.
		
		objectMapper.createGenerator(System.out)
					.useDefaultPrettyPrinter()
					.writeObject(cnt);
		
		
	}
	
	@Test
	@Transactional
	void updateDept() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
