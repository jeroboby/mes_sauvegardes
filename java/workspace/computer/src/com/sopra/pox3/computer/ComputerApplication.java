package com.sopra.pox3.computer;

public class ComputerApplication {

	public static void main(String[] args) {
		Computer o = new Computer("Rog", 25, new int[] {100, 1000});
		
		o.switchOn();
		o.switchOff();

	}

}
