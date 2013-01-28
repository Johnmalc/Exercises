package aufgabe;

public class Main {

	public static void main(String[] args) {
		Konto[] dop = new Konto[4];

		dop[0] = new Sparkonto();
		dop[1] = new Sparkonto();

		dop[2] = new Giro();
		dop[3] = new Giro();

		for (int i = 0; i < 4; i++) {
			dop[i].einzahlen(5000);
			System.out.println("dsfsdf");
		}

		for (int i = 0; i < 4; i++) {
			dop[i].auszahlen(3000);

		}

	}

}
