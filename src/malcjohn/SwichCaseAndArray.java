package malcjohn;
import java.util.*;

public class SwichCaseAndArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		double d = new Scanner(System.in).nextDouble();
		char c = new Scanner(System.in).next().charAt(0);
		double r = new Scanner(System.in).nextDouble();
		
		// what will be changed everytime
		// prvni je cislo
		// potom je znamenko
		// potom je cislo > vysledek
		switch(c) {
			case '+':
				System.out.println(d+r);
			break;
			case '-': 
				System.out.println(d-r); 
			break;
			case '*':
				System.out.println(d*r);
			break;
			case '/':
				System.out.println(d/r);
			break;
			// error
			default:
			System.err.println("eroro");			
		}
		// char mit Array and for 
		for (char charToTestIfVowel : "Come at me, @TheKevinButler".toCharArray()){
	      switch (charToTestIfVowel){
	        case 'a': case 'A':     // Fällt durch
	        case 'e': case 'E':		// unterschiedliche Schreibweise
	        case 'i': 
	        case 'I':
	        case 'o': case 'O':
	        case 'u': case 'U':
	          System.out.println( charToTestIfVowel + " ist Vokal" );
	            break;
	        default:
	          System.out.println( charToTestIfVowel + " ist kein Vokal" );
	      }
		}
		// String and Swich-case
		String input = new Scanner(System.in).next();
		switch ( input.toLowerCase() )
		{
		  case "kekse":
		    System.out.println( "Ich mag Keeeekse" );
		    break;
		  case "kuchen":
		    System.out.println( "Ich mag Kuchen" );
		    break;
		  case "scholokade":
		  case "lakritze":
		    System.out.println( "Hm. lecker" );
		    break;
		  default:
		    System.out.printf( "Kann man %s essen?", input );
		}
		
		
		
	}
}