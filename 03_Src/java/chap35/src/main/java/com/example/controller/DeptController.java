package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.mapper.DeptMapper;

import jakarta.servlet.http.HttpServletRequest;
import lombok.var;

@Controller
public class DeptController {
	
	@Autowired
	DeptMapper deptMapper;
	
	@GetMapping("/dept/list")
	void list(HttpServletRequest request) {
		var list = deptMapper.selectAll();
		System.out.println(list);
		request.setAttribute("list", list);
		
	}
	
	@GetMapping ("/dept/list2")
	String list2 (Model model) {
		var list = deptMapper.selectAll();
		System.out.println(list);
		model.addAttribute("list",list);
		return "dept/list";	
		
	}
	
	
}
