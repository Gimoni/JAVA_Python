<%@page import="com.example.mapper.EmpMapper"%>
<%@page import="ch.qos.logback.core.recovery.ResilientSyslogOutputStream"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Cache-Control" content="no-store">
<link rel="icon" href="favicon.png">
<title>구조선택자2.jsp</title>
<style type="text/css">

li:hover {
	border: 10px dotted black;
}

li:nth-child(even) {
	background: yellow;
}

li:nth-child(odd) {
	background: purple;
}

li:nth-chile(3n+5){
	background: purple;
}

li:first-child {
	background: red;
}

li:last-child {
	background: blue;
}

ol > *:first-of-type { 
	background: green;
}

</style>
</head>
<body>
<ol>
<!-- 	직원정보 -->
<%
	var ctx = pageContext.getServletContext();
	var factory = WebApplicationContextUtils.getRequiredWebApplicationContext(ctx);
	var empMapper = factory.getBean(EmpMapper.class);

	for (var emp : empMapper.selectAll()) {
		String li = "<li>%04d %10s %s</li>";
		out.println(String.format(li, emp.getEmpno(), emp.getEname(), emp.getHiredate()));
	}

%>
</ol>
<hr>
<ul>
<%
	for (var emp : empMapper.selectAll()) {
		String li = "<li>%04d %10s %s</li>";
		out.println(String.format(li, emp.getEmpno(), emp.getEname(), emp.getHiredate()));
	}
%>
</ul>





</body>
</html>