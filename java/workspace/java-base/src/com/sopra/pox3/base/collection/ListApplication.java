package com.sopra.pox3.base.collection;

import java.util.ArrayList;
import java.util.List;

import com.sopra.pox3.base.Pengouin;

public class ListApplication {

	public static void main(String[] args) {
		
		new ListApplication().init();
	}
	
	void init(){
		
		Pengouin commandant = new Pengouin("Commandant");
		Pengouin kowalski = new Pengouin("Kowalski");
		Pengouin soldat = new Pengouin("Soldat");
		Pengouin rico = new Pengouin("Rico");
		Pengouin skipper = new Pengouin ("skipper", 98);
		
		PengouinTeam team = new PengouinTeam(rico, skipper, soldat, kowalski, commandant);
		
		//System.out.println(team.pengouins);
		
		System.out.println(team.next()); //rico
		System.out.println(team.next());
		System.out.println(team.next());
		System.out.println(team.next());
		System.out.println(team.next());
		System.out.println(team.next());
	
		List<Pengouin> pengouins = team.getPengouins();
		//System.out.println(pengouins);
	
	}
	
	

}
