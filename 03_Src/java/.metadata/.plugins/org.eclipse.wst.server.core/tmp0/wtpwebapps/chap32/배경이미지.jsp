<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>배경이미지.jsp</title>
<style type="text/css">
	div {
		border: 10px dotted red;
	}
	
	.back1 {
		height : 400px;
		background-size: contain;  /* contain =높이와 너비를 자동으로 맞춰줌. */
		background-position: center;
		background-repeat: no-repeat;
		background-image: url("img/dev_rabbit1.jpg");
	}
	
	.back2 {
		height : 400px;
		background-size: cover;
		background-repeat: no-repeat;
		background-image: url("img/dev_rabbit2.jpg"), url("img/dev_rabbit1.jpg");
	}
	
	.back3 {
		height : 400px;
		background-size:100px;
		background-repeat: repeat;
		background-image: url("img/dev_rabbit3.jpg");
	}
	
</style>
</head>
<body>
<div class="back1">
	<h1>Background image 실습1</h1>
	
</div>
<hr>
<div class="back2">
	<h1>Background image 실습2</h1>
	
</div>
<hr>
<div class="back3">
	<h1>Background image 실습3</h1>
	
</div>



</body>
</html>