<%@page import="util.Alpha"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>alpha3.jsp</title>
<style type="text/css">
main {
	position: relative;
	border-width: 10px;
	border-style: solid;
	border-color: orange;
	height: 300px;
}

span {
	position: absolute;
	font-family: monospace;
	font-size: 15pt;
}
</style>
<script type="text/javascript">
window.onload = function() {
	let spans = document.querySelectorAll('span');
	
	let width = parseFloat(getComputedStyle(spans[0]).width);
	let height = parseFloat(getComputedStyle(spans[0]).height);
	
	let main = document.querySelector('main');
	main.style.height = 20*height + "px";	// line
	main.style.width  = 40*width + "px";	// column
	
	for (let s of spans) {
	    let line = s.dataset.line;
	    let column = s.dataset.column;

	    s.style.top = height*(line-1) + "px";
	    s.style.left = width*(column-1) + "px";
	    
	    setInterval(() => { // blink setting.
			if (s.style.display=='inline')
				s.style.display = 'none';
			else 
				s.style.display = 'inline';
		}, Math.random()*200 + 10);
	}
}
</script>
</head>
<body>
<main>
<%
	for (int i=0; i<1000; i++) {
		var a = new Alpha();
		var span = "<span data-line='%d' data-column='%d' style='color:%s; background:%s;'>%c</span>";
		span = String.format(span, a.getLine(), a.getColumn(), a.getFg(), a.getBg(), a.getCh());
		out.println(span);
		
	}


%>
</main>
</body>
</html>