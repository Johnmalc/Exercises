package malcjohn;

import java.util.Scanner.*;
import Prog1Tools.IOTools;

public class WurfelSpiel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// int anzahlX = 12;
		// int durchlaufe = 54;
		// System.out.println("Anzahl der Durchlaufe: " + durchlaufe);
		// int meinTipp = IOTools.readInt();
		// // System.out.println("Mein Tipp war " + meinTipp);
		// String text = "Mein Tipp war";
		// boolean pokudJemojeCislo = true;
		// int cisla = IOTools.readInt();
		// switch(cisla) {
		// case 1:
		// case 2:
		// case 3:
		// case 4:
		// case 5:
		// System.out.println("Geben sie jetzt ihren tipp ");
		// if(pokudJemojeCislo){
		// for(int d = 0; d < durchlaufe; d++) {
		// int f = 1 + (int)(Math.random() * ((6 - 1) + 1));
		// System.out.println(f);
		// System.out.println(text + " " + f);
		// //System.out.println("-------------------------------------------------------------");
		// //System.out.println("Anzahl der Siege " + meinTipp);
		// //System.out.println("Anzahl der Niederlage " + meinTipp);
		//
		// // Richtig
		// if(f == meinTipp) {
		// System.out.println("Sie haben richtig getippt");
		// }else {
		// System.out.println("Sie haben falsch getippt");
		// }
		// }
		// break;
		// }

		// for (int d = 0; d < 6; d++) {
		// int f = 1 + (int)(Math.random() * ((6 - 1) + 1));
		// System.out.println(text + " " + f);
		// }

		// System.out.println("-------------------------------------------------------------");
		// System.out.println("Anzahl der Siege " + meinTipp);
		// System.out.println("Anzahl der Niederlage " + meinTipp);

		System.out.println("Willkommen beim raten");
		System.out.println("zahl zwischen 1 und 6");
		int geheimZahl = (int) (6 * Math.random() + 1);

		System.out.println("generierte geheim zahl " + geheimZahl);
		System.out.println();

		int zahler = 0;
		int eingabe;
		int solange = 15;
		do {
			zahler++;
			System.out.print(zahler + " versuch");
			eingabe = IOTools.readInteger(" ihre zahl ");

			if (eingabe > geheimZahl) {
				;
				// System.out.println(zahler + " Versuch: " + Tipp);
				// System.out.println(" Meine Zahl ist kleiner" );
			} else if (geheimZahl == eingabe) {
				;
				// System.out.println(zahler + " Versuch: " + Tipp);
				// System.out.println(" Meine Zahl ist korrekt. Erraten beim " +
				// zahler);
			} else if (eingabe < geheimZahl) {
				;
				// System.out.println(zahler + " Versuch: " + Tipp);
				// System.out.println(" Meine Zahl ist grosser" );
			}
			// System.out.println(versuch + " Versuch: " + Tipp);
		} while (zahler < solange);

	}
}
