<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>result.jsp</title>
</head>
<body>
<h1>결과값 처리</h1>
<hr>
<% 
 	//String msg = request.getParameter("msg"); 
 	//String msg2 = request.getParameter("msg2"); 
 	String [] msg = request.getParameterValues("msg");
%>
<h3>msg[0]= <%=msg[0]%> </h3>
<h3>msg[1]= <%=msg[1]%> </h3>
<hr>

<a href="form.jsp">뒤로</a>
</body>
</html>