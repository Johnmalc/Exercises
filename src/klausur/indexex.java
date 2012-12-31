package klausur;

import java.util.Arrays;

public class indexex {

	/**
	 * @param args
	 */
	public static int [] ar ={64,6541,3514,84698,931,3};
	public static void main(String[] args) {
		indexex my = new indexex();
		if(my.bo(4,4)) {
			System.out.println(Arrays.toString(ar));
			
		}
	}
	public static boolean bo(int x, int y) {
		if (x <=0 || y <=0) {
			return false;
		}else {
			int swap = ar[x];
			ar[x] =ar[y];
			ar[y] = swap;
			return true;
		}
	}

}
