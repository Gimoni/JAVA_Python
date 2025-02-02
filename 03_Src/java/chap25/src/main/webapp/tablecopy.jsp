<%@page import="util.Alpha"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>tablecopy.jsp</title>
<style type="text/css">
table {
	border: 1px solid black;
}
td {
	font-family: monospace;
	font-size: 10pt;
}
</style>
<script type="text/javascript">

let table1;
let table2; 

window.onload = function() {
	let table1 = document.querySelectorAll('table')[0];
	let table2 = document.querySelectorAll('table')[1];
	
	for (var tr of table1.rows) {
		for (var td of tr.cells) {
			td.onmouseover = function() {
				let trIndex = this.parentElement.rowIndex;	// tr
				let tdIndex = this.cellIndex;	// td
				console.log(`(\${trIndex}, \${tdIndex})`)
				
				let cell = table2.rows[trIndex].cells[tdIndex];	// target cell 가저오는 td
				cell.style.opacity = 1;
				cell.style.color = this.style.color;
				cell.style.background = this.style.background;
				cell.textContent = this.textContent;
			}
		}
	}
	
}
</script>
</head>
<body>
<table>
<tbody>
<%
	for (int i =0; i<20; i++) {
		out.print("<tr>");
		for(int j=0; j<40; j++) {
			var a = new Alpha();
			var td = "<td style='color:%s;background:%s'>%s</td>";
			out.print(String.format(td, a.getFg(), a.getBg(), a.getCh()));
		}
		out.print("<tr>");
	}
%>
</tbody>
</table>
<table>
<tbody>
<%
	for (int i =0; i<20; i++) {
		out.print("<tr>");
		for(int j=0; j<40; j++) {
			var a = new Alpha();
			var td = "<td style='opacity:0'>'A'</td>";
			out.print(td);
		}
		out.print("<tr>");
	}
%>
</tbody>
</table>
</body>
</html>