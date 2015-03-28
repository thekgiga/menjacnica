package interfejsMenjacnica;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface MenjacnicaInterface {
	
	public void dodajKurs(GregorianCalendar datum, String kupovniKurs, String srednjiKurs, String prodajniKurs);
	public void obrisiKurs(GregorianCalendar datum);
	public Valuta pronadjiKurs (GregorianCalendar datum);

}
