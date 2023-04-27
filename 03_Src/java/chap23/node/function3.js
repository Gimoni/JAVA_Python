/*
함수 function

*/

let tId =  setInterval(step1, 1000);	// clearInterval이 없으면 무한수행. 

let i=0;

// 명명 함수 표현 
function step1() {
	console.log(i++);
	if (i==10) 
		clearInterval(tId);
}