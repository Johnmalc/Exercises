package ostatni;
import java.util.Scanner;
/**
 * @author  John Malc
 * @version 1.0
 *
 */
public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int age = new Scanner(System.in).nextInt();
		boolean adult = true;    // very important
		System.out.println( age );    
		if ( age >= 18 )  // grosser gleich            
		  adult = true;
		
		if ( age <= 18 )  // grosser klein            
			  adult = false;
		
		System.out.println( adult );
	}

}
