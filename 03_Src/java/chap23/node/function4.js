/*
함수 function
이름이 없는 함수로 작성. 

*/

// 변수 초기화
let i = 0;

let tId =  setInterval(function() {
	console.log(i++);
	if (i==10) 
		clearInterval(tId);
}, 1000)
