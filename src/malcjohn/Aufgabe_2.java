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
		int grosseZahl = (Integer.MAX_VALUE / 2 );
		int grosseZahl2 = (Integer.MAX_VALUE / 3 );
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
		System.out.println(neuZahlZuweisung);
		System.out.println(neuZahlZuweisung2);
		System.out.println(neuZahlZuweisung3);
		System.out.println(neuZahlZuweisung4);
		
		System.out.println();
		System.out.println();

		/*
		 * 
		 * Die 2 Unteraufgabe 
		 * Moglich ? >  Ja
		 * typecasting nicht notig, also (int) muss nicht geschrieben sein
		*/
		float zuweisung3 = Integer.MAX_VALUE;
		double zuweissung2 = Integer.MAX_VALUE;

		System.out.println(zuweisung3);
		System.out.println(zuweissung2);
		
		System.out.println();
		System.out.println();
		
		/*	
		 * 
		 * Die 3 Unteraufgabe
		 * Umwandlung von float und double varianten in int wieder 
		 * 
		*/		
		
		
		
		
		
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("// 1st. Sentence");
		int a = 2_000_000;
		int d = 500_000;
		double b = 54.85;
		double c = 989787.845664;
		System.out.println(a+b+c+d); // basic sum
		
		System.out.println("// 2nd. Sentence");
		double r = 6445641689494.6546; // random
		float t = (float) 65464654646.4; // random
		
		float by = Integer.MAX_VALUE; // this is right
		double dy = Integer.MAX_VALUE; // this is right
		
		int g = Integer.MAX_VALUE;
		double y = g+t+r;  // or comment this in and change println to g+r+t
		
		System.out.println(by); // another sum, this time converted to double/float
		System.out.println(dy);
		
		
		System.out.println("// 3rd. Sentence");
		int w = (int) y;
		int q = (int) r;
		int qw = (int) t;
		System.out.println(w); // just takes the max value from integer
		System.out.println(q); // in general there ist always the same number of int
		System.out.println(qw); // it's max_value of that; 10 numbers
		
		System.out.println("// 4th. Sentence");
		float byt = by - 1;
		float duk = by - 10;
		float buk = by / 10 ;
		float puk = (by -10) / 10;
		System.out.println(byt);
		int tuk = (int) byt;
		System.out.println(duk);
		System.out.println(buk);
		System.out.println(tuk);
		System.out.println(puk);

		
		System.out.println("// 5th. Sentence [the last part]");
		long sj = Long.MAX_VALUE;
		long sd = Long.MIN_VALUE;
		
		float fr = (float) sj; // for max value
		double re = (double) sj; // for max value
		
		System.out.println(fr * 10);
		System.out.println(re * 10);
		
		float fg = (float) sd; // for min value
		double ft = (double) sd; // for min value 
		
		System.out.println(fg / 10);
		System.out.println(ft / 10);
		
	}

}
