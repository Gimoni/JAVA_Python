<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>가시성2.jsp</title>
<style type="text/css">
	div, span {
		border: 1px solid red;
	}
	span {
		font-size: 20px;
	}
	.box1 {
		width : 100px;
	}
	
	.box2 {
		width : 100px;
		height : 100px;
	}
	.span1 { /* 적용안됨. */
		width: 100px;
		height: 100px;
	}
	.span2 {
		border: 10px solid blue;
		padding: 10px;
	}
	.span3 {
		display: inline-block;
		width: 100px;
		height: 100px;
	}
	.span4, .box4 {
		display: none;
	}
	
	article {
		border: 1px solid red;
		width: 100px;
		height: 100px;
	}
	
	.article1, .article2, .article3 {
		float:right;
	}
	
	.article1 {
		width: 19%;
	}
	
	.article2 {
		width: 60%;
	}
	
	.article3 {
		width: 19%
	}
	main {
		border: 2px solid black;
		display: flex;
	}
	section {
		flex-grow: 1;
		border: 2px solid red;
		height: 400px;
	}
	section:first-child {
		flex-grow: 1;
	}
	section:nth-child(2) {
		flex-grow: 3;
	}
	section:last-child {
		flext-grow: 1;
	}
	
</style>
</head>
<body>
<div class="box1">box1</div>
<div class="box2">box2</div>
<div class="box3">box3</div>
<div class="box4">box4</div>
<hr>
<span class="span1">inline1</span>
<span class="span2">inline2</span>
<span class="span3">inline3</span>
<span class="span4">inline4</span>
<hr>
<article class="article1">article1</article>
<article class="article2">article2</article>
<article class="article3">article3</article>
<hr style="clear:both;">
<h1>Flex Layout</h1>
<main>
	<section>Left</section>
	<section>Center</section>
	<section>Right</section>
</main>











</body>
</html>