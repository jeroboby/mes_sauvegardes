package io.sopra.pox3.javaee;

import java.util.ArrayList;
import java.util.List;

public class Donnees {

	static List<ChatRoom> chatrooms = new ArrayList<>();
	
	
	public static void createChatRoom(){
	
	ChatRoom ado = new ChatRoom("ado");
	chatrooms.add(ado);
	ChatRoom celibataire = new ChatRoom("celibataire");
	chatrooms.add(celibataire);
	ChatRoom boloss = new ChatRoom("boloss");
	chatrooms.add(boloss);
	
	}
}

