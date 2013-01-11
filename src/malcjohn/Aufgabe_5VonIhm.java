package malcjohn;

import Prog1Tools.IOTools;

public class Aufgabe_5VonIhm {
	static int last = 0;

	// UNTERPROGRAMM
	public static long fibo(int n, long[] ar) {
		System.out.print("v" + n + " ");
		if (n == 0 || n == 1)
			return 1;
		if (n < 0)
			return 0; // sonst .......
		show(ar);
		long fnm1, fnm2;
		if (ar[n - 1] == 0) {
			fnm1 = fibo(n - 1, ar);
			ar[n - 1] = fnm1;
			last = (n - 1 > last) ? n - 1 : last;
		} else {
			fnm1 = ar[n - 1];
		}// end of if
		if (ar[n - 2] == 0) {
			// System.out.println("in if zu n-2");
			fnm2 = fibo(n - 2, ar);
			ar[n - 2] = fnm2;
		} else {
			fnm2 = ar[n - 2];
		}// end of if
		long erg = fnm1 + fnm2;
		ar[n] = erg;
		last = Math.max(n, last);
		System.out.println("n" + n + " ");
		show(ar);
		return erg;
	}

	public static void show(long[] ar) {
		for (int i = 0; i <= last; i++) {
			System.out.print(ar[i] + " ");
		} // end of for
		System.out.println();
	}

	// UNSER HAUPTPROGRAMM
	public static void main(String[] args) {
		long[] fiboStor = new long[1000];
		for (long el : fiboStor) {
			el = 0;
		} // end of for
		fiboStor[0] = fiboStor[1] = 1; // nicht notwendig
		int n;
		do {
			n = IOTools.readInteger("Fibonacci von: ");
			System.out.println("Ergebnis: " + fibo(n, fiboStor));
		} while (n >= 0);
	}
}