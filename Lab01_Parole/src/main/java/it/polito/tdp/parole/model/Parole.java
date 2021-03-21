package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class  Parole{
	
	private List <String> listaParole;
		
	public Parole() {
		this.listaParole = new LinkedList<String>();
	}
	
	public void addParola(String p) {
		this.listaParole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(listaParole);
		return listaParole;
	}
	
	public void reset() {
		this.listaParole.clear();
	}
	
	public void removeParola(String string) {
		listaParole.remove(string);
	}

}
