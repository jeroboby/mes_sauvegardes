package com.sopra.pox3.base.equals;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EqualApplication {

	public static void main(String[] args) {
		
		Card c1 = new Card(8, 'h');
		Card c2 = new Card(8, 's');
		Card c3 = new Card(8, 'h');
		
		boolean result = c1.equals(c2);
		
		System.out.println(result);
		
		result = c1.equals(c3);
		System.out.println(result);

		Set<Card> set = new HashSet<>();
		/*set.add(c1);
		set.add(c2);
		set.add(c3);
		*/
		Collections.addAll(set, c1, c2,c3);
		
		System.out.println(set);
	}

	
}
