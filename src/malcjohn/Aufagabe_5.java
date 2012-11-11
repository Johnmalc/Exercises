package malcjohn;

import java.util.Scanner;

public class Aufagabe_5 {

	/**
	 * @param args
	 */
	public static long fibo (int n) {
	   long auf[] = new long [n+1];

	   auf[0] = 0;
	   auf[1] = 1;

	   for(int i = 2; i < auf.length; i++){
	         auf[i] = auf[i-1] + auf[i-2];
	   }
	   return auf[n];
	}
	public static void main(String[] args) {
		//Scanner n = new Scanner(System.in);
		System.out.print(fibo(30));
		  
	}

}
