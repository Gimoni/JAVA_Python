package com.example.alpha.util;

public class Alpha {
	
	private Alpha() {
		
	}

	public static void font() {
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


}
