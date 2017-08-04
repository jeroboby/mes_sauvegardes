package com.sopra.pox3.base.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.sopra.pox3.base.Pengouin;

public class PengouinTeam {
	int count = 0;
	CircularList<Pengouin> pengouins = new CircularList<>();

	//varargs (...)
	public PengouinTeam(Pengouin... allPengouins) {
		
	
		for (Pengouin p: allPengouins){
			this.pengouins.add(p);
		}
	}
	int position;
	Pengouin next(){
		
		return this.pengouins.iterator().next();
       
	}

	public List<Pengouin> getPengouins() {
		return pengouins;
	}
	

}
