package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	
	private List<String> parole ;
		
	public Parole() {
		
		parole = new LinkedList<String>();
	}
	
	public void addParola(String p) {
		parole.add(p);
	}
	
	public List<String> getElenco() {
		
		Collections.sort(parole);
		
		return parole;
	}
	
	public void reset() {
		
		parole.removeAll(parole);
	}
	
	public void cancellaParola(String p) {
		parole.remove(p);
	}

	@Override
	public String toString() {
		String paroleDaStampare = "";
		for(String si : parole) {
			paroleDaStampare = paroleDaStampare + si + "\n";
		}
		return paroleDaStampare;
	}

	
}
