package ostatni;
import java.awt.Point;
import java.io.File;

/**
 * @author John Malc
 * @version
 * 
 */
public class Typanpassung {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = (int) ((int) 1.0354 + 1.05164);
		int m = (int) (1.05546 + 2.05644);
		System.out.println((int) 12.39);
		System.out.println((int) 12.89);
		System.out.println((int) 0.39);
		System.out.println((int) -0.2);

		new Point();
		Point p = new Point();
		p.x = 2;
		p.y = 5 + p.x;

		String s = p.toString();
		System.out.println(p.toString().length());
		System.out.println(new Point().toString().length()); // 23 // OOP -
																// Objekterzeugung
																// ohne
																// Variablenzuweisung

		Point player1 = new Point();
		player1.x = player1.y = 10;

		Point door = new Point();
		door.setLocation(10, 100);

		System.out.println(player1.distance(door));

		System.out.println(door);
		System.out.println(player1.toString());

		long Size = new File("file.txt").length();

		// System.out.printf("sdkjndjnf" + "%n"); // % Patterns
		// http://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
		// System.out.printf("%tD%n", new Date()); // "%tD" vypise ve formatu
		// M.D.R
		//
		//
		// int i = parseInt( showInputDialog( "Erste Zahl" ) ); // %d represents
		// a decimal number in an ouput
		// int j = parseInt( showInputDialog( "Zweite Zahl" ) );
		// out.printf("%d ist größer oder gleich %d.%n", max(i, j), min(i, j) );
		// System.exit ( 0 ); //ends the program
		// // http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
		// //
		// http://docs.oracle.com/javase/tutorial/essential/io/formatting.html

	}

}
