package aufgabe;

public abstract class Konto {
	double saldo;
	double betrag;

	public Konto() {
		saldo = 0.;
	}

	public void einzahlen(double betrag) {
		saldo += betrag;
	}

	public abstract void auszahlen(double betrag);
}
