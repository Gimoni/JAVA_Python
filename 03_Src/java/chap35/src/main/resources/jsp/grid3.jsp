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
<title>grid3.jsp</title>
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
section#s2 {
	border: 10px solid yellow;
}
#s2 {
	
}

#2top, #2bottom{
	height:10px;
	font-size: 10pt;
	line-height: 70px;
}

</style>
</head>
<body class="container">
<section class="row">
	<article id="top" class="col">Top</article>
</section>
<section class="row">
	<article id="left" class="col-12 col-sm-4 col-md-2">Left</article>
	<article id="center" class="col-8 col-sm-8 col-md-6">
		<section id="s2" class="row">
			<article id="2" class=col>Top</article>
		</section>
		<section id="s2" class="row">
			<article id="left2" class=col-2>left</article>
			<article id="center2" class=col-6>center</article>
			<article id="right2" class=col-4>right</article>
		</section>
		<section id="s2" class="row">
			<article id="bottom2" class=col>bottom</article>
		</section>
	</article>
	<article id="right" class="col-4 col-sm col-md-4">Right</article>
</section>
<section class="row">
	<article id="bottom" class="col">Bottom</article>
</section>

</body>
</html>