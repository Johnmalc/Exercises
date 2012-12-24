package klausur;

public class Subklasse extends Superklasse {

	public Subklasse() {
	}

	@Override
	public double getBlbost() {
		return 5;
	}

	@Override
	public void setDomecek(String barva) {
		domecek = barva;
		
	}

	@Override
	public String getDomecek() {
		return domecek;
	}

}
