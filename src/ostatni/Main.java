package ostatni;

/**
 * @author  John Malc
 * @version 
 *
 */
public class Main {

	/**
	 * @param args
	 * Kurzschluss-Operatoren
	 * http://openbook.galileocomputing.de/javainsel/javainsel_02_004.html#dodtp411e79c4-93d7-41b5-ae03-73c7a603a5b6
	 */
	public static void main(String[] args) {
		System.out.println(false | f() );
		System.out.println(true & f() ); // false
		System.out.println(true && f() ); // false
		System.out.println(true | f() ); // true
	
		// Pokud neco jineho nez float, tak ukazuje spravne; pri float je to ale jinak
		float a = -16777217F; // sache je http://openbook.galileocomputing.de/javainsel/javainsel_02_003.html#dodtpe5f9b617-1ad2-4f73-b84e-b883a84cb286
		float b =  16777216F; // F ukazuje ze jde o float
		float c =  1F;
		System.out.println( a + b + c );    // 1.0 ( ikdyz ma byt a+b=-1, tak java to kvuli beschrankung von float spocte na 0; no a pak 0+1=1
		System.out.println( a + (b + c) );  // 0.0
		
		
		// POZOR nic nevypise 
		// 2.4.9 Der Rang der Operatoren in der Auswertungsreihenfolge
		boolean A = true, B = false, C = true;
		System.out.println(A && !B); // true
		
		// dalsi priklad 
		boolean r = false,
				d = false,
				h = true;
		System.out.println( r && d | h ); // false
		
	}

	/**
	 * @return
	 */
	private static boolean f() {
		return false;	 
	 } 		 
}
	
