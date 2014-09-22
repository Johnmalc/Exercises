package ostatni;
import java.awt.Point;

/**
 * @author Johnmalc
 * @version
 * 
 *          class Application { public static void main( String[] args ) {
 *          System.out.println( "Hallo Welt" ); System.out.println( 1 - 2 ); } }
 * 
 */
class Dalsi {
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) {
//		String text = "Hallo Welt " + 21;
//		System.out.println(text);
//		System.out.println(2.1422221489849498973);
//		System.out.println((6 + 9) * 15);
//		System.out.print("true \n");

		/**
		 * System.out.printf("Wie funktionert diesen Abschnitt %n"); //
		 * http://openbook.galileocomputing.de/javainsel/javainsel_02_002.html
		 * System.out.printf("%s Habe ich keine Ahnung", 1654);
		 */

//		java.awt.Point p = null;
//		String         s = null;
//		p.setLocation( 1, 2 );
//	    s.length();
		
		 String s1 = javax.swing.JOptionPane.showInputDialog( "Eingabe" );
		    if ( s1 != null && ! s1.isEmpty() )
		      System.out.println( "Eingabe: " + s1 );
		    else
		      System.out.println( "Abbruch oder keine Eingabe" );		
		
	}

}