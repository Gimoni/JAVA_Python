package com.example.imple.city.mapper;

import java.io.IOException;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.UncategorizedSQLException;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.example.imple.city.mapper.CityMapper;
import com.example.imple.dept.model.Dept;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@SpringBootTest
public class CityMapperTest {
	
	@Autowired
	CityMapper cityMapper;
	
	@Autowired
	ObjectMapper objectMapper;
	
	@Test
	void countAll() {
		var cnt = cityMapper.countAll();
		System.out.println(cnt);
	}
	
	@Test
	void selectAll() throws IOException {
		var list = cityMapper.selectAll();
		assertThat(list.size()).isEqualTo(4079);
	}
	
	@Test
	void selectAllWithCountry() throws IOException {
		var list = cityMapper.selectAllWithCountry();
		assertThat(list.size()).isEqualTo(4079);
		
		assertThat(list).allSatisfy(e -> {
			assertThat(e.getCountry()).isNotNull();
		});
	}
	
	@Test
	void selectPage() throws IOException {
		PageHelper.startPage(50, 5);
		var list = cityMapper.selectPage();
		System.out.println(list.size());
		assertThat(list.size()).isEqualTo(5);
		
		var paging = PageInfo.of(list, 20);
		System.out.println(paging);
		paging.getTotal();
		paging.getList();
		paging.getPageNum();
		paging.getSize();
		paging.getStartRow();
		paging.getEndRow();
		paging.getPages();
		paging.getPrePage();
		paging.getNextPage();
		paging.isIsFirstPage();
		paging.isIsLastPage();
		paging.isHasPreviousPage();
		paging.isHasNextPage();
		
		
		objectMapper.createGenerator(System.out)
					.useDefaultPrettyPrinter()
					.writeObject(paging);
	}
	
	@Test
	void selectPageWithCountry() throws IOException {
		PageHelper.startPage(1000, 5);
		var list = cityMapper.selectPageWithCountry();
//		assertThat(list.size()).isEqualTo(5);
		
		assertThat(list).allSatisfy(e -> {
			assertThat(e.getCountry()).isNotNull();
		});
		
		var paging = PageInfo.of(list, 10);
		
		objectMapper.createGenerator(System.out)
					.writeObject(paging);
		
		assertThat(paging).satisfies( e -> {
			assertThat(e.getTotal()).isEqualTo(4079);
//			assertThat(e.getList().size()).isEqualTo(5);
			long pages = e.getTotal()/5 + (e.getTotal()%5!=0 ? 1 : 0);
			assertThat(e.getPages()).isEqualTo(pages);
		});
		
	}
	
	
	@Test
	void selectById() {
		var city = cityMapper.selectById(10);
		System.out.println(city);
		assertEquals(10, city.getId());
	}
	
	@Test
	void selectByIdWithCountry() throws IOException {
		var city = cityMapper.selectByIdWithCountry(1000);
		assertEquals(1000, city.getId());
		
		objectMapper.createGenerator(System.out)
					.writeObject(city);
	}
	
	@Test
	void selectByCountryCode() throws IOException {
		var list = cityMapper.selectByCountryCode("KOR");
		System.out.println(list);
		
		objectMapper.createGenerator(System.out)
					.useDefaultPrettyPrinter()
					.writeObject(list);
	}
//	
//	@Test
//	@Transactional
////	@Rollback(false)
//	void insert() {
//		deptMapper.insert(50, "개발부", "부산");
//		System.out.println(deptMapper.selectByDeptno(50));
//		
//		deptMapper.insert(60, "개발2부", null);
//		System.out.println(deptMapper.selectByDeptno(60));
//		
//		try {
//			deptMapper.insert(50, "개발3부", "서울");
//		} catch (DuplicateKeyException e) {
//			System.out.println("50번 부서는 사용할 수 없습니다.");
//		}
//		
//		try {
//			deptMapper.insert(70, null, null);
//		} catch (DataIntegrityViolationException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		assertThrows(DataIntegrityViolationException.class, () -> {
//			deptMapper.insert(100, "총무부", null);
//		});
//		
//	}
//	
//	@Test
//	@Transactional
//	void insertDept() throws IOException {
//		var dept = new Dept(50, "개발1부", "서울");
//		int cnt = deptMapper.insertDept(dept);
//		assertThat(cnt).isEqualTo(1);
//		
//		dept = new Dept(60, "개발2부", null);
//		cnt = deptMapper.insertDept(dept);
//		assertThat(cnt).isEqualTo(1);
//		
//		assertThrows(DuplicateKeyException.class, () -> {
//			deptMapper.insertDept(new Dept(60, "개발3부", null));
//		});
//		
//		assertThrows(DataIntegrityViolationException.class, () -> {
//			deptMapper.insertDept(new Dept(60, null, null));
//		});
//		
//		assertThrows(DataIntegrityViolationException.class, () -> {
//			deptMapper.insertDept(new Dept(200, "개발4부", null));
//		});
//		
//		objectMapper.createGenerator(System.out)
//					.useDefaultPrettyPrinter()
//					.writeObject(deptMapper.selectAll());
//	}
//	
//	@Test
//	@Transactional
//	void update() throws IOException {
//		int cnt = deptMapper.update(10, "xxx", "yyy");
//		assertThat(cnt).isEqualTo(1);
//		
//		cnt = deptMapper.update(50, "xxx", "yyy");
//		assertThat(cnt).isEqualTo(0);
//		
//		assertThrows(DataIntegrityViolationException.class, () -> {
//			try {
//				deptMapper.update(20, null, "서울");
//			} catch (UncategorizedSQLException e) {
//				throw new DataIntegrityViolationException(e.getMessage());
//			}
//		});
//		
//		cnt = deptMapper.update(100, "개발4부", "부산");
//		assertThat(cnt).isEqualTo(0);
//		
//		cnt = deptMapper.update(30, "개발4부", null);
//		assertThat(cnt).isEqualTo(1);
//		
//		objectMapper.createGenerator(System.out)
//					.useDefaultPrettyPrinter()
//					.writeObject(deptMapper.selectAll());
//	}
//	
//	@Test
//	@Transactional
//	void updateDept() {
//		
//	}
//	
//	@Test
//	@Transactional
//	void delete() throws IOException {
//		int cnt = deptMapper.delete(90);
//		assertThat(cnt).isEqualTo(0);
//		
//		cnt = deptMapper.delete(40);
//		assertThat(cnt).isEqualTo(1);
//		
//		assertThrows(DataIntegrityViolationException.class, ()->{
//			deptMapper.delete(10);
//		});
//		
//		objectMapper.createGenerator(System.out)
//					.useDefaultPrettyPrinter()
//					.writeObject(deptMapper.selectAll());
//	}
//	
//	

}
