package com.example.imple.language.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

import com.example.imple.language.mapper.LanguageMapper;
import com.example.standard.controller.DetailController;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/language")
@Slf4j
public class LanguageDetailController implements DetailController<String> {

	@Autowired
	LanguageMapper languageMapper;

	@Autowired
	ObjectMapper json;

	@Override
	public String detail(String key, Model model, HttpServletRequest request) {
		throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Not Implamentation");
	}
	
	@Override
	public String detail(String key1, String key2, Model model, HttpServletRequest request) {
		
		return "language/detail";
	}

}
