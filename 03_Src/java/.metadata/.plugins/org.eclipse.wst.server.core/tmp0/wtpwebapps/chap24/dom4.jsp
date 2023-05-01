<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>dom4.jsp</title>
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

let words = ["java", "python", "linux", "oracle", "jsp"]

window.onload = function() {
	let ol = document.querySelector('ol');
	ol.onclick = () => {
		let li = document.createElement('li');
		li.textContent = words[parseInt(Math.random()*words.length)];
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
