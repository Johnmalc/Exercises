package malcjohn;
import java.util.Scanner;

public class noch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Size");
        int yourNumbers = scan.nextInt();
        double[] array = new double[yourNumbers];

        System.out.println("Numbers");

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            array[i] = scan.nextDouble();
         }

       Sort2(array);		
				
	}
	public static void Sort2(double[] yourNumbers) {
		double swap; 
		 for(int i = 0; i < yourNumbers.length - 1; i++){
	            for(int d = i + 1; d < yourNumbers.length; d++){
	                if(yourNumbers[i] > yourNumbers[d]){ 
	                    //swap feature
	                    swap = yourNumbers[i];
	                    yourNumbers[i] = yourNumbers[d];
	                    yourNumbers[d] = swap;

	                }
	            }
	        }

	}}