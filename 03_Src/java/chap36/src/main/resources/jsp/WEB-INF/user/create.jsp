<%@ page language="java" contentType="text/html; charset=UTF-8"
       pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="Cache-Control" content="no-store">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="/favicon.png">
<link rel="stylesheet" href="/webjars/bootstrap/5.2.3/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/jquery.min.js"></script>

<title>create.jsp</title>
</head>
<body>
<h1>User Create 회원가입</h1>
<hr>
<a href="/">HOME</a>
<hr>
<section class="container">
	<form action="/user/create" method="post">
		<div class="mb-8">
			<label class="form-lable mb-2" for="id">id<span>*</span></label>
			<input class="form-control"    id="id" name="id" placeholder="id" value="${param.id}"/>
		</div>
		<div class="mb-8">
			<label class="form-lable mb-2" for="password">password<span>*</span></label>
			<input class="form-control"    id="password"  name="password"  placeholder="password" type="password" value="${param.password }"/>
		</div>
		<div class="mb-8">
			<label class="form-lable mb-2" for="name">name<span>*</span></label>
			<input class="form-control"    id="name" name="name" placeholder="name" value="${param.name}"/>
		</div>
		<div class="mb-8">
			<label class="form-lable mb-2" for="mobile">mobile <span>*</span></label>
			<input class="form-control"    id="mobile"  name="mobile"  placeholder="mobile" value="${param.mobile }"/>
		</div>
		<hr>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>	
</section>
<span style="color: red;"> ${param.message}</span>
<c:if test="${exception ne null}">
	<h1>${exception.message}</h1>
</c:if>
<c:if test="${binding.hasErrors()}">
<hr>
<h2>Error Massage</h2>
<hr>
<c:forEach var="g" items="${binding.globalErrors}">
	<div>${g.code} ${g.defaultMessage}</div>
</c:forEach>

<c:forEach var="f" items="${binding.fieldErrors}">
	<div>${f.field} ${f.defaultMessage}</div>
</c:forEach>

</c:if>
</body>
</html>