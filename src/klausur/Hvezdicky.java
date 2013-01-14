package klausur;

public class Hvezdicky {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			for (int d = 0; d < i; d++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("ddddddddddddddddd");
		for (int k = 10; k >= 0; k--) {
			for (int e = 0; e < k; e++) {
				System.out.print("*");
			}
			System.out.println("");

		}
		// fakulatat
		int a = 1;
		int meine = 8;
		for (int f = 1; f < meine; f++) {
			a = a * f;
		}
		
		System.out.println(a + "+" +  fak(8) );
		System.out.println(getFib(8));

	}
	// fibonacci
	public static long getFib(int meine) {
		if (meine <= 1 || meine == 0) return 1;
		else return getFib(meine-1)+ getFib(meine-2);
	}
	public static long fak (int meined){
		if (meined <= 1){
			return 1;
		}
		return meined * fak(meined-1);
		
		
	}
}
