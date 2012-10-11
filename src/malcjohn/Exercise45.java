package malcjohn;

public class Exercise45 {
	public static void checkFermat(int a, int b, int c, int n) {
		if (n > 2 && (a^n+b^n)==(c^n)) {
			System.out.println("Holy smokes, Fermat was wrokng");
		} else  {
			System.out.println("NO, that doesn't work");
		}
	}
	public static void main(String[] args) {
		int n = 3; 
		int a = (int) Math.pow(2, n); // libovolna cisla
		int b = (int) Math.pow(3, n);
		int c = (int) Math.pow(4, n);
		checkFermat(a,b,c,n);
	}
	
	
}
