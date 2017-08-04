package io.sopra.pox3.javaee;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {

	String nom;
	User createur;
	List<Message> messages = new ArrayList<>();
	
	public ChatRoom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
