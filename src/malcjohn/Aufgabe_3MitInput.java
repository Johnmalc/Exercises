
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
        
        System.out.println("Numbers");

        double[] array = new double[yourNumbers];

        for(int i = 0; i < array.length; i++) {
            array[i] = scan.nextDouble();    
        }	
        
        // System.out.println(array);
        // http://leepoint.net/notes-java/data/arrays/arrays-ex-reverse.html
        // reverse order
        // see file array umdrehen
        BubleSort(array);
        System.out.println(Arrays.toString(array));
        
	}
	private static void BubleSort(double[] array){
		double n = array.length;
		int temp;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < (n-1); j++) {
				// <> zmeni druh razeni
				if (array [j+1] > array[j]){
					temp = (int) array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

}
