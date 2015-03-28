package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {
	
	private String naziv,skracenNaziv;
	private GregorianCalendar datum;
	private double srednjiKurs,kupovniKurs,prodajniKurs;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv==null || naziv.isEmpty())
			throw new RuntimeException("Morate uneti naziv valute");
		this.naziv = naziv;
	}
	public String getSkracenNaziv() {
		return skracenNaziv;
	}
	public void setSkracenNaziv(String skracenNaziv) {
		if(skracenNaziv==null || skracenNaziv.isEmpty())
			throw new RuntimeException("Morate uneti skraceni naziv valute");
		this.skracenNaziv = skracenNaziv;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if(datum.before(GregorianCalendar.DATE)) 
			throw new RuntimeException("Ne smete uneti datum iz proslosti!");
		this.datum = datum;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		if(srednjiKurs == 0)
			throw new RuntimeException("Morate uneti vrednost razlicitu od 0 za srednji kurs");	
		this.srednjiKurs = srednjiKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		if(kupovniKurs == 0)
			throw new RuntimeException("Morate uneti vrednost razlicitu od 0 za kupovni kurs");			
		this.kupovniKurs = kupovniKurs;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		if(prodajniKurs == 0)
			throw new RuntimeException("Morate uneti vrednost razlicitu od 0 za prodajni kurs");	
		this.prodajniKurs = prodajniKurs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((skracenNaziv == null) ? 0 : skracenNaziv.hashCode());
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovniKurs) != Double
				.doubleToLongBits(other.kupovniKurs))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double
				.doubleToLongBits(other.prodajniKurs))
			return false;
		if (skracenNaziv == null) {
			if (other.skracenNaziv != null)
				return false;
		} else if (!skracenNaziv.equals(other.skracenNaziv))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double
				.doubleToLongBits(other.srednjiKurs))
			return false;
		return true;
	}
	
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skracenNaziv=" + skracenNaziv
				+ ", datum=" + datum + ", srednjiKurs=" + srednjiKurs
				+ ", kupovniKurs=" + kupovniKurs + ", prodajniKurs="
				+ prodajniKurs + "]";
	}
	
	
}
