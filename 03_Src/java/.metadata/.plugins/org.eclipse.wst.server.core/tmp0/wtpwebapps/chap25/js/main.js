/**
 * 
 */

/*window.onload = function(e) {
	console.log("onload..." + e.type);
}*/

// class 

class Alpha {
	constructor() {
		window.addEventListener("load", this);
	}
	
	handleEvent(e) {
		console.log("handleEvent..." + e.type);
	}	
}

new Alpha();

