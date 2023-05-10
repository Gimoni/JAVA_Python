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
<title>classSelector.jsp</title>
<style type="text/css">
.box {
	width: 100px;
	height: 100px;
	border: 1px;
}
.red {
	border: 1px solid red;
}
.green {
	border: 1px solid green;
}
.blue {
	border: 1px solid blue;
}
.center {
	text-align: center;
	line-height: 100px;
}
</style>
<script type="text/javascript">

window.onload = function(e) {
	box1.oncontextmenu = function(e){ // 오른쪽 마우스 클릭 기본설정 제거. 
		return false;
	}
	box1.onmousedown = function(e) {
		switch(e.button) {
		case 0: 
			this.classList.toggle("box")
			break;
		case 1:
			this.classList.toggle("red")
			break;
		case 2:
			this.classList.toggle("center")
			break;
		} 
	}
}

</script>
</head>
<body>
<div id="box1">box1</div>
<div id="box2" class="red box">box2</div>
<div id="box3" class="box green">box3</div>
<div id="box4" class="box blue">box4</div>
<button id="btn" class="btn btn-primary">Button1</button>
</body>
</html>