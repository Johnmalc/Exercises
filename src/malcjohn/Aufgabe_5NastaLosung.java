package malcjohn;

import Prog1Tools.IOTools;

public class Aufgabe_5NastaLosung {

	public static long[] speicher = new long[100];

	public static long fib(int n) {
		long ergebnis;
		if (n == 1 || n == 2)
			return 1;
		if (n <= 0)
			return 0;
		ergebnis = fib(n - 1) + fib(n - 2);
		if (speicher[n] != 0) {
			// System.out.println("Ich benutze die geschpeicherte Summe von F("
			// + n+"): "+speicher[n]);
			ergebnis = speicher[n];
			return ergebnis;
		} // end of if
		else {

			speicher[n] = ergebnis;
			// System.out.println("Ich speichere F(" + n +"): "+ergebnis);
		}

		return ergebnis;

	}

	public static void main(String[] args) {
		System.out.println("-= Die Fibonacci-Zahlen =-");
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
		int n = IOTools.readInteger("Geben Sie n ein... ");
		System.out.println("Ergebnis: " + fib(n));

	} // end of main

} // end of class auf5
