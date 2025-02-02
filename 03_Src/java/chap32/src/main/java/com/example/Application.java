package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mapper.DeptMapper;

@SpringBootApplication
public class Application implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}
	
	@Autowired
	DeptMapper deptMapper;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("####################");
		System.out.println("Application.run()...");
		System.out.println("####################");
		System.out.println(deptMapper.selectAll());
	}

}
