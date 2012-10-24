package malcjohn;

public class FakulatatForWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int fakultat = 1;
		int zahl = 5;
		
		for(int i = 1; i <= zahl; i++) {
			fakultat = fakultat * i;
			}
		System.out.println(fakultat);
	
		
		System.out.println("kjsldfn");
		int fak = 1;
		int zah = 5; // eingabe
		
		while (zah > 1) {
	         fak = fak * zah;
			zah--;
		}
		System.out.println(fak);		
	}	
}

