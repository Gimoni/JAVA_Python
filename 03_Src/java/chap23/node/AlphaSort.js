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
		process.stdout.write(str+"");
	}
}


class Alpha {
	// 속성을 정의. 
/*	line =0;
	column =0;
	fg =0;
	bg =0;
	ch =0;*/
	
	constructor( ) {	// 생성자 	변수가 필드로 생성됨. 
		this.line = parseInt(Math.random()*20 +1);
		this.column = parseInt(Math.random()*40 +1);
		this.fg = parseInt(Math.random()*8+30);
		this.bg = parseInt(Math.random()*8+40);
		this.ch = String.fromCharCode(Math.random()*26 + "A".charCodeAt(0));
	}

}


class AlphaSort extends Alpha {
	constructor(line, column) {
		super() 
		this.line = line;
		this.column = column;
			
		
	}
}	

let alphas = [new AlphaSort(1, 2), new AlphaSort(3, 10), new AlphaSort(20,1)];
	
console.log(alphas)
console.table(alphas)

// 람다식 매개변수 (요소가 넘어옴. )
let rtn = alphas.findIndex((a)=> a.line==3 && a.column==10);
console.log("rtn = " + rtn);
	
	// 배열의 원소 인덱스 삭제 : 배열의 크기는 변하지 않고 배열원소만 삭제.
//delete alphas[rtn]
alphas.splice[rtn]
	
console.log(alphas);
console.table(alphas);

console.log(alphas.length);

 