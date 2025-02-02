<%@page import="util.Alpha"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png">
<title>alpha_move.jsp</title>
<style type="text/css">
td#td1 {
	alian: right;
	background-color: pink;
}

td#td2 {
	alian: right;
	background-color: pink;
}

td#td3 {
	alian: right;
	background-color: pink;
}

main {
	position: relative;
	border-width: 10px;
	border-style: solid;
	border-color: orange;
	height:500px;
	width :auto;
}

html {
	border: 20px solid gray;
	height:auto;
	margin: 0px;
}

body {
	border: 20px solid blue;
	height:auto;
	margin: 0px;
}

span {
	position: absolute;
	font-family: monospace;
	font-size: 15pt;
}
table#table {
	position: absolute;
	display: flex;
	height: auto;
	width: auto;
	top:2px;
	bottom: 2px;
}
	
</style>
<script type="text/javascript">
class Color {
	static Black = "blcak";
    static Red	= "red";
    static Green = "green";
    static Yellow = "yellow";
    static Blue = "blue";
    static Magenta = "magenta";
    static Cyan = "cyan";
    static White = "white";
    
    static values() {
    	return [Color.Black, Color.Red, Color.Green, 
    			Color.Yellow, Color.Blue, Color.Magenta,
    			Color.cyan, Color.white];
    }
}


class Alpha {
	constructor() {
		this.line = 1;
		this.column = 1;
		do {
			this.fg = Color.values()[parseInt(Math.random()*8)];
			this.bg = Color.values()[parseInt(Math.random()*8)];
		} while (this.fg===this.bg);
		this.ch = String.fromCharCode([parseInt(Math.random()*26+ 'A'.charCodeAt(0))] );
		
		this.direction = 0;
	}
	
	show() {
		let cell = table.rows[this.line-1].cells[this.column-1];
		cell.style.color = this.fg;
		cell.style.background = this.bg;
		cell.textContent = this.ch;
		cell.style.opacity = 1;
	}
	
	hide() {
		let cell = table.rows[this.line-1].cells[this.column-1];
		cell.style.opacity = 0;
	}
	
	isShow = true;
	blink() {
		if (this.isShow)
			this.show();
		else 
			this.hide();
		
		this.isShow = !this.isShow;
	
		this.hide();
		
		if (this.line==1 && this.column==40)
			this.direction = 1;
		else if (this.line==20 && this.column==40)
			this.direction = 2;
		else if (this.line==20 && this.column==1)
			this.direction = 3;	
		else if (this.line==1 && this.column==1)
			this.direction = 0;
		
		switch(this.direction) {
		case 0:	// right
			this.column++;
			break;
		case 1: // bottom
			this.line++;
			break;					
		case 2: // left
			this.column--;
			break;
		case 3: // top
			this.line--;		
			break;
		}
		
		this.show();
	}
}


</script>
<script type="text/javascript">
window.onload = function() {
	for (let i=0; i<50; i++) {
		let a = new Alpha();
		setInterval(() => {
			a.blink();
		}, Math.random()*200+10);
	}
}
</script>
</head>
<body>
<main>
<h1>Alpha Move</h1>
<table border="1" style="border-color: pink" >
<tbody>
<tr>
<td id="td1">만든이</td><td>손진희</td></tr>
<tr><td id="td2">작성일</td><td>2023/05/02</td></tr>
<tr><td id="td3">과 목</td><td>HTML/CSS/JAVASCRTIPT</td></tr>
</tbody>
</table>
<table id="table" >
		<%
		for (int i=0; i<20; i++) {
			out.print("<tr>");
			for (int j=0; j<40; j++) {
				out.print("<td id='td'; style='opacity: 0;'>");
				out.print((char)(Math.random()*26+ 'A'));
				out.print("</td>");
			}
			out.println("</tr>");
		}
		%>
</table>

</main>
</body>
</html>
