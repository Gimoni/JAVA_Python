<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script> 
<title>박스모델7.jsp</title>
<style type="text/css">
	.box {
		border: 10px solid red;
		width:100px;
		height: 100px;
	}

	.box1 {
		border-color: green;
	 	border-top-style: dashed;
	 	border-right-style: dotted;
	 	border-bottom-style: solid;
	 	border-left-style: double;
	}
	.box2 {
		border-color: orange;
		border-style: dashed dotted solid double;
	}
	.box3 {
		border-color: blue cyan;
		border-style: dashed dotted;
	}
	.box4 {
		border-color: purple pink;
		border-style: double;
	}
	
</style>

</head>
<body>
<div class="box box1">box1</div>
<div class="box box2">box2</div>
<div class="box box3">box3</div>
<div class="box box4">box4</div>


<!-- border 크기(4가지) 스타일(4가지) 컬러(4가지) 3가지 속성. 총 64가지의 경우의 수.. -->

</body>
</html>