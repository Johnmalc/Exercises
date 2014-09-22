package ostatni;
/**
 * @author John Malc
 * @version
 * 
 */
public class GanzzahligeDatentypen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(20000000000F == 20000000000F + 1);
		System.out.println(20000000000D != 20000000000D + 1);

		long a = 123456789012345L; // / kdyz je potreba nejake dlouhe cislo jako
									// tady vypsat, protoze jinak nebude
									// funogvat > nakonec L dat
		System.out.println(a);

		System.out.println(123456789 + 5432); // nehraje roli zda necham jak to
												// je ted, dam tam male L nebo
												// dam velike L

		// byte b = 285; // mezi -128 bis +127 | tahle nefunguje
		byte b = (byte) 200; // / stejnak neukaze 200,
								// http://openbook.galileocomputing.de/javainsel/javainsel_02_003.html
								// 2.3.5
		System.out.println(b);

		// short, ukaze jenom do -32536
		short s = (short) 33000;
		System.out.println(s);
	}

}
