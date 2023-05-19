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
<title>박스모델9.jsp</title>
<style type="text/css">
	.box {
		border: 5px solid red;
		width:200px;
		height: 200px;
	}

	.box1 {
		border-top-left-radius: 50px 100px;
		border-top-right-radius: 50px 100px;
	}
	.box2 {
		border-bottom-left-radius: 50px 100px;
		border-bottom-right-radius: 50px 100px;
	}
	.box3 {
		border-radius: 50px 100px;
		
	}
	
	.box4 {
		transition: 3s;
	}
	
	.box4:hover {
		border-radius: 100px;
		transition : 2s;
	}
	
</style>

</head>
<body>
<div class="box box1">box1</div>
<div class="box box2">box2</div>
<div class="box box3">box3</div>
<div class="box box4">box4</div>


<!--Radius -->

</body>
</html>