<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store"> 
<title>input.jsp</title>
</head>
<body>
<h1 id="age"></h1>
<script type="text/javascript">
	let age = prompt("당신의 나이는 ? ", 10);
	console.log(typeof age);
	console.log(age);
	console.log("10년 후 당신의 나이는 " + (Number(age)+10) + " 입니다.")
	console.log("10년 후 당신의 나이는 " + (parseInt(age)+10) + " 입니다.")
	console.log("10년 후 당신의 나이는 " + (+age +10) + " 입니다.")
</script>

</body>
</html>