<%@page import="util.Alpha"%>
<%@page import="util.Color"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store"> 
<title>alpha3.jsp</title>
<style type="text/css">
	body {
		/*고정글꼴*/
		font-family: monospace;
	}
</style>
</head>
<body>
<%
// 스크립트릿(Scriptlet)
	for(int i=0; i<10; i++) {
		for(int j=0; j<20; j++) {
			Alpha a = new Alpha();
			Color fg = a.getFg();
			Color bg = a.getBg();
			char ch = a.getCh();
			
			String span = 
			String.format("<span style=\"background-color:%s; color:%s;\">%c</span>", bg, fg, ch);
			out.print(span);
		}
		out.print("<br>");
	}

%>

</body>
</html>