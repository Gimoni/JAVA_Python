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
${list}
<hr>

${list[0]}<br>
${list[1]}<br>
${list[2]}<br>
${list[3]}<br>
<hr>

<c:forEach var="dept" items="${list}">
	${dept} <br>
</c:forEach>
<hr>
<ul>
<c:forEach var="dept" items="${list}">
	<li>
		<span>${dept.deptno}</span>
		<span>${dept.dname}</span>
		<span>${dept.loc}</span>
	</li>
</c:forEach>
</ul>
<hr>

<table  border="1">
	<thead>
		<th>Deptno</th><th>Dname</th><th>Loc</th>
	</thead>
	<tbody>
		<c:forEach var="d" items="${list}">
			<tr>
				<td>${d.deptno}</td>
				<td>${d.dname}</td>
				<td>${d.loc}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<hr>

<table class="table">
	<thead>
		<th>Deptno</th><th>Dname</th><th>Loc</th>
	</thead>
	<tbody>
		<c:forEach var="d" items="${list}">
			<tr>
				<td>${d.deptno}</td>
				<td>${d.dname}</td>
				<td>${d.loc}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<hr>
</body>
</html>