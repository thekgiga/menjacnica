package menjacnica;

import interfejsMenjacnica.MenjacnicaInterface;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Menjacnica implements MenjacnicaInterface {
	
	private LinkedList<Valuta> kursnaLista = new LinkedList<Valuta>();

	public void dodajKurs(GregorianCalendar datum, Double kupovniKurs,
			Double srednjiKurs, Double prodajniKurs, String naziv,
			String skraceniNaziv) {
	
		Valuta v = new Valuta();
		
		v.setDatum(datum);
		v.setKupovniKurs(kupovniKurs);
		v.setProdajniKurs(prodajniKurs);
		v.setSrednjiKurs(srednjiKurs);
		v.setNaziv(naziv);
		v.setSkracenNaziv(skraceniNaziv);
		
		kursnaLista.add(v);

	}

	public void obrisiKurs(GregorianCalendar datum, String naziv) {
		// TODO Auto-generated method stub
		
	}

	public Valuta pronadjiKurs(GregorianCalendar datum, String naziv) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
