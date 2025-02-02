<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="../faviconAlpha.png"> 
<link rel="stylesheet" href="../css/main.css">
<title>anchor.jsp</title>
<style type="text/css">
header {
	background-color: lightcyan;
	height: 500px;
}
section {
	background-color: orangered;
	height: 500px;
}
article {
	background-color: lightgreen;
	height: 500px;
}
footer {
	background-color: pink;
	height: 500px;
}
nav {
	background-color: lightyellow;
	height: 500px;
}


</style>
</head>
<body>
<h1>Anchor 실습</h1>
<hr>
<ul>
	<li><a href="http://www.naver.com" target="_blank">naver</a></li>
	<li><a href="http://www.google.com" target="_blank">google</a></li>
	<li><a id="nate" href="http://www.nate.com" target="_blank">nate</a></li>
	<li><a href="http://djlog.netlify.app/" target="_blank">djlog</a></li>
	<li><a href="alpha2.jsp" target="_blank">alpha2</a></li>
</ul>
<script type="text/javascript">

// 	nate동작 기본기능 제한
	nate.onclick = function (e) {
		alert("nate..");
// 		e.preventDefault();
		return false;
	}
</script>
<header id="header">
	<h1>Header</h1>
	<ol>
		<li><a href="#header">header</a></li>
		<li><a href="#section">section</a></li>
		<li><a href="#article">article</a></li>
		<li><a href="#footer">footer</a></li>
		<li><a href="#nav">navigation</a></li>
	</ol>
</header>
<section id="section">
	<h1>Section</h1>
	<ol>
		<li><a href="#header">header</a></li>
		<li><a href="#section">section</a></li>
		<li><a href="#article">article</a></li>
		<li><a href="#footer">footer</a></li>
		<li><a href="#nav">navigation</a></li>
	</ol>
</section>
<article id="article">
	<h1>Article</h1>
	<ol>
		<li><a href="#header">header</a></li>
		<li><a href="#section">section</a></li>
		<li><a href="#article">article</a></li>
		<li><a href="#footer">footer</a></li>
		<li><a href="#nav">navigation</a></li>
	</ol>
</article>
<footer id="footer">
	<h1>Footer</h1>
	<ol>
		<li><a href="#header">header</a></li>
		<li><a href="#section">section</a></li>
		<li><a href="#article">article</a></li>
		<li><a href="#footer">footer</a></li>
		<li><a href="#nav">navigation</a></li>	</ol>
</footer>
<nav id="nav">
	<h1>Navigation</h1>
	<ol>
		<li><a href="#header">header</a></li>
		<li><a href="#section">section</a></li>
		<li><a href="#article">article</a></li>
		<li><a href="#footer">footer</a></li>
		<li><a href="#nav">navigation</a></li>
	</ol>
</nav>
</body>
</html>