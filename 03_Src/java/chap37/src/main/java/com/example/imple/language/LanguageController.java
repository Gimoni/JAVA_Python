package com.example.imple.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.imple.language.mapper.LanguageMapper;
import com.example.standard.controller.PageableController;
import com.example.standard.controller.StandardController;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/language")
@Slf4j
public class LanguageController implements StandardController, PageableController{
	@Autowired
	LanguageMapper languageMapper;
	
	@Autowired
	ObjectMapper objectMapper;
	
	
	@Override
	public void list(Model model) {
		var list = languageMapper.selectAll();
		model.addAttribute("list", list);
	}


	@Override
	public String page(int pageNum, int pageSize, Model model) {
		log.trace("page(int pageNum, int pageSize, Model model");
		PageHelper.startPage(pageNum, pageSize);
		var list = languageMapper.selectPage();
		var paging = PageInfo.of(list, 10);
		model.addAttribute("list", list);
		model.addAttribute("paging", paging);
		
		log.debug(paging.toString());
		
		
		return "language/page";
	}
	

	
	
}
