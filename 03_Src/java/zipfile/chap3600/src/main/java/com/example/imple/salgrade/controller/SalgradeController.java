package com.example.imple.salgrade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.imple.salgrade.mapper.SalgradeMapper;
import com.example.standard.controller.ListController;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/salgrade")
@Slf4j
public class SalgradeController implements ListController {

	@Autowired
	SalgradeMapper salgradeMapper;


	@Override
	public void list(Model model, HttpServletRequest request) {
		var list = salgradeMapper.selectAll();
		model.addAttribute("list", list);
		
	}

	
	
}
