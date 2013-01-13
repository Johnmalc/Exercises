package malcjohn;

import java.util.Arrays;

public class ArrayWerteTauschen {

	/**
	 * @param args
	 * bud napsat array [] dvakrat nebo pouze jednou pres static
	 */
	private static final int[] intArr = { 5, 24, 18, 76 };

	public boolean tauschIndex(int l, int r) {
		// int[] intArr = { 5, 24, 18, 76 };
		if (l < 0 || l >= intArr.length) {
			System.err.println("Ausgangsindex zu hoch oder zu niedrig!");
			return false;
		}
		if (r < 0 || r >= intArr.length) {
			System.err.println("Zielindex zu hoch oder zu niedrig!");
			return false;
		}

		int k = intArr[l];
		intArr[l] = intArr[r];
		intArr[r] = k;
		return true;
	}

	public static void main(String[] args) {
		// int[] intArr = { 5, 24, 18, 76 };
		ArrayWerteTauschen wt = new ArrayWerteTauschen();
		System.out.println("vorher:");
		System.out.println(Arrays.toString(intArr));
		// stejne zde
		// for (int i = 0; i < intArr.length; i++) {
		// System.out.println(intArr[i]);
		// }
		// es werden alle auser diesen beiden getasucht , von 0 genommen
		if (wt.tauschIndex(1, 2)) {
			System.out.println("\nnachher:");
			System.out.println(Arrays.toString(intArr));
			// auch moglich
			// for (int i = 0; i < intArr.length; i++) {
			// System.out.println(intArr[i]);
			// }
		}
	}
}