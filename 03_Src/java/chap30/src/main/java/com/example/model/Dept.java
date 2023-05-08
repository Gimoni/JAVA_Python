package com.example.model;

import lombok.Data;

// 모델클래스 . 게더,세터 생성 --- use lombok
@Data
public class Dept {
	int deptno;
	String dname;
	String loc;
}
