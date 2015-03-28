package menjacnica;

import interfejsMenjacnica.MenjacnicaInterface;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Menjacnica implements MenjacnicaInterface {
	
	private LinkedList<Valuta> kursnaLista = new LinkedList<Valuta>();

	public void dodajKurs(GregorianCalendar datum, String kupovniKurs,
			String srednjiKurs, String prodajniKurs) {
		
	}

	public void obrisiKurs(GregorianCalendar datum) {
		
		
	}

	public Valuta pronadjiKurs(GregorianCalendar datum) {
		
		return null;
	}

}
