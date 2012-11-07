package malcjohn;

import java.util.Scanner;

public class FibonacciRecursion {

	/**
	 * Reseni wachst exponentiel, auch bei meine Comp >  Iterative
	 * @param args
	 * @return 
	 */
	//Recursive
//	public static long Fibo (int n) {
//		if (n == 0 || n == 1) {
//			return 1;
//		}
//		if (n < 0) {
//			return 0;
//		}
//		return Fibo(n-1) + Fibo(n-2); 
//	}
	// mit loop
//	public static long f(int n){
//		long a = 1; 
//		long minus2;
//		long minus = 0;
//		for(int i = 0; i < n; i++) {
//			minus2 = minus;
//			minus = a;
//			a = minus + minus;
//		}
//		return a;
//	}
	
	//Iterativ 
	public static void main(String[] args) {
		// for recursive
		// že f(n+2) = f(n) + f(n+1
		//System.out.println(Fibo(50));
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		
		// velice rychle
	// odkomentovat	System.out.println(f((int) n));
	}

}
