<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Coche-Control" content="no-store">
<link rel="icon" href="faviconAlpha.png"> 
<title>innerHTML.jsp</title>
<style type="text/css">
ol {
	border: 10px solid red;
}
</style>
<script type="text/javascript">
window.onload = function(e) {
	console.log(e);
	
	ol.onmousedown = function (e) {
		console.log(e);
		
		let li = `
			<li>[DOWN] button=\${e.button} 
					   altKey=\${e.altKey}
					   ctrlKey=\${e.ctrlKey}
					   shiftKey=\${e.shiftKey}
					   metaKey=\${e.metaKey}
					   [\${e.clientX}, \${e.clientY}]		// 화면상 좌표.
					   [\${e.offsetX}, \${e.offsetY}]		//
					   <\li>
		   <li>[UP] button=\${e.button} 
		   altKey=\${e.altKey}
		   ctrlKey=\${e.ctrlKey}
		   shiftKey=\${e.shiftKey}
		   metaKey=\${e.metaKey}
		   [\${e.clientX}, \${e.clientY}]		// 화면상 좌표.
		   [\${e.offsetX}, \${e.offsetY}]		//
		   <\li>
		
		`
		this.innerHTML += li;
		}		
}

</script>
</head>

<body>
<h1>MouseEvent testing1</h1>
<h1>MouseEvent testing2</h1>
<h1>MouseEvent testing3</h1>
<h1>MouseEvent testing4</h1>
<h1>MouseEvent testing5</h1>
<ol id="ol">
</ol>
</body>
</html>

<script type="text/javascript">
	console.log("</html>");
</script>