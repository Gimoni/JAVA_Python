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

<title>detail.jsp</title>
</head>
<body>
<h1>Emp list 사원 정보</h1>
<hr>
<a href="/">Home</a>
<hr>
<a href="/emp/list">/emp/list</a>
<hr>
<section class="container">
	<table class="table">
		<tbody>
			<tr>
				<tr><th>empno</th>		<td>${emp.empno}		</td></tr>
				<tr><th>ename</th>		<td>${emp.ename}		</td></tr>
				<tr><th>gender</th>		<td>${emp.gender}		</td></tr>
				<tr><th>job</th>		<td>${emp.job}		</td></tr>
				<tr><th>mgr</th>		<td>${emp.mgr}		</td></tr>
				<tr><th>hiredate</th>	<td>${emp.hiredate}	</td></tr>
				<tr><th>sal</th>		<td>${emp.sal}		</td></tr>
				<tr><th>comm</th>		<td>${emp.comm}		</td></tr>
				<tr><th>deptno</th>		<td>${emp.deptno}		</td></tr>
			</tr>
		</tbody>
	</table>
</section>

</body>
</html>