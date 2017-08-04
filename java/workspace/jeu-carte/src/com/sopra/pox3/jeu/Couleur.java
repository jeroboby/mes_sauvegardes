package com.sopra.pox3.jeu;

public enum Couleur {
	PIQUE('p', 1), CARREAU('c', 2), TREFLE('t', 3), COEUR('h', 4);

	char type;
	int valeur;
	
	private Couleur(char type, int valeur) {
		this.type = type;
		this.valeur = valeur;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
}
