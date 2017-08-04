package com.sopra.pox3.base;

public class Pengouin extends Bird implements CanSlide, Comparable<Pengouin>{
	
	String	name;
	Integer speed = 24;
	

	public Pengouin(String name, int speed) {
		
		this(name);
		this.speed = speed;
	}
	public Pengouin(String name) {
		if (name.isEmpty()){
			throw new IllegalArgumentException("Empty name of Pengouin");
		}

		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

	public void slide(){
		System.out.println("Yahou!!!! at " +speed+ " km/h" );
	}
	
	public static void main(String[] args) {

		//System.out.println(Ipenguin.penguins);

	}

	@Override
	public int compareTo(Pengouin other) {
		
		return this.name.compareTo(other.name);
	}

}