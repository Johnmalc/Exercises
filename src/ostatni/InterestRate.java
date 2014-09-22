package ostatni;

/**
 * @author Johnmalc
 * @version 1.0
 *
 */
public class InterestRate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		short age = 2;
		double capital = 600484;
		double rate = 6.4;  // only dot
		
		double InterestRate = capital * age * rate;
		System.out.println(InterestRate);		
	}

}
