/**
 * Import must be after package
 */
package malcjohn;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import Prog1Tools.IOTools;

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
public class Aufgabe_3 {

	public static void main(String[] args) {
				
		// VAriant ohne Input
	double numbers[] = {5.768, -87.785, +76.3465, 1.1510, 556143.123, 354.564, 3.5321, 63.6324, -6.4234, 65.345};
	Sort(numbers); // nemenit pozici	
	for(int i = 0; i < numbers.length; i++){ //for loop to show all the values of the array
         System.out.println(numbers[i]);          //uses the for loop index to select an array 
    }
	}
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
