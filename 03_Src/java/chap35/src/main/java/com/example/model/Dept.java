package com.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//
//POJO (Plain Old Java Object)
//

@Setter
@Getter
@ToString
public class Dept {
	int deptno;
	String dname;
	String loc;

}
