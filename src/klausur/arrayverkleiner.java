package klausur;
import java.util.Arrays;

public class arrayverkleiner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {6,5,6,8,4,6,2,1,5,4};
		int [] b = Arrays.copyOfRange(a, 3, 5);
		
		for(int i = 0; i<a.length; i++){
			System.out.println(b[i]);
		}

	}

}
