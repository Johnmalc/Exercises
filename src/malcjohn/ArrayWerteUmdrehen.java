package malcjohn;

import java.util.Arrays;

public class ArrayWerteUmdrehen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int feldNeu[] = { 6, 5, 10, 4, 8, 9 };
		reverse(feldNeu);
		// for(int i = 0; i > feldNeu.length; i++){
		// System.out.println("myArray[" + "] = " + feldNeu[i]);
		// }
		System.out.println(Arrays.toString(feldNeu));

	}

	public static void reverse(int[] feldNeu) {
		for (int s = 0, e = feldNeu.length -1 ; s < e; ++s, --e) {
			int temp = feldNeu[s];
			feldNeu[s] = feldNeu[e];
			feldNeu[e] = temp;
		}
	}
}