package malcjohn;

import java.util.Arrays;
import java.util.Collections;
import org.apache.commons.lang3.*;

public class BubleSort_umgekehrtUNDarrayUmdrehen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] feld;
		feld = new int[5];
		feld[0] = 1;
		feld[1] = 2;
		feld[2] = 8;
		feld[3] = 5;
		feld[4] = 5;

		// int [] feldNeu;
		// feldNeu = new int [5];
		int[] feldNeu = { 6, 5, 8, 7, 8 };
		// feldNeu[0] = 6;
		// feldNeu[1] = 5;
		// feldNeu[2] = 8;
		// feldNeu[3] = 2;
		// feldNeu[4] = 1;

		// Umgekehrt(feldNeu);
		// System.out.println("Array After Bubble Sort");
		// for(int i=0; i < feldNeu.length; i++){
		// System.out.print(feldNeu[i] + " ");
		// }

		// wird 8,7,8,5,6
		int[] reversed = ArrayUtils.clone(feldNeu);
		ArrayUtils.reverse(reversed);
		System.out.println(ArrayUtils.toString(reversed));

	}

	public static void Umgekehrt(int[] feldNeu) {

		/*
		 * In bubble sort, we basically traverse the array from first to
		 * array_length - 1 position and compare the element with the next one.
		 * Element is swapped with the next element if the next element is
		 * smaller.
		 * 
		 * Bubble sort steps are as follows.
		 * 
		 * 1. Compare array[0] & array[1] 2. If array[0] < array [1] swap it. 3.
		 * Compare array[1] & array[2] 4. If array[1] < array[2] swap it. ... 5.
		 * Compare array[n-1] & array[n] 6. if [n-1] < array[n] then swap it.
		 * 
		 * After this step we will have smallest element at the last index.
		 * 
		 * Repeat the same steps for array[1] to array[n-1]
		 */

		int n = feldNeu.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {

				if (feldNeu[j - 1] < feldNeu[j]) {
					// swap the elements!
					temp = feldNeu[j - 1];
					feldNeu[j - 1] = feldNeu[j];
					feldNeu[j] = temp;
				}

			}
		}
	}
}
