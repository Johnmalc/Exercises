package aufgabe;

public class Giro extends Konto {

	public Giro() {

	}

	@Override
	public void auszahlen(double betrag) {
		this.betrag = betrag;

	}

}
