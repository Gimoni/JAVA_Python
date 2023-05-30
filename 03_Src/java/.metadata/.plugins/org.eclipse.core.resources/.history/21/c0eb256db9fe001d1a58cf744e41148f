package com.example.imple.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.imple.emp.mapper.EmpMapper;
import com.example.standard.controller.StandardController;

@Controller
public class EmpController implements StandardController  {

	@Autowired
	EmpMapper mapper;

	@Override
	public void list(Model model) {
		var list = mapper.selectAll();
		model.addAttribute("list", list);
	}
	

	
}
