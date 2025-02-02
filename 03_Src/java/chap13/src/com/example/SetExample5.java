package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import util.Alpha;
import util.VT100;

public class SetExample5 {
	/*
	 * list는 생성순서에 맞게 출력..
	 * 
	 */
	
	static class SetAlpha extends Alpha {
		
		void show() {
			show(1, 1);
		}
		
		void show(int offLine, int offColumn) {
			VT100.cursorMove(line + offLine-1, column + offColumn-1);
			VT100.setForeground(fg);
			VT100.setBackground(bg);
			VT100.print(ch);
		}
	}
	public static void main(String[] args) {
		VT100.reset();
		VT100.clearScreen();
		// set
		HashSet<SetAlpha> set = new HashSet<>();
		
		// list
		var list = new ArrayList<SetAlpha>();
		
		// 생성 list, set
		for(;;) {
			SetAlpha a = new SetAlpha();
			list.add(a);
			set.add(a);
			
			// set의 중복제어 방식에 
			// 마지막 데이터가 저장되도록 
			// 기존의 데이터를 삭제하는 연산을 줌 
			
			if (set.contains(a)) {
				set.remove(a);
			}
			
			set.add(a);
				
			if (set.size() == 800)
				break;
		}
		
		//람다식 리스트를 읽어서 a의 show 호출.
//		list.forEach(a -> {a.show();});
//		list.forEach(a -> a.show());
		
		// 메소드참조로 출력 : 매개변수의 메소드 참조 
		list.forEach(SetAlpha::show);
		
		// set 출력
		set.forEach(a -> {
			a.show(1, 42);
			
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		
		
		VT100.cursorMove(21, 1);
		System.out.println("End...");
	}
}
