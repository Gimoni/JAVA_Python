<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>blink3.jsp</title>
<style type="text/css">
	html {
		border : 10px solid gray;
	}
	
	body {
		border : 10px solid blue;
	}
	
	table {
		border-collapse: separate;
	}
	td { 
		font-family :monospace;
		background : yellow;
	}
	
</style>
</head>
<body>
<table id="table">
	<tbody>
<!-- 	<tr><td>1</td><td>2</td></tr> -->
	<%
		for (int i=0; i<20; i++) {
			out.print("<tr>");
			for (int j=0; j<40; j++) {
				out.print("<td style='color:yellow;'>");
//				out.print((char)(Math.random()*26+ 'A'));
				out.print("A");
				out.print("</td>");
			}
			out.print("</tr>");
		}
	
	%>
	</tbody>
</table>
</body>
</html>