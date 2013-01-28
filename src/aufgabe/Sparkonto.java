package aufgabe;

public class Sparkonto extends Konto {

	public Sparkonto() {
		super();
	}

	@Override
	public void auszahlen(double betrag) {
		if (betrag <= 2000) {
			this.saldo = saldo - betrag;
		} else {
			System.out.println("error");
		}
	}

}
