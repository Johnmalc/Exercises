package malcjohn;

/**
 * Beschreibung
 * 
 * @version 1.0 vom 23.10.2012
 * @author
 */

public class KontoAufgabe16 {

	public static void main(String[] args) {
		float startguthaben = (float) 1250.54;
		int age = 10;
		float rate = (float) 0.0134; // oder sofort 0.0134

		float formel = startguthaben * (1 * rate + 1);
		float formel2 = startguthaben * (2 * rate + 1);
		float formel3 = startguthaben * (3 * rate + 1);
		float formel4 = startguthaben * (4 * rate + 1);
		float formel5 = startguthaben * (5 * rate + 1);
		float formel6 = startguthaben * (6 * rate + 1);
		float formel7 = startguthaben * (7 * rate + 1);
		float formel8 = startguthaben * (8 * rate + 1);
		float formel9 = startguthaben * (9 * rate + 1);
		float formel10 = startguthaben * (10 * rate + 1);

		// double a = (1+0.0134);
		// double formaldsf = Math.pow(a, 10);
		// System.out.println( "             "+ (formaldsf + 1250.54));

		System.out.println("Das Startguthaben in Euro betraegt:" + "     "
				+ startguthaben);
		System.out.println("----------------");

		System.out.println("Das Guthaben nach 1 Jahr betraegt:" + formel);
		System.out.println("Das Guthaben nach 2 Jahr betraegt:" + formel2);
		System.out.println("Das Guthaben nach 3 Jahr betraegt:" + formel3);
		System.out.println("Das Guthaben nach 4 Jahr betraegt:" + formel4);
		System.out.println("Das Guthaben nach 5 Jahr betraegt:" + formel5);
		System.out.println("Das Guthaben nach 6 Jahr betraegt:" + formel6);
		System.out.println("Das Guthaben nach 7 Jahr betraegt:" + formel7);
		System.out.println("Das Guthaben nach 8 Jahr betraegt:" + formel8);
		System.out.println("Das Guthaben nach 9 Jahr betraegt:" + formel9);
		System.out.println("Das Guthaben nach 10 Jahr betraegt:" + formel10);

		// / K0 * (p / 100) * n = Z1 (was ich suche =zinsertrag)
		float zinsertrag = (float) ((float) startguthaben * (0.0134) * 10);
		System.out.println("----------------");
		System.out.println("Zinsen nach 3 Jahren: " + zinsertrag);

	} // end of main

} // end of class aufgabe16
