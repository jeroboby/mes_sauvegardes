package com.sopra.pox3.base;

public class FirstApplication {

	public static void main(String[] args) {
		
		System.out.println("hello world");
		
		int a = 2;
		int[] array;
		
		Integer wrapper;
		String string = "some text";
		
		String otherString = new String("some text");
		String compareString = new String("some text");
		String lastString = otherString;
		
		System.out.println(otherString == compareString);
		System.out.println(otherString.equals(compareString));
		
		String veryLastString = "some text";
		System.out.println(string.equals(veryLastString));
		System.out.println(string == veryLastString);
		
		String x = string + 2;
		x = x.concat("Other");
		x = string.concat(String.valueOf(2));
		
		int b = a + 2;
		int c = a / 0;
		}

}
