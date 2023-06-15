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
<link rel="icon" href="/heart_like_love_icon.png"> 
<link rel="stylesheet" href="/webjars/bootstrap/5.2.3/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/jquery.min.js"></script>

<title>create.jsp</title>

<style type="text/css">
* {
  box-sizing: border-box;
}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

label {
  padding: 12px 12px 12px 0;
  display: inline-block;
}

input[type=submit] {
  background-color: #04AA6D;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}

a {
	text-decoration: none;
}



/* .col-25 { */
/*   float: left; */
/*   width: 25%; */
/*   margin-top: 6px; */
/* } */

/* .col-75 { */
/*   float: left; */
/*   width: 75%; */
/*   margin-top: 6px; */
/* } */

/* Clear floats after the columns */
.row::after {
  content: "";
  display: table;
  clear: both;
}

@media screen and (max-width: 600px) {
  .col-25, .col-75, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }
}
</style>
</head>

<body>
<h1><span class="badge bg-secondary">User Create</span></h1>
<hr>
<button type="button" class="btn btn-light">
<a href="/" >HOME</a>
</button>
<hr>
<section class="container">
	<form action="/user/create" method="post">
	<h1 align="center">회원가입</h1>
	<div class = "row">	
		<div class="col-25">
			<label class="form-lable mb-2" for="id">id<span>*</span></label>
		</div>
		<div class="col-75">
			<input class="form-control"    id="id" name="id" placeholder="id" value="${param.id}"/>
		</div>
	</div>
	<div class= "row">
		<div class="col-25">
			<label class="form-lable mb-2" for="password">password<span>*</span></label>
		</div>
		<div class="col-75">
			<input class="form-control"    id="password"  name="password"  placeholder="password" type="password" value="${param.password }"/>
		</div>
	</div>
	<div class= "row">
		<div class="col-25">
			<label class="form-lable mb-2" for="name">name<span>*</span></label>
		</div>
		<div class="col-75">
			<input class="form-control"    id="name" name="name" placeholder="name" value="${param.name}"/>
		</div>
	</div>
	<div class="row">
		<div class="col-25">
			<label class="form-lable mb-2" for="mobile">mobile <span>*</span></label>
		</div>
		<div class="col-75">
			<input class="form-control"    id="mobile"  name="mobile"  placeholder="mobile" value="${param.mobile }"/>
		</div>
	</div>
		<hr>
		<div class = "row">
		<button type="submit" class="btn btn-primary">Submit</button>
		</div>
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