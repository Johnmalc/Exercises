package malcjohn;

public class Schleife {
	/**
	  * Beschreibung
	  *
	  * @version 1.0 vom 16.10.2012
	  * @author malcjohn
	  */

	  public static void main(String[] args) {
	    int hohe = 5;
	    int breite = 10;
	    
	    System.out.println("Hoehe: " + hohe + " und die innnere Breite ist " + breite);
	      	for (int i = 0; i <= 10; i++) {
	    		for (int x = 0; x <= i; x++) {
	    			System.out.print("X"); // with normaln print you get in one row
		    		}
	    		System.out.println();
	      	}
	      	
	      	System.out.println("............................");
	      	for (int f = 10; f > 0; f--) {
	  			for (int d = 0; d < f; d++) {
	  				System.out.print("R"); // with normaln print you get in one row
	  				}
	  			System.out.println();
  }
	  }}
	     
	     
