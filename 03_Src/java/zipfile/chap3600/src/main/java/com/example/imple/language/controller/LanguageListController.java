package com.example.imple.language.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.imple.language.mapper.LanguageMapper;
import com.example.standard.controller.ListController;
import com.example.standard.controller.PageableController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/language")
@Slf4j
public class LanguageListController implements ListController, PageableController {
	@Autowired
	LanguageMapper languageMapper;

	@Autowired
	ObjectMapper json;
	
	@Override
	public void list(Model model, HttpServletRequest request) {
		var list = languageMapper.selectAll();
		model.addAttribute("list", list);
	}

	@Override
	public String page(int pageNum, int pageSize, Model model) {
		log.info(String.format("%s, %s", pageNum, pageSize));
		
		PageHelper.startPage(pageNum, pageSize);
		var list = languageMapper.selectPage();
		var paging = PageInfo.of(list, 10);
		model.addAttribute("list", list);
		model.addAttribute("paging", paging);
		
		try {
			paging.setList(null);
			var str = json.writeValueAsString(paging);
			model.addAttribute("json", str);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "language/page";
	}



}
