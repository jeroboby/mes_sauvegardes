package com.sopra.pox3.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PenguinApplication {

	public static void main(String[] args) {
		List<Pengouin> penguins = new ArrayList<>();

		Pengouin commandant = new Pengouin("Commandant", 15);
		Pengouin kowalski = new Pengouin("Kowalski", 8);
		Pengouin soldat = new Pengouin("Soldat", 21);
		Pengouin rico = new Pengouin("Rico");
		
		
		Emperor napoleon = new Emperor ("napoleon");
		
		
		napoleon.slide();
		napoleon.slide(commandant);
		
		Emperor charlemagne = new Emperor ("Charlemagne");
		charlemagne.slide(napoleon);
		
		System.out.println("=== Complex stuff ===");
		Pengouin p = napoleon;
		p = commandant;
		p = napoleon;
		p.slide();
		
		
		p =charlemagne;
		napoleon.slide(p);
		
		
		penguins.add(commandant);
		penguins.add(kowalski);
		penguins.add(soldat);
		penguins.add(rico);
		
		
		Collections.sort(penguins, new Comparator<Pengouin>() {

			@Override
			public int compare(Pengouin p1, Pengouin p2) {
				
				return p1.speed.compareTo(p2.speed);
			}
		}); 
			System.out.println(penguins);
	}
	
}