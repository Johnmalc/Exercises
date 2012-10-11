package malcjohn;

public class Recursion {
	public static void coutdown(int n, int d) {
		if (n == 0) { // == bude psat numbers / > nic nevypise
			System.out.println("ldvdfknv");
		} else { 
			System.out.println(n + d);
			coutdown(n-1, d-1); // s + bude navysovat cisla, od 4 tisic; pri pouze n to bude psat pouze cislo 16
		}
		
	}
	public static void main(String[] args) {
		coutdown(16, 15);
	}
}
