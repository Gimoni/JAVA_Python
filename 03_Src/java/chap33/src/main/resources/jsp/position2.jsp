<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>position2.jsp</title>
<script type="text/javascript">
</script>
<style type="text/css">
html {
	border: 1px solid pink;
}
body {
	border: 1px dotted gray;
}
h1 {
	border: 1px solid orange;
}
span {
	border: 1px solid cyan;
}

.st {
	background: olive;
}

.rl {
	position: relative;
	background: lime;
	opacity : 0.5;
	top: 100px;
}

.r1 {
	right: 200px;
	top: 0px;
}
.r2 {
	left : -200px;
	top:-300px;
}
.r3 {
	bottom: 300px;
	right : -200px;
}
 p:hover {
 	border :10px solid pink;
 	transition : 1s;
 }
 
 p.rl {
 	right: -200px;
 }
 
 .absolute {
 	position : absolute;
 	background : pink;
 	width: 300px;
 	opacity: 0.8;
 }
 
 .ab1 {
	margin: 0;
	rigit: 300px;
 }
 .ab2 {
 	margin:0;
 	left : 300px;
 	top :0;
 }
 .ab3 {
	top: 200px;
	left: 600px;
}
.ab4 {
	left: 200px;
	bottom: 100px;
}
p[class~="ab6"] {
	top: 0;
	left: 800px;
}
p[class~="ab5"] {
	top: 0;
	left: 700px;
}
 
</style>
</head>
<body>
<div class="static">
	<h1 class="st">Position static1</h1>
	<h1 class="st">Position static2</h1>
	<h1 class="st">Position static3</h1>
	<h1 class="st">Position static4</h1>
	<p class="st">position static5</p>
	<p class="st">position static6</p>
</div>
<hr>
	<h1 class="rl r1">Position relative1</h1>
	<h1 class="rl r2">Position relative2</h1>
	<h1 class="rl r3">Position relative3</h1>
	<h1 class="rl r4">Position relative4</h1>
	<p class="rl r5">position relative5</p>
	<p class="rl r6">position relative6</p>
<hr>
<div class="absolute">
	<h1 class="absolute ab1">Position absolute 1</h1>
	<h1 class="absolute ab2">Position absolute 2</h1>
	<h1 class="absolute ab3">Position absolute 3</h1>
	<h1 class="absolute ab4">Position absolute 4</h1>
	<p class="absolute ab5">position absolute 5</p>
	<p class="absolute ab6">position absolute 6</p>
</div>


</body>
</html>