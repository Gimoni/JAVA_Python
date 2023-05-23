<%@page import="java.lang.reflect.Executable"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>error.jsp</title>
</head>
<body>
<h1>에러 입니다.</h1>
<h1><%=exception.getMessage()%></h1>
</body>
</html>