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
<title>박스모델5.jsp</title>
<style type="text/css">
	.box {
		width:100px;
		height: 100px;
		border: 1px solid red;
	}

	.box1 {
		overflow: auto;
		padding-top: 10px;
		padding-right: 20px;
		padding-bottom: 30px;
		padding-left: 40px
	}
	.box2 {
		padding: 10px 20px 30px 40px;
	}
	.box3 {
		padding: 10px 20px;
	}
	.box4 {
		padding: 10px;
	}
	
</style>

</head>
<body>
<div class="box box1">box1 box1 box1 box1 box1</div>
<div class="box box2">box2</div>
<div class="box box3">box3</div>
<div class="box box4">box4</div>


</body>
</html>