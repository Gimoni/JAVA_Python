<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>audio.jsp</title>
</head>
<body>
<h1>오디오 실습</h1>
<hr>
<audio src="../media/Kalimba.mp3"></audio>
<hr>
<audio src="../media/Kalimba.mp3" controls="controls"></audio>
<hr>
<audio src="../media/Kalimba.mp3" controls="controls" preload="auto"></audio>
<hr>
<audio src="../media/Kalimba.mp3" controls="controls" preload="auto" autoplay="autoplay"></audio>
<hr>

<!-- 모든 웹브라우저에 플레이 지원  -->
<audio controls="controls">
	<source src="../media/Kalimba.mp3" type="audio/mp3">
	<source src="../media/Kalimba.ogg" type="audio/ogg">
</audio>

</body>
</html>