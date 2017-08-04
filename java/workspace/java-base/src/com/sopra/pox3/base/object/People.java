package com.sopra.pox3.base.object;

public class People {

	String name;
	int age;
	final static int maxAge = 123;
	
	public People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	int birthday() {

		if (age < 120) {
			int increment = 1;
			
			if (age > 10){
				int increment2 = 1;
				return age + increment2;
			}else{
				return age + increment;
			}
		}
		return -1;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}

