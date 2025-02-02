/**
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
	
	static clearScreen() {
		process.stdout.write("\x1b[2J");
	}
	static cursorMove(line, column) {
		process.stdout.write("\x1b["+line+";"+column+"H")
	}
	static setForeground(fg) {
		process.stdout.write("\x1b["+fg+"m")
	}
	static setBackground(bg) {
		process.stdout.write("\x1b["+bg+"m")
	}
	static reset(bg) {
		process.stdout.write("\x1b[0m")
	}
	static print(str) {
		process.stdout.write(str)
	}
	
}

class Alpha {
	constructor() {
		this.line = 1;
		this.column = 1;
		this.fg = parseInt(Math.random()*8 + 30);
		this.bg = parseInt(Math.random()*8 + 40);
		this.ch = String.fromCharCode(Math.random()*26 + "A".charCodeAt(0));
		
		this.show();
		
		this.timerId = setInterval(()=> this.move(), Math.random()*100 + 10)
		
		setTimeout(() => {
			clearInterval(this.timerId)
			VT100.cursorMove(21, 1);
			VT100.reset();
			VT100.print("Program End...");
		}, 60*1000);
	}
	show() {
		VT100.cursorMove(this.line, this.column);
		VT100.setForeground(this.fg);
		VT100.setBackground(this.bg);
		VT100.print(this.ch);
	}
	
	hide() {
		VT100.cursorMove(this.line, this.column);
		VT100.reset()
		VT100.print(' ');
	}
	
	direction = 0;
	move() {
		this.hide();
		
		switch(this.direction) {
		case 0:	// right
			this.column++;
			break;
		case 1: // bottom
			this.line++;
			break;					
		case 2: // left
			this.column--;
			break;
		case 3: // top
			this.line--;		
			break;
		}
		
		if (this.line==1 && this.column==40)
			this.direction = 1;
		else if (this.line==20 && this.column==40)
			this.direction = 2;
		else if (this.line==20 && this.column==1)
			this.direction = 3;	
		else if (this.line==1 && this.column==1)
			this.direction = 0;
		
		this.show();
	}
}

VT100.reset();
VT100.clearScreen();

for (let i=0; i<100; i++) {
	let a = new Alpha();
}

