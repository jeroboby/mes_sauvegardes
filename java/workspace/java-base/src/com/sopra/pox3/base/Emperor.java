package com.sopra.pox3.base;

public class Emperor extends Pengouin{

	public Emperor(String name) {
		super(name, 28);
		
	}

	@Override
	public void slide() {
		System.out.println("Yeaaarh");
		
	}
	
	
	public void slide(Pengouin commandant) {
		System.out.println("Yeaaarh " + commandant);
		
	}
	public void slide(Emperor p) {
		System.out.println("Pas cool " + p);
		
	}

}

