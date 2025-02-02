<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>rgb2.jsp</title>
<style type= "text/css">
html {
	border : 10px solid red;
}
body {
	border : 10px solid green;
}
div {
	border : 10px solid blue;
	width : 200px;
	height : 200px;
}

:focus {
	border: 10px dashed yellow; 
}

</style>
<script type="text/javascript">

window.onload = function(e) {
	let r = red.textContent;
	let g = green.textContent;
	let b = blue.textContent;
	
	box.style.backgroundColor = `rgb(\${r}, \${g}, \${b})`;
	
	box.oncontextmenu = function(e) {
		e.preventDefault();			// 우측마우스 기본 옵션메뉴 금지시키기. 
	}
	
	box.onmousedown= function(e) {
		console.log(e);
		switch (e.button) {
		case 0:
			if (e.ctrlKey)
				red.textContent = parseInt(red.textContent) - 10;
			else
				red.textContent = parseInt(red.textContent) + 10;
			break;
		case 1:
			if (e.ctrlKey)
				green.textContent = parseInt(green.textContent) - 10;
			else
				green.textContent = parseInt(green.textContent) + 10;
			break;
		case 2: 
			if (e.ctrlKey)
				blue.textContent = parseInt(blue.textContent) - 10;
			else
				blue.textContent = parseInt(blue.textContent) + 10;
			break;
		default:
			break;
		}
		
		let r = red.textContent;
		let g = green.textContent;
		let b = blue.textContent;
		
		box.style.backgroundColor = `rgb(\${r}, \${g}, \${b})`;
	}  
	
	box.onkeydown = function(e) {
		switch (e.code) {
		case "KeyR":
			if (e.key=='r')
				red.textContent = parseInt(red.textContent) - 10;
			else 
				red.textContent = parseInt(red.textContent) + 10;
			break;
		case "KeyG":
			if (e.key=='g')
				green.textContent = parseInt(green.textContent) - 10;
			else
				green.textContent = parseInt(green.textContent) + 10;
			break;
		case "KeyB":
			if (e.key=='b')
				blue.textContent = parseInt(blue.textContent) - 10;
			else
				blue.textContent = parseInt(blue.textContent) + 10;
		default:
			break;
		}
		
		let r = red.textContent;
		let g = green.textContent;
		let b = blue.textContent;
		
		box.style.background = `rgb(\${r}, \${g}, \${b})`;
	}

}
</script>
</head>
<body>
<h1>RGB 실험</h1>
<table>
<tbody>
<tr><td>R</td><td id="red">0</td></tr>
<tr><td>G</td><td id="green">0</td></tr>
<tr><td>B</td><td id="blue">0</td></tr>
</tbody>
</table>
<hr>
<div id="box" tabindex="1"></div>

</body>
</html>