/**
 * string mode에서는 8진수 033이 아닌 16진수를 사용해야함. 
 * 
 */
class VT100 {
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

VT100.clearScrean();

for (let i=0; i<5000; i++) {
	
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
	
	
	VT100.cursorMove(line, column);
	VT100.setForeground(fg);
	VT100.setBackground(bg);
	VT100.print(ch);
}


VT100.reset();
VT100.cursorMove(21, 1);
VT100.print("End...");