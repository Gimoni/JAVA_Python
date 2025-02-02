<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   --%>

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

<title>scope.jsp</title>
</head>
<body>
<hr>
<h1>Scope의 이해</h1>
<%
/* 	var cnt = pageContext.getAttribute("cnt");
	if (cnt==null) 
		pageContext.setAttribute("cnt", 0);
	else {
		int value = (int)cnt;
		pageContext.setAttribute("cnt", ++value);
	} */
	
/* 	request.removeAttribute("cnt");
	request.getSession().removeAttribute("cnt"); */
%>
<hr>
<c:if test="${pageScome.cnt != null}">
	<c:set var="cnt" value=" ${cnt +1} " />
</c:if>
<c:if test="${pageScome.cnt == null}">
	<c:set var="cnt" value="0" />
</c:if>


<hr>
<c:choose>
	<c:when test="${pageScope.cnt eq null} }">
		<c:set var="cnt" value="0" />
	</c:when>
	<c:when test="${pageScope.cnt ne null} }">
		<c:set var="cnt" value=" ${cnt +1}" />
		<c:set var="cnt" value=" ${cnt +1}" />
	</c:when>
	<c:otherwise>
		
	</c:otherwise>
</c:choose>


<c:remove var="cnt" scope="request" />
<c:remove var="cnt" scope="sesstion" />

cnt = ${cnt} 
<hr>
pageScope.cnt = ${pageScope.cnt} 
<hr>
requestScope.cnt = ${requestScope.cnt} 
<hr>
sessionScope.cnt = ${sessionScope.cnt} 
<hr>
applicationScope.cnt = ${applicationScope.cnt} 
<hr>

<c:redirect url="http://www.google.com"> </c:redirect>



</body>
</html>