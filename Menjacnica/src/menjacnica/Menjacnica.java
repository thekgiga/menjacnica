package menjacnica;

import interfejsMenjacnica.MenjacnicaInterface;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Menjacnica implements MenjacnicaInterface {
	
	private LinkedList<Valuta> kursnaLista = new LinkedList<Valuta>();

	public void dodajKurs(GregorianCalendar datum, Double kupovniKurs,
			Double srednjiKurs, Double prodajniKurs,String naziv, String skraceniNaziv) {
		
		Valuta pomocna = new Valuta();
		
		pomocna.setNaziv(naziv);
		pomocna.setSkracenNaziv(skraceniNaziv);
		pomocna.setDatum(datum);
		pomocna.setKupovniKurs(kupovniKurs);
		pomocna.setProdajniKurs(prodajniKurs);
		if((kupovniKurs+prodajniKurs)/2 != srednjiKurs )
			throw new RuntimeException("Srednji kurs mora biti jednak aritmetickoj sredini druga dva kursa.");
		pomocna.setSrednjiKurs(srednjiKurs);
		
		kursnaLista.add(pomocna);
	}

	public void obrisiKurs(GregorianCalendar datum, String naziv) {
		
		if(kursnaLista.isEmpty())
			throw new RuntimeException("kursnaLista je prazna");
		
		for(int i = 0; i < kursnaLista.size(); i++) {
			if(kursnaLista.get(i).getNaziv().equals(naziv) && kursnaLista.get(i).getDatum().equals(datum)) {
				
				kursnaLista.remove(kursnaLista.get(i));
				return; //jer za odredjeni datum valuta ne moze imati vise razlicitih kurseva
			}	
		}
	}

	public Valuta pronadjiKurs(GregorianCalendar datum, String naziv) {
		if(kursnaLista.isEmpty()) 
			throw new RuntimeException("kursnaLista je prazna");
		
		for(int i = 0; i < kursnaLista.size(); i++) {
			if(kursnaLista.get(i).getNaziv().equals(naziv) && kursnaLista.get(i).getDatum().equals(datum)) {				
				return kursnaLista.get(i);
			}	
		}
		
		return null;
	
	}

}
