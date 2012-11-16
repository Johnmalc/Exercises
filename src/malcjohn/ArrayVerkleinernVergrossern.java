/**
 * 
 */
package malcjohn;
import java.util.Arrays;
/**
 * @author malcjohn
 * 
 * Array vergrossern und verkleinern
 *
 */
public class ArrayVerkleinernVergrossern {

	/**
	 * 
	 */
	public static void main(String[] args) {
		int bigger [] = {5,64,897,1};
		System.out.println(Arrays.toString(bigger));
		
		
		// nur vegrossern 
		int bigger2[] = new int [bigger.length+1];
		System.arraycopy(bigger, 0, bigger2, 0, bigger.length);
	    System.out.println(Arrays.toString(bigger2));

		// nur verkkleinern
		int smaller[] = Arrays.copyOfRange(bigger, 3, bigger.length);
	    System.out.println(Arrays.toString(smaller));		
		
		

	}

}
