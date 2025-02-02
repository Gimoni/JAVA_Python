<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>dom5.jsp</title>
<script src = "js/sprintf.js"></script>
<style type="text/css">
	html {
		padding: 20px;
		border: 10px solid red
	}
	
	body {
		margin: 0px;
		border: 10px solid blue;
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
    };
}

class Alpha {
	constructor() {
		this.line = parseInt(Math.random()*20 + 1);
		this.column = parseInt(Math.random()*40 + 1);
		do {
			this.fg = Color.values()[parseInt(Math.random()*8)];
			this.bg = Color.values()[parseInt(Math.random()*8)];
		} while (this.fg===this.bg);
		this.ch = String.fromCharCode([parseInt(Math.random()*26+ 'A'.charCodeAt(0))] );
	}
}


</script>

<script type="text/javascript">


window.onload = function() {
	let ol = document.querySelector('ol');
	
	ol.onclick = () => {
		let li = document.createElement('li');
		let span = document.createElement('span');
		li.appendChild(span)
		
		let a = new Alpha();
		span.style.color = a.fg;
		span.style.background = a.bg;
		span.textContent = a.ch;
		
		ol.append(li);
	}
	
}
</script>
</head>
<body>
<header id="header">
<ol id="ol">
	<li>java</li>
	<li>python</li>
	
</ol>
</header>
</body>
</html>
