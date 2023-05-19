<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>상태선택자.jsp</title>
<style type="text/css">

input[type="checkbox"], input[type="radio"] {
	width: 1em;
	height: 1em;
}

input:checked {
	width: 2em;
	height: 2em;
	transition : all 1s;
}

div {
	width: 10px;
	height: 10px;
}

div:hover {
	background :blue;
	width: 100px;
	height: 100px;
	transition : all 2s;
}

input[type="text"] {
	width :10px;
	transition : all 1s;
}

input[type="text"]:focus {
	background: red;
	width : 200px;
	transition : all 2s;
}

input:disabled {
	border: 1px dotted red;
}

input[type="reset"]:enabled {
	border: 2px dashed blue;
}


</style>
</head>
<body>

<input type="checkbox" checked="checked"><input type="checkbox"><input type="checkbox"> <br>
<input name="x" type="radio"><input name="x" type="radio"><input name="x" type="radio"> <br>
<input type="text">
<input type="reset">
<input type="submit" disabled="disabled">

<div>box</div>

</body>
</html>