package com.sopra.pox3.jeu;

import java.util.ArrayList;
import java.util.List;

public class FabriqueDeck {

	public List<Carte> genereDeck52Cartes() {
		List<Carte> jeu52 = new ArrayList<>();

		for (int i = 2; i <= 14; i++) {

			for (int j = 1; j <= 4; j++) {

				if (j == 1) {
					Carte nouvelleCarte = new Carte(i, Couleur.PIQUE);
					jeu52.add(nouvelleCarte);
				} else if (j == 2) {
					Carte nouvelleCarte = new Carte(i, Couleur.CARREAU);
					jeu52.add(nouvelleCarte);
				} else if (j == 3) {
					Carte nouvelleCarte = new Carte(i, Couleur.TREFLE);
					jeu52.add(nouvelleCarte);
				} else if (j == 4) {
					Carte nouvelleCarte = new Carte(i, Couleur.COEUR);
					jeu52.add(nouvelleCarte);
				}
			}

		}
		return jeu52;
	}

	public List<Carte> genereDeck32Cartes() {
		List<Carte> jeu32 = new ArrayList<>();

		for (int i = 7; i <= 14; i++) {

			for (int j = 1; j <= 4; j++) {

				if (j == 1) {
					Carte nouvelleCarte = new Carte(i, Couleur.PIQUE);
					jeu32.add(nouvelleCarte);
				} else if (j == 2) {
					Carte nouvelleCarte = new Carte(i, Couleur.CARREAU);
					jeu32.add(nouvelleCarte);
				} else if (j == 3) {
					Carte nouvelleCarte = new Carte(i, Couleur.TREFLE);
					jeu32.add(nouvelleCarte);
				} else if (j == 4) {
					Carte nouvelleCarte = new Carte(i, Couleur.COEUR);
					jeu32.add(nouvelleCarte);
				}
			}
		}
		return jeu32;
	}
}
