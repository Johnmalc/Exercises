package klausur;

import java.util.Arrays;

public class arrayverkleiner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// int[] a = { 6, 5, 6, 8, 4, 6, 2, 1, 5, 4 };
		// int[] b = Arrays.copyOfRange(a, 3, 5);
		//
		// for (int i = 0; i < a.length; i++) {
		// System.out.println(b[i]);
		// }
		// array verschieben
		// http://www.java-forum.org/java-basics-anfaenger-themen/80644-elemente-array-verschieben.html
		int[] d = { 6, 5, 6, 8, 4, 6, 2, 1, 5, 4 };
		int[] dod = new int[10];
		for (int i = 0; i < d.length; i++) {
			int j = (i + 3) % dod.length;
			dod[j] = d[i];
		}

		System.out.println(Arrays.toString(dod));

	}

}
