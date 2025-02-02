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
<title>loginFail.jsp</title>
<style>
  @import url('https://fonts.googleapis.com/css2?family=Dongle:wght@700&family=Exo&family=Jua&family=Single+Day&family=Stylish&display=swap');
</style>
<style type="text/css">
	body {
		width: 600px;
		height: 600px;
	}
	
	div {
		background-image: url("/img/omg.png");
		background-repeat: no-repeat;
		background-size: contain;		
		width: 400px;
	}
	h1 {
		margin-top: 100px;
	}
	h6 {
		margin-top: 100px;
	}
	#sub {
		width: 400px;
		height: 200px;
		text-align: center;
		position:relative;
		font-family: 'Single Day', cursive;
	}
	a {
		font-size: 20px;
		width: 200px;
		text-align: right;
	}

	body {
		background-color: neon;
	}
</style>
</head>
<body>
<div>
<h1 id='sub'>Login Failed</h1>


<%
	Exception exception = (Exception)request.getAttribute("exception");
%>
<h6 id='sub'><%=exception.getMessage() %></h6>


<a id='sub' href="/login" >re-try</a>

</div>
<hr>
</body>
</html>