package com.example;

import java.util.Random;

import util.Color;
import util.VT100;

public class TestAndroidPreView {
	

	 class Alpha {

		 Random r = new Random();
		 int line;
		 int column;
		 Color fg;
		 Color bg;
		 String str;
		 char[][] ch = {
				{'=','=','=','=','='},
				{'=','=','=','=','='},
				{'=','=','=','=','='},
				{'=','=','=','=','='},
				{'=','=','=','=','='},
			};
		 
		 public Alpha () {
			 line = 10;
			 column = 20;
			 
			 do {
				 fg = Color.values()[2];
				 bg = Color.values()[2];			 
			 }while (fg==bg);
			 
		 }
		 
		 void show() {
			 VT100.cursorMove(line, column);
			 VT100.setForeground(fg);
			 VT100.setBackground(bg);
			 for(int i=0; i<ch.length; i++) {
				 for(int j=0; j<ch[i].length; j++) {
					 
					 
				 }
			 }
			 
		 }
		 
	}

}

