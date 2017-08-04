package com.sopra.pox3.base.garbage;

public class Bag {

	int weight;
	String memoryFill= "rterqgtejyosltjpthjqmjlqkejmtgoejtqeoitmgjqetmqeijterqmgtoqizrjtqmrotgjqerùieryheroyiejrtetioejrmteqortqjerterhogtimhertmoertj";

	public Bag(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString(){
		return "Bag "+this.weight;
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println("killing "+this.toString());
	}
}
