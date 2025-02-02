<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="/heart_like_love_icon.png"> 
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link rel="stylesheet" href="/webjars/bootstrap/5.2.3/css/bootstrap.css">
<script src="/webjars/bootstrap/5.2.3/js/bootstrap.js"></script>
<script src="/webjars/jquery/jquery.min.js"></script>
<title>grid.jsp</title>
<style>
  @import url('https://fonts.googleapis.com/css2?family=Dongle:wght@700&family=Exo&family=Jua&family=Single+Day&family=Stylish&display=swap');
</style>
<style type="text/css">
body {
	border: 10px solid red;
}
article {
	border: 10px solid blue;
}

#top, #bottom {
	height: 100px;
	font-size: 30pt;
	line-height: 100px;
	text-align: center;
}
#left, #center, #right {
	height: 500px;
	font-size: 30pt;
	line-height: 500px;
	text-align: center;
}

</style>
</head>
<body class="container">
<section class="row">
	<article id="top" class="col">Top</article>
</section>
<section class="row">
	<article id="left" class="col-12 col-sm-4 col-md-2">Left</article>
	<article id="center" class="col-8 col-sm-8 col-md-6">Center</article>
	<article id="right" class="col-4 col-sm col-md-4">Right</article>
</section>
<section class="row">
	<article id="bottom" class="col">Bottom</article>
</section>

</body>
</html>