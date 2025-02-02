/**
 *  함수별 호출 차이 확인 
 *  function의 this. 객체는 자기자신. 
 */

class Alpha {
	line = 10;
	column = 10;
	
	show = function() {	// 
		console.log("show() = " + this.line)
	}
	
	constructor() {
		let x = function() { // function 객체에 line이 존재하지 않기 때문에 this.line 을 찾을 수 없고 에러. 
			console.log("x() = " + this.line) 		// this . undefined 
		}
		let y = () => {	// 화살표 함수는 함수가 정의된 환경에 속해 있는 객체를 참조하기 때문에 this.line 접근 가능. (from Alpha() line = 10;)
			console.log("y() = " + this.line)
		}
		
		try {	
			x();
		} catch (e) {
			
		}
				
		y();
	}
}

let a = new Alpha();
a.show();	// this.line = Alpha line = 10; 