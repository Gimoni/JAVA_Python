<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="Cache-Control" content="no-store">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href = "/favicon.png">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/jquery.min.js"></script>
<title>list.jsp</title>
</head>
<body>
<%-- ${list} --%>
<!-- <hr> -->

<%-- ${list[0]}<br> --%>
<%-- ${list[1]}<br> --%>
<%-- ${list[2]}<br> --%>
<%-- ${list[3]}<br> --%>
<!-- <hr> -->

<%-- <c:forEach var="emp" items="${list}"> --%>
<%-- 	${emp}<br> --%>
<%-- </c:forEach> --%>
<!-- <hr> -->

<!-- <ul> -->
<%-- <c:forEach var="emp" items="${list}"> --%>
<!-- 	<li> -->
<%-- 		<span>${emp.empno}</span>	 --%>
<%-- 		<span>${emp.ename}</span>	 --%>
<%-- 		<span>${emp.gender}</span>	 --%>
<%-- 		<span>${emp.job}</span>	 --%>
<!-- 	</li> -->
<%-- </c:forEach> --%>
<!-- </ul> -->
<!-- <hr> -->

<!-- <table> -->
<!-- 	<thead> -->
<!-- 		<th>Empno</th><th>Ename</th><th>Gender</th><th>Job</th> -->
<!-- 	</thead> -->
<!-- 	<tbody> -->
<%-- 		<c:forEach var="e" items="${list}"> --%>
<!-- 			<tr> -->
<%-- 				<td>${e.empno}</td> --%>
<%-- 				<td>${e.ename}</td> --%>
<%-- 				<td>${e.gender}</td> --%>
<%-- 				<td>${e.job}</td> --%>
<!-- 			</tr> -->
<%-- 		</c:forEach> --%>
<!-- 	</tbody> -->
<!-- </table> -->
<!-- <hr> -->

<div class="container mt-5">
<table class="table table-hover">
	<thead class="table-secondary">
		<th>Empno</th>
		<th>Ename</th>
		<th>Gender</th>
		<th>Job</th>
		<th>MGR</th>
		<th>Sal</th>
		<th>Comm</th>
		<th>Entno</th>
	</thead>
	<tbody>
		<c:forEach var="e" items="${list}">
			<tr>
				<td>${e.empno}</td>
				<td>${e.ename}</td>
				<td>${e.gender}</td>
				<td>${e.job}</td>
				<td>${e.mgr}</td>
				<td>${e.sal}</td>
				<td>${e.comm}</td>
				<td>${e.eptno}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
<hr>


</body>
</html>