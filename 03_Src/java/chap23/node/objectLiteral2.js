/**
 * 객체 리터럴(Object Literal) 
 */

let arr = [10, 20, 30];		// 배열 리터럴
let obj = {};				// 객체 리터럴

class Alpha {
	constructor() {
		this.line = 10;
		this.column = 20;
		this.fg = 31;
		this.bg = 44;
		this.ch = 'A';	
	}
	hide = () => { // 
		console.log("[" + this.fg + "," + this.bg + "]");	
		console.log(this);
		console.log(typeof this)
	}
	show() {
		console.log("[" + this.line + "," + this.column + "]");	
	}
};

let obj2 = new Alpha();

obj2.show();
obj2.hide();


console.log(obj2.line);
console.log(obj2['line']);

 