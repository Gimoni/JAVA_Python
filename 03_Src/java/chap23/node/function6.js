/*
함수 function
화살표 함수로 표현 
*/

// 변수 초기화
let i = 0;

let tId =  setInterval(() => {
	console.log(i++);
	if (i==10) 
		clearInterval(tId);
}, 1000)
