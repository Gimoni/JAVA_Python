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



	
class AlphaRun {
	
/*		line=0;
		column=0;
		fg=0;
		bg=0;
		ch="A";*/
		
		constructor( ) {	// 생성자 	변수가 필드로 생성됨. 
		this.line = parseInt(1, 20);
		this.column = parseInt(1, 40);
		this.fg = parseInt(Math.random()*8+30);
		this.bg = parseInt(Math.random()*8+30);
		this.ch = String.fromCharCode(Math.random()*26 + "A".charCodeAt(0));
	}
	

	
	show(){
		VT100.cursorMove(this.line, this.column);
		VT100.setForeground(this.fg);
		VT100.setBackground(this.bg);
		VT100.print(this.ch);
	}

	hide(){
		VT100.cursorMove(this.line, this.column);
		VT100.reset();
		VT100.print(' ');
	}
	
	run(){
		VT100.clearScrean();
		VT100.cursorMove(this.line, this.column);
		while (this.line==1 && this.column==40)
				this.line++;
			if(this.line==20 && this.column==40)
				this.column--;
			else if(this.line==20 && this.column==1)
				this.line--;
			else if(this.line==1 && this.column==1)
				this.column++;
				
		VT100.cursorMove(this.line, this.colume);
		VT100.setForeground(this.fg)
		VT100.setBackground(this.bg)
		VT100.print(this.ch);
	}
	

	// 필드
	blink = true;
	running= true;
	
	
	
	loop() {
		if(this.run){
			VT100.clearScrean();
			this.run();
			this.show();
			this.hide();
		}
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
		this.line = parseInt(Math.random()*20+1);
		this.column = parseInt(Math.random()*40+1);
		this.fg = parseInt(Math.random()*8+30);
		this.bg = parseInt(Math.random()*8+30);
		this.ch = String.fromCharCode(Math.random()*26 + "A".charCodeAt(0));
	}
	
	show(){
		VT100.cursorMove(this.line, this.column);
		VT100.setForeground(this.fg);
		VT100.setBackground(this.bg);
		VT100.print(this.ch);
	}
	
	hide(){
		VT100.cursorMove(this.line, this.column);
		VT100.reset();
		VT100.print(' ');
	}
	
	left(){
		VT100.cursorMove(this.line==1, this.colume==1);
		VT100.setForeground(this.fg)
		VT100.setBackground(this.bg)
		VT100.print(ch, this.colume++);
	}
	
	right(){
		
	}
	
	up() {
		
	}
	
	down() {
		
	}
	// 필드
	blink = true;
	
	loop() {
		
		if (this.blink)
			this.show();
		else
			this.hide();
		
		this.blink = !this.blink;
		
		if(this.left){
			this.show();
			this.hide();
			VT100.cursorMove(this.line, this.column);
			
		}
	}
}

VT100.reset();
VT100.clearScrean();
VT100.cursorMove(1,1);

for(let i=0; i<10; i++) {
	let r = new AlphaRun();
	setInterval(()=> r.loop(), 1000);
}






 