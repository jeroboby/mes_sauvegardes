package com.sopra.pox3.base.equals;

public class Card {

	int value;
	char color;

	public Card(int value, char color) {
		this.value = value;
		this.color = color;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + color;
		result = prime * result + value;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Card))
			return false;
		Card other = (Card) obj;
		if (color != other.color)
			return false;
		if (value != other.value)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return String.valueOf(this.value) + this.color;
	}

	
}
