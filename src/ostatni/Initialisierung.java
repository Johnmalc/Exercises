package ostatni;
import java.util.*;
/**
 * @author  John Malc
 * @version 1.0
 *
 */
public class Initialisierung {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Tell me your age and I will tell you if you are an adult");
		int age = new Scanner(System.in).nextInt();
		
		// if you are younger than 18
		if(age < 18){ // zavorky delaji "then statment"
		 System.out.println("No, you are not an adult");
	}
		
		// if you are older than 18
		if(age > 18){ // zavorky delaji "then statment"
		System.out.println("Yes, you are an adult");
	}
  }
}
