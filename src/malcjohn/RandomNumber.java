package malcjohn;

import java.util.*;
import java.lang.*;

public class RandomNumber {

	/**
	 * http://stackoverflow.com/questions/363681/generating-random-number-in-a-range-with-java
	 */
	public static void main(String[] args) {
		Random b = new Random();
		int a = b.nextInt();
		System.out.println(b);
		System.out.println(a);
		
		
		
		// Min + (int)(Math.random() * ((Max - Min) + 1))
		for (int d = 0; d < 10; d++) {
			int f = 0 + (int)(Math.random() * ((100 - 0) + 1));
			System.out.println(f);
		}
		// int f = 5 + (int)(Math.random() * ((10 - 5) + 1));
		System.out.println("");
	}

}
