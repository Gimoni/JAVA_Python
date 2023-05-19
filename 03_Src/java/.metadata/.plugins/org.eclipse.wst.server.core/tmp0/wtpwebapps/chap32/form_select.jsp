<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>form_select.jsp</title>
</head>
<body>
<h1>From Select Option 실습</h1>
<hr>
<form action="result_select.jsp" method="post">
	<select name="fg" multiple="multiple">
		<option value="red">Red</option>
		<option value="green">Green</option>
		<option value="blue">Blue</option>
		<option value="black">Black</option>
	</select>
	<select name="bg">
		<optgroup label="Dark">
			<option value="red">Red</option>
			<option value="green">Green</option>
			<option value="blue">Blue</option>
			<option value="black">Black</option>
		</optgroup>
		<optgroup label="Bright">
			<option value="red">Red</option>
			<option value="green">Green</option>
			<option value="blue">Blue</option>
			<option value="black">Black</option>
		</optgroup>
	</select>
	<br>
	<textarea name="content" rows="10" cols="20"></textarea>
	<input type="submit" value="submit"> 
</form>

</body>
</html>