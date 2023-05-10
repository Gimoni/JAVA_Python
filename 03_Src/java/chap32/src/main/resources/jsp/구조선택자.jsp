<%@page import="ch.qos.logback.core.recovery.ResilientSyslogOutputStream"%>
<%@page import="com.example.mapper.DeptMapper"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>구조선택자.jsp</title>
<style type="text/css">
li:first-child {	/* 선택자의 첫번째 엘리먼트를 가져오게 됨. */
	background: red;
}

li:nth-child(2) {
	background: yellow;
}

li:nth-last-child(2){
	background: green;
}

li:last-child {
	background: blue;
}



</style>
</head>
<body>
<!-- spring이 관리하는 모든 객체를 사용하기 위한 절차  
Servlet/ factory 설정. factory.getBean //
-->

<ol>
<%
	var ctx = pageContext.getServletContext();
	var factory = WebApplicationContextUtils.getRequiredWebApplicationContext(ctx);
	DeptMapper deptMapper = factory.getBean(DeptMapper.class);
	System.out.println(deptMapper.selectAll());
	
	for(var dept: deptMapper.selectAll()) {
		String li = "<li>%s</li>";
		out.println(String.format(li, dept));	
		/*spring에서는 printf가 적용하지 않기 때문에 String.format 사용  */
	}
	
%>
</ol>
<hr>
<ol>
<%
	for(var dept: deptMapper.selectAll()) {
		String li = "<li>%s</li>";
		out.println(String.format(li, dept));	
		/*spring에서는 printf가 적용하지 않기 때문에 String.format 사용  */
	}
	
%>
</ol>



</body>
</html>