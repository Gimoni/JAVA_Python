<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>    
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="Cache-Control" content="no-store">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="/heart_like_love_icon.png"> 
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script src="/webjars/jquery/jquery.min.js"></script>

<title>create.jsp</title>
</head>
<body>
<h1>Country Create 나라 추가</h1>
<hr>
<a href="/">Home</a>
<hr>
<a href="/country/list">/country/list</a>
<hr>
<section class="container">
	<form action="/country/create" method="post">
		<div class="mb-3">
			<label class="form-lable mb-2" for="code">code<span></span></label>
			<input class="form-control"    id="code"  name="code"  placeholder="나라코드를 입력하세요." value="${country.code }"/>
		</div>
		<div class="mb-3">
			<label class="form-lable mb-2" for="name">name<span>*</span></label>
			<input class="form-control"    id="name"  name="name"  placeholder="나라이름를 입력하세요." value="${country.name }"/>
		</div>
		<div class="mb-3">
			<label class="form-lable mb-2" for="continent">continent<span></span></label>
			<input class="form-control"    id="continent"  name="continent"  placeholder="대륙을 입력하세요" value="${country.continent }"/>
		</div>
		<div class="mb-3">
			<label class="form-lable mb-2" for="region">region<span></span></label>
			<input class="form-control"    id="region"  name="region"  placeholder="지역을 입력하세요." value="${country.region }"/>
		</div>
		<div class="mb-3">
			<label class="form-lable mb-2" for="surfaceArea">surfaceArea<span></span></label>
			<input class="form-control"    id="surfaceArea"  name="surfaceArea"  placeholder="surfaceArea" value="${country.surfaceArea }"/>
		</div>
		<div class="mb-3">
			<label class="form-lable mb-2" for="indepYear">indepYear<span></span></label>
			<input class="form-control"    id="indepYear"  name="indepYear"  placeholder="년도를 입력하세요" value="${country.indepYear}"/>
		</div>
		<div class="mb-3">
			<label class="form-lable mb-2" for="population">population<span></span></label>
			<input class="form-control"    id="population"  name="population"  placeholder="인구 수를 입력하세요" value="${country.population }"/>
		</div>
		<div class="mb-3">
			<label class="form-lable mb-2" for="lifeExpectancy">lifeExpectancy<span></span></label>
			<input class="form-control"    id="lifeExpectancy"  name="lifeExpectancy"  placeholder="lifeExpectancy" value="${country.lifeExpectancy }"/>
		</div>
		<div class="mb-3">
			<label class="form-lable mb-2" for="gnp">gnp<span></span></label>
			<input class="form-control"    id="gnp"  name="gnp"  placeholder="gnp" value="${country.gnp }"/>
		</div>
		<div class="mb-3">
			<label class="form-lable mb-2" for="gnpOld">gnpOld<span></span></label>
			<input class="form-control"    id="gnpOld"  name="gnpOld"  placeholder="gnpOld" value="${country.gnpOld }"/>
		</div>
		<div class="mb-3">
			<label class="form-lable mb-2" for="localName">localName<span></span></label>
			<input class="form-control"    id="localName"  name="localName"  placeholder="현지 이름" value="${country.localName }"/>
		</div>
		<div class="mb-3">
			<label class="form-lable mb-2" for="governmentForm">region<span></span></label>
			<input class="form-control"    id="governmentForm"  name="governmentForm"  placeholder="정부.form" value="${country.governmentForm }"/>
		</div>
		<div class="mb-3">
			<label class="form-lable mb-2" for="headOfState">region<span></span></label>
			<input class="form-control"    id="headOfState"  name="headOfState"  placeholder="headOfState" value="${country.headOfState }"/>
		</div>
		<div class="mb-3">
			<label class="form-lable mb-2" for="capital">region<span></span></label>
			<input class="form-control"    id="capital"  name="capital"  placeholder="수도를 입력하세요" value="${country.capital }"/>
		</div>
		<div class="mb-3">
			<label class="form-lable mb-2" for="code2">code2<span></span></label>
			<input class="form-control"    id="code2"  name="code2"  placeholder="code2" value="${country.code2 }"/>
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>	
</section>
<hr>
<c:if test="${binding.hasErrors()}">
<h2>Error Massage</h2>
<hr>
<c:forEach var="g" items="${binding.globalErrors}">
	<div>${g.code} ${g.defaultMessage}</div>
</c:forEach>
<hr>
<c:forEach var="f" items="${binding.fieldErrors}">
	<div>${f.field} ${f.defaultMessage}</div>
</c:forEach>

</c:if>

</body>
</html>