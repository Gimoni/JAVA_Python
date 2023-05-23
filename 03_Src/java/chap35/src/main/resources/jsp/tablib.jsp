<%@ page import="java.lang.reflect.Executable"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="Cache-Control" content="no-store">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="/favicon.png">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/jquery.min.js"></script>
<title>media.jsp</title>
</head>
<body>
<h1>Tag lib 실습</h1>
<%
	out.println("<ul>");
	for (int i=0; i<10; i++) {
		out.println("<li>스크립트릿 i=" + i + "</li>");
	}
	out.println("</ul>");
%>

<ul>
<c:forEach var="i" begin="0" end="10">
	<li>JSTL i=${i}</li>	
</c:forEach>
</ul>

</body>
</html>