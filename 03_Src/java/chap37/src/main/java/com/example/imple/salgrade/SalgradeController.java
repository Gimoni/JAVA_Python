package com.example.imple.salgrade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.imple.salgrade.mapper.SalgradeMapper;
import com.example.standard.controller.StandardController;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/salgrade")
@Slf4j
public class SalgradeController implements StandardController {
	@Autowired
	SalgradeMapper salgradeMapper;
	
	@Autowired
	ObjectMapper objectMapper;

	@Override
	public void list(Model model) {
		var list = salgradeMapper.selectSalgradeAll();
		model.addAttribute("list", list);
	}
	
	

}
