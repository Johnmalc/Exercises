package ostatni;
import java.util.*;
/**
 * @author  John Malc
 * @version 1.0
 *
 */
public class Dynamic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Tell me your capital");
		double capital =  new Scanner(System.in).nextDouble();
		
		System.out.println("Tell me your age in months");
		int age =  new Scanner(System.in).nextInt();
		
		System.out.println("How big is your rate (NOT . but ,) ?"); // in deu : Zinsatz
		double rate =  new Scanner(System.in).nextDouble();

		double Dynamic = capital * age * rate / (12*100); /// MONTHS= 12*100 DAYS =[365*100]
		System.out.println("Zinsen: " + Dynamic);
	}

}
