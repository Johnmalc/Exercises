package klausur;

public class Subklasse extends Superklasse implements Inter {

	public Subklasse() {
	}

	@Override
	public double getBlbost() {
		return 5.0;
	}

	@Override
	public void setDomecek(String barva) {
		domecek = barva;
		
	}

	@Override
	public String getDomecek() {
		return domecek;
	}

	@Override
	public void ko() {
		System.out.println("sdf");
		
	}

}
