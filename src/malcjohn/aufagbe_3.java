/**
 * Import must be after package
 */
package malcjohn;
import java.util.*;
//
//import Prog1Tools.IOTools;
//import Prog1Tools.IOTools.*;

/**
 * @author malcjohn
 * Aufgabe 3:
 * Sortieren Sie einen Array von Fließkomma-Zahlen (aufsteigend).
 * Initialisieren Sie den Array auch über Tastatureingabe.
 * 
 * Vorgehen (lineare Suche):
 * Ab 1. Element nach größter Zahl suchen, 1. Element mit dieser tauschen.
 * Danach ab 2. Element nach (zweit)größter Zahl suchen, mit 2. Element tauschen
 * und so weiter bis zum Ende.
 * Hinweis: Ergibt zwei geschachtelte Schleifen.
 *
 */
public class aufagbe_3 {

	/**
	 * @param args
	 * By Hacker Dan
	 * copy right 2003 to compsci.ca and Hacker Dan
	 * Bubble Sort algorithm
	 */
	public static void main(String[] args) {
		// input
		// here to uncomment 1 version part
		//double inGabe = IOTools.readDouble("Ihre angabe fur Flieskomma zahlen");
		//
		
		
		// INput tastatur nein
//		int n = IOTools.readInteger("Wie viele Werte? ");
//		int[] numbers = new int[n];
//		double [] numbers;
		 //call for the function that i need to use ?
		double [] numbers ;
		numbers = new double [] {5.768, -87.785, +76.3465, 1.1510, 556143.123, 354.564, 3.5321, 63.6324, -6.4234, 65.345};
		Sort(numbers); // nemenit pozici
		for(int i = 0; i < numbers.length; i++){
			//numbers[i] = IOTools.readInt; 			//for loop to show all the values of the array
			System.out.println(numbers[i]);          //uses the for loop index to select an array 
        }
		
//	//}
////		int t = 0; // zakladni index
////		for(int i = 0; i < d.length; i++){
////			for (int j = 0; j < d.length; j++) {
////				if (d[i] < d[i+1]) { // nimmt das grosste 
////					double swap = d[i]; // swap feature
////					d[i] = d[i+1];
////					d[i+1] = swap;
//				System.out.println(swap);
////				}
////			 // to start another swap
//////				System.out.println(d[i]);
////			}
////			t++;
////			System.out.println(swap);
////			//t++;
		}
//		t++; // to start another swap
//		System.out.println(d[i]);
	// a new function from the ground up  ---- Bubble sort
	public static void Sort(double[] numbers) {
		double a; // to swap variables 
		// here starts the buble sort algo
		for(int i = 0; i < numbers.length-1; i++){
			for(int d = 0; d < numbers.length-1; d++){
				if(numbers[d] > numbers[d+1]){ // bud od nejvetsiho k nejmensimu nebo obracene
					a = numbers[d]; // swap function
					numbers[d] = numbers[d+1];
					numbers[d+1] = a; 
					
				}
			}
		}
	}
}