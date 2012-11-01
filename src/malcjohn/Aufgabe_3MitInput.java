package malcjohn;

import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe_3MitInput {

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
        
        // http://leepoint.net/notes-java/data/arrays/arrays-ex-reverse.html
        // reverse order
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

	}

}
