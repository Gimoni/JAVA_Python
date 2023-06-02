<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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

<title>list.jsp</title>
</head>
<body>
<h1>Emp list</h1>
<hr>
<button type="button" class="btn btn-warning">
<a href="/">Home</a>
</button>
<hr>
<section class="container table-responsive" style="border: 10px solid gray">
	<table class="table table-striped table-dark table-bordered table-hover">
		<thead class="table-warning">
			<tr>
				<th>empno</th>
				<th>ename</th>
				<th>gender</th>
				<th>job</th>
				<th>mgr</th>
				<th>hiredate</th>
				<th>sal</th>
				<th>comm</th>
				<th>deptno</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="e" items="${list}">
			<tr>
				<td>${e.empno}</td>
				<td>${e.ename}</td>
				<td>${e.gender}</td>
				<td>${e.job}</td>
				<td>${e.mgr}</td>
				<td>${e.hiredate}</td>
				<td>${e.sal}</td>
				<td align="right">${e.comm}</td>
				<td align="right">${e.deptno}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</section>

</body>
</html>