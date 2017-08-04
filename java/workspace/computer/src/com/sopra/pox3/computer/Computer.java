package com.sopra.pox3.computer;

public class Computer {

	String Modele = new String();
	Ram ram;
	HardDrive[] hd;

	public Computer(String modele, int ramcapacity, int[] hdcapacity) {
		this.Modele = modele;
		this.ram = new Ram(ramcapacity);
		this.hd = new HardDrive [hd.length];
		for(int i = 0; i< hd.length; i ++){
			hd[i] = new HardDrive(hdcapacity[i]);
		}
	}

	public void switchOn() {
		System.out.println("l'ordinateur démarre");
		ram.switchOn();
		System.out.println("Demarrage des disques durs");
		for(HardDrive hardDrive : hd){
			hardDrive.switchOn();
		}
		
		System.out.println("Ordinateur en service");
	}

	public void switchOff() {

		System.out.println("Extinction des disques durs");
		
		System.out.println("Les disques durs sont éteints");
				for(HardDrive hardDrive : hd){
					hardDrive.switchOff();
				}
		System.out.println("l'ordinateur s'eteint");
	}
}
