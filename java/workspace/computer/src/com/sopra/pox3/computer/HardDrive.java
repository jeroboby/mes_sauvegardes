package com.sopra.pox3.computer;

public class HardDrive {

	public HardDrive(int capacity) {
		this.capacity = capacity;
	}
	int capacity;
	
	
void switchOn(){
	
	System.out.println("Demarrage du disque dur de 100 Go");
	
	System.out.println("Demarrage du disque dur de 1000 Go");
	
}

void read(){
	System.out.println("Lecture du disque dur de 100 Go");
	System.out.println("Lecture du disque dur de 1000 Go");
}

void switchOff(){
	
	System.out.println("Extinction du disque dur de 100 Go");
	System.out.println("Extinction du disque dur de 1000 Go");
}
void capacity(){
	System.out.println("Lecture du disque dur de 1000 Go");
}
}
