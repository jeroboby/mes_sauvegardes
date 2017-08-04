package com.sopra.pox3.computer;

public class Ram {

	int capacity;

	public Ram(int capacity)
	{
		this.capacity = capacity;
	}
	
	void switchOn() {
		System.out.println("Initialisation de la memoire vive" + capacity + "Go");
	}

	void switchOff() {
		System.out.println("Extinction de la mémoire vive");
	}

	void capacity(){
		capacity = 8;
		System.out.println("la capacite de la memoire vive est de");
}
}