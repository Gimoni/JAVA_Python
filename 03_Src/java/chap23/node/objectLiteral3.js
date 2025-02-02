/**
 * 객체 리터럴(Object Literal) 
 * 객체의 속성에 접근 
 */

let obj = {
	line: 10,
	'hello world': 20,
	'@@@xxx' : function() {
		console.log("@@@xxx....");
	},
	'background-color': '10px', 
}

console.log(obj.line);
console.log(obj['hello world']);
obj['@@@xxx']();

console.log(obj['background-color'])
console.log("+++++++");
console.log("");
console.log("");
console.log("for in 반복문 형태로 객체 전부를 출력");
console.log("");

for (let attr in obj) {
	console.log(attr)
}

console.log("");

for (let attr in obj) {
	console.log(attr + "" + obj[attr])
}

console.log("");
console.log("#######################");
let arr = [10, 20, 30];
arr.xxx = 100;
arr.yyy = 200;



console.log("of"); 	
console.log(" ");

for (let v of arr) { 	// 배열의 요소를 for of 반복문을 통해 출력 
	console.log("of " + v);
}

console.log(" ");
console.log("in");
console.log(" ");		


for (let v in arr) {//	객체의 속성을 for in 반복문을 통해 출력  
	console.log("in " + v + " " + arr[v]);
}

