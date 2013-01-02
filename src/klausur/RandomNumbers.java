package klausur;

import java.util.Random;
/*
 * Generates random numbers with help of for loop.
 * The number inside of method nextInt gives a maximum range, that random sequence can generate. 
 * SO, this won't generate me any higher number than number inside of brackets.
 */

public class RandomNumbers {

	public static void main(String[] args) {

		// for(int i = 1; i < 73; i++){
		for (int d = 1; d <= 20; d++) {
			Random r = new Random();
			System.out.println(d + " >>>>>>> " + r.nextInt(73));
		}
		System.out.println("nova rada");

		// }

	}

}
