
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
<title>choose.jsp</title>
<!-- if else 문을 대체한다 choose의 true와 false 사용 -->
</head>
<body>
<h1>choose when otherwise 의 이해</h1>
<hr>
<c:choose>
	<c:when test="${false}">RED</c:when>
	<c:when test="${false}">GREEN</c:when>
	<c:when test="${false}">BLUE</c:when>
	<c:otherwise>OTHER</c:otherwise>
</c:choose>


</body>
</html>