package malcjohn;

import java.util.Scanner;

public class ArraySort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Size");
        int yourNumbers = scan.nextInt();
        double[] array = new double[yourNumbers];

        System.out.println("Numbers");

        for(int i = 0; i < array.length; i++) {
            array[i] = scan.nextDouble();    
        }	

	}

}
