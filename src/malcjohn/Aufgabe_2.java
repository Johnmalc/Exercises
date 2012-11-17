package malcjohn;

public class Aufgabe_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 * Das ist die 1 Unteraufgabe
		 */
		// Neuer Anfang mir Docs
		// beliebig - meine "grossen Zahlen"
		int grosseZahl = (Integer.MAX_VALUE / 2); // 1073741823
		int grosseZahl2 = (Integer.MAX_VALUE / 3); // 715827882
		// Zuweisung zu float
		float neuZahlZuweisung = (int) grosseZahl;
		float neuZahlZuweisung2 = (int) grosseZahl2;
		// Zuweisung zu double
		double neuZahlZuweisung3 = (int) grosseZahl;
		double neuZahlZuweisung4 = (int) grosseZahl2;
		// Nicht sicher wie genau, ich mache noch umgekehrt
		// Entweder int-int oder int-float
		// Kommt das gleiche wie bei grosseZahl > Irrelevant
		// int neuZahlZuweisung3 = (int) grosseZahl;
		// int neuZahlZuweisung4 = (int) grosseZahl2;

		// Uberprufen ob int max value/2-3 existriert
		System.out.println(grosseZahl);
		System.out.println(grosseZahl2);

		// Float and double value zahlen
		System.out.println(neuZahlZuweisung + "  > Float in int"); // 1.07374182E9
		System.out.println(neuZahlZuweisung2 + " > Zweite float in int"); // 7.158279E8
		System.out.println(neuZahlZuweisung3 + " > Double in int"); // 1.073741823E9
		System.out.println(neuZahlZuweisung4 + " > Zweite double int"); // 7.15827882E8

		System.out.println();
		System.out.println(Integer.MAX_VALUE + " grossete max value of int");
		System.out.println(Integer.MIN_VALUE + " kleinste min value of int");
		System.out.println();

		/*
		 * 
		 * Die 2 Unteraufgabe Moglich ? > Ja typecasting nicht notig, also (int)
		 * muss nicht geschrieben sein
		 */
		float zuweisung3 = Integer.MAX_VALUE;
		double zuweissung2 = Integer.MAX_VALUE;

		// nur fur vorletzte aufgabe mit min value
		float zuweisungMinus = Integer.MIN_VALUE;
		double zuweissungMinus = Integer.MIN_VALUE;

		System.out.println(zuweisung3 + " Zugewiesen float zu int"); // 2.14748365E9
		System.out.println(zuweissung2 + " Zugewiesen double zu int"); // 2.147483647E9

		System.out.println();
		System.out.println();

		/*
		 * 
		 * Die 3 Unteraufgabe Umwandlung von float und double varianten in int
		 * wieder
		 */
		int WiederUmwandlung = (int) zuweisung3;
		int WiederUmwandlung2 = (int) zuweissung2;
		// Kriegt man die Max. Value von int
		System.out.println(WiederUmwandlung); // 2147483647
		System.out.println(WiederUmwandlung2); // 2147483647

		System.out.println();
		System.out.println();

		/*
		 * Die 4 Unteraufgabe Ziehen Sie von den Fließkommavariablen 1 ab und
		 * wandeln Sie wieder zurück, Machen Sie das Entsprechende mit
		 * Subtraktion von 10, Division durch 10 und schließlich mit Subtraktion
		 * und Division nacheinander.
		 */
		System.out.print(Float.MIN_VALUE); // Vorsichtig here, nicht in negativ
											// geht, sondern 0.000...

		float EinsAbziehen = zuweisung3 - 1;
		System.out.println(EinsAbziehen); // 2.14748365E9
		int EinsAbziehen2 = (int) EinsAbziehen;
		System.out.println(EinsAbziehen2); // 2147483647
		System.out.println(" 1 abziehen");
		System.out.println();

		float EinsAbziehen3 = zuweisung3 - 10;
		System.out.println(EinsAbziehen3); // 2.14748365E9
		int EinsAbziehen4 = (int) EinsAbziehen;
		System.out.println(EinsAbziehen4); // 2147483647
		System.out.println("-10 ");
		System.out.println();

		float EinsAbziehen5 = zuweisung3 / 10;
		System.out.println(EinsAbziehen5); // 2.14748368E8
		int EinsAbziehen6 = (int) EinsAbziehen;
		System.out.println(EinsAbziehen6); // 2147483647
		System.out.println("/10");
		System.out.println();

		float EinsAbziehen7 = (zuweisung3 - 10) / 10;
		System.out.println(EinsAbziehen7); // 2.14748368E8
		int EinsAbziehen8 = (int) EinsAbziehen;
		System.out.println(EinsAbziehen8); // 2147483647
		System.out.println("-10 /10");
		System.out.println();

		System.out.println(" Ab jetzt mit double");

		double EinsAbziehen9 = zuweissung2 - 1;
		System.out.println(EinsAbziehen9); // 2.147483646E9
		int EinsAbziehen10 = (int) EinsAbziehen;
		System.out.println(EinsAbziehen10); // 2147483647
		System.out.println(" 1 abziehen");
		System.out.println();

		double EinsAbziehen11 = zuweissung2 - 10;
		System.out.println(EinsAbziehen11); // 2.147483637E9
		int EinsAbziehen12 = (int) EinsAbziehen;
		System.out.println(EinsAbziehen12); // 2147483647
		System.out.println("-10 ");
		System.out.println();

		double EinsAbziehen13 = zuweissung2 / 10;
		System.out.println(EinsAbziehen13); // 2.147483647E8
		int EinsAbziehen14 = (int) EinsAbziehen;
		System.out.println(EinsAbziehen14); // 2147483647
		System.out.println("/10");
		System.out.println();

		double EinsAbziehen15 = (zuweissung2 - 10) / 10;
		System.out.println(EinsAbziehen15); // 2.147483637E8
		int EinsAbziehen16 = (int) EinsAbziehen;
		System.out.println(EinsAbziehen16); // 2147483647
		System.out.println("-10 /10");
		System.out.println();

		// Ab jetzt mit min value
		// Genommen von der 2 Unteraufgabe
		System.out.println("Ab jetzt mit min value");

		float EinsAbziehen17 = zuweisungMinus + 1;
		System.out.println(EinsAbziehen17); // -2.14748365E9
		int EinsAbziehen18 = (int) EinsAbziehen;
		System.out.println(EinsAbziehen18); // 2147483647
		System.out.println(" 1 abziehen");
		System.out.println();

		float EinsAbziehen19 = zuweisungMinus + 10;
		System.out.println(EinsAbziehen19); // -2.14748365E9
		int EinsAbziehen20 = (int) EinsAbziehen;
		System.out.println(EinsAbziehen20); // 2147483647
		System.out.println("-10 ");
		System.out.println();

		float EinsAbziehen21 = zuweisungMinus / 10;
		System.out.println(EinsAbziehen21); // -2.14748368E8
		int EinsAbziehen22 = (int) EinsAbziehen;
		System.out.println(EinsAbziehen22); // 2147483647
		System.out.println("/10");
		System.out.println();

		float EinsAbziehen23 = (zuweisungMinus + 10) / 10;
		System.out.println(EinsAbziehen23); // -2.14748368E8
		int EinsAbziehen24 = (int) EinsAbziehen;
		System.out.println(EinsAbziehen24); // 2147483647
		System.out.println("-10 /10");
		System.out.println();

		System.out.println(" Ab jetzt mit double");

		double EinsAbziehen25 = zuweissungMinus + 1;
		System.out.println(EinsAbziehen25); // -2.147483647E9
		int EinsAbziehen26 = (int) EinsAbziehen;
		System.out.println(EinsAbziehen26); // 2147483647
		System.out.println(" 1 abziehen");
		System.out.println();

		double EinsAbziehen27 = zuweissungMinus + 10;
		System.out.println(EinsAbziehen27); // -2.147483638E9
		int EinsAbziehen28 = (int) EinsAbziehen;
		System.out.println(EinsAbziehen28); // 2147483647
		System.out.println("-10 ");
		System.out.println();

		double EinsAbziehen29 = zuweissungMinus / 10;
		System.out.println(EinsAbziehen29); // -2.147483648E8
		int EinsAbziehen30 = (int) EinsAbziehen;
		System.out.println(EinsAbziehen30); // 2147483647
		System.out.println("/10");
		System.out.println();

		double EinsAbziehen31 = (zuweissungMinus + 10) / 10;
		System.out.println(EinsAbziehen31); // -2.147483638E8
		int EinsAbziehen32 = (int) EinsAbziehen;
		System.out.println(EinsAbziehen32); // 2147483647
		System.out.println("-10 /10");
		System.out.println();

		System.out.println();
		System.out.println();

		/**
		 * 
		 * Besorgen Sie sich die größte darstellbare long-Zahl und
		 * multiplizieren Sie sie zuerst als float und dann als double mit 10,
		 * entsprechend die kleinste darstellbare (negativer Exponent) dividiert
		 * durch 10.
		 */

		System.out.println("// 5th. Sentence [the last part]");
		long sj = Long.MAX_VALUE;
		long sd = Long.MIN_VALUE;
		// System.out.println(sd);

		float fr = (float) sj; // for max value
		double re = (double) sj; // for max value

		System.out.println(fr * 10); // 9.223372E19
		System.out.println(re * 10); // 9.223372036854776E19

		float fg = (float) sd; // for min value
		double ft = (double) sd; // for min value

		System.out.println(fg / 10); // -9.2233722E17
		System.out.println(ft / 10); // -9.2233720368547763E17

		System.out.println();
		System.out.println();

		// Wahrscheinlich richtig, aber ich nutze nur den letzten Teil mit Long

		/*
		 * System.out.println("// 1st. Sentence"); int a = 2_000_000; int d =
		 * 500_000; double b = 54.85; double c = 989787.845664;
		 * System.out.println(a+b+c+d); // basic sum
		 * 
		 * System.out.println("// 2nd. Sentence"); double r =
		 * 6445641689494.6546; // random float t = (float) 65464654646.4; //
		 * random
		 * 
		 * float by = Integer.MAX_VALUE; // this is right double dy =
		 * Integer.MAX_VALUE; // this is right
		 * 
		 * int g = Integer.MAX_VALUE; double y = g+t+r; // or comment this in
		 * and change println to g+r+t
		 * 
		 * System.out.println(by); // another sum, this time converted to
		 * double/float System.out.println(dy);
		 * 
		 * 
		 * System.out.println("// 3rd. Sentence"); int w = (int) y; int q =
		 * (int) r; int qw = (int) t; System.out.println(w); // just takes the
		 * max value from integer System.out.println(q); // in general there ist
		 * always the same number of int System.out.println(qw); // it's
		 * max_value of that; 10 numbers
		 * 
		 * System.out.println("// 4th. Sentence"); float byt = by - 1; float duk
		 * = by - 10; float buk = by / 10 ; float puk = (by -10) / 10;
		 * System.out.println(byt); int tuk = (int) byt;
		 * System.out.println(duk); System.out.println(buk);
		 * System.out.println(tuk); System.out.println(puk);
		 * 
		 * System.out.println("// 5th. Sentence [the last part]"); long sj =
		 * Long.MAX_VALUE; long sd = Long.MIN_VALUE;
		 * 
		 * float fr = (float) sj; // for max value double re = (double) sj; //
		 * for max value
		 * 
		 * System.out.println(fr * 10); System.out.println(re * 10);
		 * 
		 * float fg = (float) sd; // for min value double ft = (double) sd; //
		 * for min value
		 * 
		 * System.out.println(fg / 10); System.out.println(ft / 10);
		 */
	}

}
