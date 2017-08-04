package com.sopra.pox3.base;

public class PrimitiveApplication {

	public static void main(String[] args) {
		
		byte x = 10;
		int y = 234637;
		long z = 100_000_000_000L;
		
		float f = 12;
		f = 2.34f;
		
		char c = 'x';
		
		boolean vrai = false;
		
		boolean test =! (3 > 2 & (c!= 'x') || (2 >3));
		System.out.println(test);
		
	
		y =  8;
		int move = y >> 1 ;
		System.out.println(move);
		move = y<<1;
		System.out.println(move);
		
		String string = "tableau";
	}

}
