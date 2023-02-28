import java.awt.Color;

public class RectangleExample {

	public static void main(String[] args) {
		Turtle t = new Turtle();
		Turtle.setCanvasSize(600, 600);		// 
		
		t.speed(1000);
		t.penColor(Color.yellow);
		
		t.up();								// 팬을 들고 
		t.setPosition(-200, 0); 			// 절대좌표위치로 이동
		
		
		t.down();							// 
		t.forward(400);
		
		t.up();
		t.setPosition(0, 200);
		
		t.down();
		t.setDirection(270);
		t.forward(400);
		
		int a, b;
		a = 200;
		b = 200;
		double length = Math.pow(a, 2) + Math.pow(b, 2);
		length = Math.sqrt(length);
		t.left(90+45);
		t.forward(length);
		
		t.left(90);
		t.forward(length);
		
		t.left(90);
		t.forward(length);
		
		t.left(90);
		t.forward(length);
		
		t.home();
		
		double radius = Math.pow(a, 2) - Math.pow(length/2, 2); 	// 반지름 구하기
		
		radius = Math.sqrt(radius);
		
		t.dot("red", radius * 2);		// 지름
		
		
	}

}
