package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	private Map<String,String> elenco = new TreeMap<String,String>();
		
	public Parole() {
	}
	
	public void addParola(String p) {
		if(!elenco.containsKey(p))
			elenco.put(p, p);
	}
	
	public List<String> getElenco() {
		List<String> parole= new LinkedList<>(elenco.values());
		return parole;
	}
	
	public void reset() {
		elenco.clear();
	}
	
	public void cancellaParola(String p) {
		if(elenco.containsKey(p))
			elenco.remove(p);
	}

	@Override
	public String toString() {
		String s="";
		for(String stemp: elenco.keySet())
			s+=stemp+"\n";
		return s;
	}
	
	

}
