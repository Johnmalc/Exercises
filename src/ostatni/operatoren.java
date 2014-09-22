package ostatni;
/**
 * @author  John Malc
 * @version 
 *
 */
public class operatoren {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int u = 12, j; // j znamena u=12
		j = u *2; // u=12 in j gespeichert
		// nevypise nic
		
		int baba = 1;
		System.out.println(baba == 2); // false
		System.out.println(baba = 1); // == true / = 1
		
		int v = 0; // jakekoliv cislo, ale musi byt
		System.out.println( (v=12) * 12);
		System.out.println(v);

		// special "deleni"   < pouze tecka >
	    System.out.println(5.0 / 8); // 0.625
	    System.out.println(5.0 / 8.0); // 0.625
	    System.out.println(5 / 8); //0
	    
	    // %
	    System.out.println( 8 % 6); // abych zjistil kolik je restwert
	    System.out.println( 64.0 % 8.9);
	    // Die Division und der Restwert richten sich in Java nach einer einfachen Formel: (int)(a/b) · b + (a%b) = a
	    
	    // NOT - but - WARNING ne kazdy minus je minus
	    System.out.println( "+5% +3  = " + (+5% +3) );   //  2
	    System.out.println( "+5 / +3 = " + (+5 / +3) );  //  1

	    System.out.println( "+5% –3  = " + (+5% -3) );   //  2
	    System.out.println( "+5 / –3 = " + (+5 / -3) );  // –1

	    System.out.println( "-5% +3  = " + (-5% +3) );   // –2
	    System.out.println( "-5 / +3 = " + (-5 / +3) );  // –1

	    System.out.println( "-5% –3  = " + (-5% -3) );   // –2
	    System.out.println( "-5 / –3 = " + (-5 / -3) );  //  1
	     
	    // Bekannte Rundungsfehler (zeigte 256) obwohl 0 zeigen sollte, Fehler trat 1994 beim Pentium-Prozessor
	    // im Divisionsalgorithmus Radix-4 SRT auf 
	    double x, y, z;
	    x = 4195835.0;
	    y = 3145727.0;
	    z = x - (x/y) * y;
	    System.out.println( z );
	    
	    int i = - - - + + - - + - + - + + - - - 3; // ale uz --------- nerozezna, musi byt mezery
	    
	    System.out.println(2 + 3 + "bc" + 2 + 3); // pred zavorkami aritmeticke op - po zavorkach ne
	}

}
