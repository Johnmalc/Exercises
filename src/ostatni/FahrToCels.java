package ostatni;
import java.util.Scanner;

class FahrToCels {
	@SuppressWarnings("resource")
	
	public static void main(String[] args) {		
	 System.out.println("Enter your value"); 
	 Scanner scanFaren = new Scanner(System.in);
	 int Celsius = 0;
	 
	 if(scanFaren.hasNextDouble())
     {
         Celsius = ((scanFaren.nextInt() - 32)*5/9);
     }
     System.out.println("The temperature in Celsius is: "+Celsius);
	}

}

