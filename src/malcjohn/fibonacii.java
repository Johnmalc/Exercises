package malcjohn;

import java.util.Scanner;

public class fibonacii {
	/*
	 * Dynamic programming
	 * memoization, save element for later using
	 */
  public static void main(String[] args) {
//	  Scanner scan = new Scanner(System.in);
//	  long n = scan.nextLong();
	  // Vypise radu cisel
	  int d = 5;
	  int[] n = new int [d];	   
	  n [0] = 0;
	  n [1] = 1;
	  for(int i = 2; i < d; i++){
		   	n[i] = n[i-1] + n [i-2];
		   	
	   }
	  for (int r = 0; r < d; r++){
			System.out.println(n[r]);

	  }
	  
	  // pro methodu
	 System.out.println(fibon(2));
  }
  public static long fibon(int cislo) {
	  
	  long[] fibonaci = new long [cislo];
	  //If number is 0 or 1 return 1
//	  if() {
//		long f = fibon(cislo-1)+ fibon(cislo-2);
//		fibonaci[cislo] = f;
//	  }
	  return fibonaci[cislo];
	  
  }
} // end of main