package com.example.imple.language.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import lombok.var;

@SpringBootTest
public class LanguageMapperTest {

	@Autowired
	LanguageMapper languageMapper;
	
	@Autowired
	ObjectMapper objectMapper;
	
	@Test
	void countAll() {
		int cnt = languageMapper.countAll();
		System.out.println("cnt = " + cnt);
		assertThat(cnt).isEqualTo(984);
	}
	
	@Test
	void selectAll() {
		var list = languageMapper.selectAll();	
	}

	@Test
	void selectPage() throws IOException {
		PageHelper.startPage(50, 5);
		var list = languageMapper.selectPage();
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
	
}
