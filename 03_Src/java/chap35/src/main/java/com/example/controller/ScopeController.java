package com.example.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Application;
import com.example.mapper.DeptMapper;
import com.example.model.Dept;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ScopeController {
	/*
	 * scope 객체 목적 => Data 저장, Data 공유, Data 전달  
	 * 											EL
	 * 1. page			: jsp에서만 생성. 		: ${ageScope} 
	 * 2. request							: ${requestScope}
	 * 3. session 							: ${sessionScope}
	 * 4. application 						: ${applicationScope}
	 * 
	 */
	
	@GetMapping("/scope")
	void scope(HttpServletRequest request) {
		System.out.println("scope()...");
		var session = request.getSession();
		var application = request.getServletContext();
		
		var cnt = request.getAttribute("cnt");
		if (cnt==null) {
			request.setAttribute("cnt", 0);
		
			int value = (int)request.getAttribute("cnt");
			request.setAttribute("cnt", ++value);
		}
		else {
			int value = (int)cnt;
			request.setAttribute("cnt", ++value);
		}
		
		
		cnt = session.getAttribute("cnt");
		if (cnt==null)
			session.setAttribute("cnt", 0);
		else {
			int value = (int)cnt;
			session.setAttribute("cnt", ++value);
		}
		
		
		cnt = application.getAttribute("cnt");
		if (cnt==null)
			application.setAttribute("cnt", 0);
		else {
			int value = (int)cnt;
			application.setAttribute("cnt", ++value);
		}
		
	}

	@Autowired
	DeptMapper deptMapper;
	
	@GetMapping("/for")
	void forEach(Model model) {	// spring ui model 
		var list = deptMapper.selectAll();
		model.addAttribute("list", list);
		
		var map = new HashMap<Integer, Dept>();
		list.forEach(dept -> {
			map.put(dept.getDeptno(), dept);
		});
		
		model.addAttribute("map", map);
	}
	
	@GetMapping("/choose")
	void choose() {
		
	}
	
	@GetMapping("/security")
	void securityInfo() {
		
	}
	
	
	
}
