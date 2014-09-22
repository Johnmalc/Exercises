package ostatni;
import java.util.Scanner;
/**
 * @author Johnmalc
 * @version 1.0
 *
 */
public class Conversation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Zadej jsem svoje jmeno");
		String name = new Scanner(System.in).nextLine();
		
		System.out.printf("aha, takze se jmenujes %s, no ale kolik ti je", name ); // %s a , name mi ukaze co zadal za jmeno
		int age = new Scanner(System.in).nextInt();
		
		System.out.printf("Podivejme se, %s. je prece o 2 mene nez %s.%n", age, age + 2 );	// uprvim li "+" na neco > musim upravit i text	
		System.out.print("No a ted mi rekni nejake Fliesskommerzahl");    					// tecka za %s znamena konec vety, byt tam nemusi.
		float value = new Scanner(System.in).nextFloat();
		
		System.out.printf("%s? Absolutne nezajimave, ale moje %s.%n", value, Math.random() * 100); // pokud nebude *100, znamena mezi 0 a 0.99 < coz nechceme
		
	}

}
