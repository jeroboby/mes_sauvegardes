package com.sopra.pox3.base.autoboxing;

import java.util.Arrays;
import java.util.List;

public class AutoboxingApplication {

	public static void main(String[] args) {

		new AutoboxingApplication().init();
		new AutoboxingApplication().compare();
		new AutoboxingApplication().itsATrap();

		List<Boolean> list = new AutoboxingApplication().getTruths(); // On peut pas creer de liste avec des primitives !!
		System.out.println(list);
		System.out.println(list.get(0).compareTo(false));
	}

	public void init() {
		int x = 2;
		Integer y = 2;
		Integer z = new Integer(2);

		System.out.println(x == y);

		System.out.println(x == z);

		z = new Integer(x); // No autoboxing, à la dure

		z = x; // Autoboxing ; The compiler works for us;
	}

	void compare() {

		Integer a = new Integer(12);
		Integer b = new Integer(12);
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}

	void itsATrap() {

		Integer a = 13;
		Integer b = 13;

		System.out.println(a == b);
		System.out.println(a.compareTo(b));

		Integer x = 1000;
		Integer y = 1000;
		System.out.println(x == y); // Do not use
		System.out.println(x.equals(y)); // Integer sont des objets, ils doivent
											// etre comparés avec equals !!
	}

	// Wrapper can be specify a List
	List<Boolean> getTruths() {
		
		return Arrays.asList(true, false, false, false, true, false, true);
	}
}
