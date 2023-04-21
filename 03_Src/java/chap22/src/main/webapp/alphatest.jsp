<%@page import="util.Color"%>
<%@page import="util.Alpha"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store"> 
<title>alphatest.jsp</title>
<style type="text/css">
	ul {
		margin: 3%;
	}
</style>
</head>
<body>
<hr>
<form id="form" action="alphatest.jsp">
	<ul>
	<label for="line">line : </label>
	<input id="line" name="line" type="number" size="7" min="1" max="20" placeholder="line"><br>
	
	<label for="column">column : </label>
	<input id="column" name="column" type="number" size="7" min="1" max="40" placeholder="column"><br>
	
	fg : <select name="fg" class="select" placeholder="fg"> 
		<option value="black">Black</option>
		<option value="red">Red</option>
		<option value="grean">Green</option>
		<option value="yellow">Yellow</option>
		<option value="blue">Blue</option>
		<option value="magenta">Magenta</option>
		<option value="cyan">Cyan</option>
		<option value="white">White</option>
	</select><br>
<%
	String [] bg = {"black","red","grean", "yellow", "blue", "magenta", "cyan", "white"};

/* 	for(int i=1; i<=8; i++){
			if(bg==i){
				out.print("<option value='"+i+"' selected>"+i+"</option>");
			}else{
				out.print("<option value='"+i+"'>"+i+"</option>");
			}
		} */
	/* for(String str : bg){
		if(str.equals(bg)){
			out.print("<option value='"+bg+"' selected>"+bg+"</option>");
		}
	} */
		/* document.write("<option>"+ "bg[i]"+ "</option>"); */
%>
	bg : <select name="bg" id="bg" placeholder="bg">
		<option>"+ <<%="bg[i]"%>> + "</option>
	</select><br>
	ch : <select name="ch" class="select" placeholder="ch"> 
		<option value="A">A</option>
		<option value="B">B</option>
		<option value="C">C</option>
		<option value="D">D</option>
		<option value="E">E</option>
		<option value="F">F</option>
		<option value="G">G</option>
		<option value="H">H</option>
		<option value="I">I</option>
		<option value="J">J</option>
		<option value="K">K</option>
		<option value="L">L</option>
		<option value="M">M</option>
		<option value="N">N</option>
		<option value="O">O</option>
		<option value="P">P</option>
		<option value="Q">Q</option>
		<option value="R">R</option>
		<option value="S">S</option>
		<option value="T">T</option>
		<option value="U">U</option>
		<option value="V">V</option>
		<option value="W">W</option>
		<option value="X">X</option>
		<option value="Y">Y</option>
		<option value="Z">Z</option>
	</select><br>
	<input type="submit" value="submit">
	</ul>
</form>

<hr>
<%

	String line = request.getParameter("line");
	String column = request.getParameter("column");
	String fg = request.getParameter("fg");
	String bg2 = request.getParameter("bg");
	String ch = request.getParameter("ch");


%>
<hr>

<span style="margin: 10%; background-color: <%=bg%>; color: <%=fg%>;"><%=ch%></span>
<hr>
<h3><span>line:</span><%=line%></h3>
<h3><span>column:</span><%=column%></h3>
<h3><span>fg:</span><%=fg%></h3>
<h3><span>bg2:</span><%=bg2%></h3>
<h3><span>ch:</span><%=ch%></h3>


</body>
</html>