<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="/faviconAlpha.png"> 
<link rel="stylesheet" href="/webjars/bootstrap/5.2.3/css/bootstrap.css">
<script src="/webjars/bootstrap/5.2.3/js/bootstrap.js"></script>
<script src="/webjars/jquery/jqurey.min.js"></script>

<title>loginfail.jsp</title>
</head>
<body>
<h1>Login Failed</h1>
<%
	Exception exception = (Exception)request.getAttribute("exception");
%>
<h1><%=exception.getMessage() %></h1>

<a href="/login">다시 로그인</a>

<hr>
<div></div>
<hr>
</body>
</html>