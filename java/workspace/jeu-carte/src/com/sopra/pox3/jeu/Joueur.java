package com.sopra.pox3.jeu;

import java.util.ArrayList;
import java.util.List;

public class Joueur {

	List<Carte> main = new ArrayList<>();

void prendreCarte(Carte carte){
	main.add(carte);
}
Carte donneCarte(){
	return main.get(0);
}
}