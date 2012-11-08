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
	
	//jeste jinak
	public static void fibonanan(String[] args) {
	// http://noebis.pi-noe.ac.at/javanuss/node185.html
		 int maxzahl;
	        maxzahl = Integer.parseInt(args[0]);
	        int [] fib = new int [maxzahl+1];
	        fib[1]=1;
	        fib[2]=1;
	        System.out.println("1: " + fib[1]);
	        System.out.println("2: " + fib[2]);
	        for (int i = 3; i <= maxzahl; i++) {
	            fib[i] = fib[i-1] + fib[i-2];
	            System.out.println(i + ": " + fib[i]);
	        }
}
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
