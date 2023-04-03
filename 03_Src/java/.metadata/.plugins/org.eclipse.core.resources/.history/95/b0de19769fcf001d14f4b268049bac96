package com.example;

import util.VT100;

public class TestAndroidPreView {
	

	 public class Alpha {
	
		 char ch = equal;
	   
	    public void font(char ch) {
	        char[][] equal = {
	                {'=','=','=','=','=',},
	                {'=',' ',' ',' ','=',},
	                {'=','=','=','=','=',},
	                {'=',' ',' ',' ','=',},
	                {'=',' ',' ',' ','='},
	        };
	        for (int i=0; i<equal.length; i++) {
	            for (int j=0; j<equal[i].length; j++) {
	                System.out.printf("%c", equal[i][j]);
	            }
	            System.out.println();
	        }
	    }
	
	    void show() {
	        VT100.cursorMove(10,20);
	//        alpha.font();
	    }
	        
	 }
	 
 	public static void main(String[] args) {
 		Alpha alpha = new Alpha();
 		VT100.cursorMove(10, 20);
		alpha.font(equal);
	}

}

