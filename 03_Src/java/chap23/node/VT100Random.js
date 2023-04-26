/**
 * string mode에서는 8진수 033이 아닌 16진수를 사용해야함. 
 * 
 */
class VT100 {
	static F_BLACK 		= 30;
	static F_RED		= 31;
	static F_GREEN		= 32;
	static F_YELLOW		= 33;
	static F_BLUE		= 34;
	static F_MAGENTA	= 35;
	static F_CYAN		= 36;
    static F_WHITE		= 37;
    
	static B_BLACK 		= 40;
	static B_RED		= 41;
	static B_GREEN		= 42;
	static B_YELLOW		= 43;
	static B_BLUE		= 44;
	static B_MAGENTA	= 45;
	static B_CYAN		= 46;
    static B_WHITE		= 47;
    
	static num = 100;	// 속성(필드)
	static clearScrean() {
		process.stdout.write("\x1b[2J");
	}
	
	static cursorMove(line, column) {
		process.stdout.write("\x1b["+line+";"+column+"H");
	}
	
	static setForeground(fg) {
		process.stdout.write("\x1b["+fg+"m");
	}
	static setBackground(bg) {
		process.stdout.write("\x1b["+bg+"m");
	}
	
	static reset(bg){
		process.stdout.write("\x1b["+"0m");
	}
	
	static print(str){
		process.stdout.write(str);
	}
}


class Alpha {
	constructor(line, column, fg, bg, ch ) {	// 생성자 	변수가 필드로 생성됨. 
		this.line = 1;
		this.column = 1;
		this.fg;
		this.bg;
		do {
			var fg = Math.trunc(Math.random()*8 + 30);
			var bg = Math.trunc(Math.random()*8 + 30);;
		} while (fg==bg);
		var	ch = Math.trunc(Math.random()*25 + 'A'.codePointAt(0))
		this.ch = String.fromCodePoint(ch);
	}
	
	show(){
		VT100.cursorMove(line, column);
		VT100.setForeground(fg);
		VT100.setBackground(bg);
		VT100.print(ch);
	}
	
	hide(){
		
	}
}


VT100.clearScrean();

let a = new Alpha();
let b = new Alpha();
let c = new Alpha();
let d = new Alpha();
let e = new Alpha();


// 2차원 배열 생성
let rect = [];
for (let i=0; i<20; i++) {
	rect[i] = [];
	for (let j=0; j<40; j++) {
		rect[i][j] = false;
	}
}
// count 초기화
let forCount=0;
let count=0;
	//ctrl shift c = format.. 
let id;
function loop() {
	
	forCount++;
	VT100.cursorMove(1, 42);
	VT100.reset();
	VT100.print("forCount= " + forCount);
	
	
	let line	= Math.trunc(Math.random()*20 + 1);
	let column	= Math.trunc(Math.random()*40 + 1);
	let fg;
	let bg;
	do {
		fg		= Math.trunc(Math.random()*8 + 30);
		bg		= Math.trunc(Math.random()*8 + 40);
	} while (fg==bg);
	let ch		= Math.trunc(Math.random()*25 + 'A'.codePointAt(0))
	ch = String.fromCodePoint(ch);
	
	rect.sort((a, b) => a.line-b.line)
	VT100.cursorMove(line, column);
	VT100.setForeground(fg);
	VT100.setBackground(bg);
	VT100.print(ch);
	
	if (!rect[line-1][column-1]) {
		rect[line-1][column-1] = true;
		count++;
		VT100.cursorMove(2, 42);
		VT100.reset();
		VT100.print("count = " + count);
	}
	
	if (count==800){		
		clearInterval(id);
		VT100.cursorMove(22, 1);
		VT100.setForeground(VT100.F_RED);
		VT100.setBackground(VT100.B_BLUE);
		VT100.print("End...");
		VT100.reset();
	}
}

//id = setInterval(loop, 10);
// javascript Lambda ()=> 
id = setInterval(()=> loop(), 1);



 