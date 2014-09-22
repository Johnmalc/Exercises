package ostatni;

/**
 * @author  John Malc
 * @version 
 *
 */
public class herausziehenUndHerunterziehen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Der Präfix-Operator verändert die Variable vor der Auswertung des Ausdrucks, 
		// und der Postfix-Operator ändert sie nach der Auswertung des Ausdrucks. Mit anderen Worten: Nutzen wir einen Präfix-Operator, 
		// so wird die Variable erst herauf- beziehungsweise heruntergesetzt und dann der Wert geliefert. 
		//
		// Prafix-Inkrement ++ und --Dekrement (auch fur Fliesskommazahlen)
		int h = 911881, f = 718;
		System.out.println(++h); // h= h + 1 
		System.out.println(-f); // s jednim > - pred sam. cislem // -- f = f-1
		System.out.println(h); // ukazi to nove
		System.out.println(f);
		
		// Postfix- -||- POZOR RUZNE
		int i = 10, j = 20;
		System.out.println( i++ );   // zustava 10
		System.out.println( i );     //  se ted zvisi 11
		System.out.println( j-- );   // zustava 20
		System.out.println( j );     // 19
		
		
		int k = 4, r = 9;
		boolean result1 = ( (k==9) );
		boolean result2 = ( (k < 9) );
		
		int a = 10, b = 11;
		boolean result3 = ( a == b );        
		boolean result4 = ( a < b );
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.print(result4);
		
		// Zatímco 'A' znamená znak A, "A" znamená řetězec, který obsahuje jeden znak A.
		System.out.println("\n b"); // zde musi byt "" ne ''
		System.out.println((char) ('u' + 4)); // dle abecedy		
		
	}

}
