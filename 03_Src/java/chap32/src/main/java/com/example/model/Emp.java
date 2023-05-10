package com.example.model;

import java.time.LocalDate;

import lombok.Data;

// DTO (Data Transfer Object), VO(Value Object) : 데이터를 이동시키는 
@Data
public class Emp { // db와 이름이 같아야함 순서는 상관없지만..  
	int 		empno;
	String 		ename;
	Character 	gender;
	String 		job;
	Integer 	mgr;
	LocalDate 	hiredate;
	Double 		sal;
	Double 		comm;
	Integer 	deptno;
}
