package interfejsMenjacnica;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface MenjacnicaInterface {
	
	public void dodajKurs(GregorianCalendar datum, Double kupovniKurs, Double srednjiKurs, Double prodajniKurs,
			String naziv, String skraceniNaziv);
	public void obrisiKurs(GregorianCalendar datum, String naziv);
	public Valuta pronadjiKurs (GregorianCalendar datum, String naziv);

}
