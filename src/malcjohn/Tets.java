package malcjohn;

public class Tets {
	public static void main(String[] args) { 
		int hour;
		int minute;
			
		hour = 11;
		minute = 59;
		
		int quetient = 7 / 3;
		int remainder = 546468490 % 1000;
		
		
		System.out.println(hour);
		System.out.println(minute);
		printParityNested(1);
		System.out.println(quetient);
		conditionalStatement();
		System.out.println(remainder);
		printParity(-80); // sem muzu dava ruzna cisla
	}
//	public static void printTime(int hour, int minute) { 
//		printTime(hour, minute);
//		
//	}
	
	public static void conditionalStatement() { 
		int number = 9;
		if (number / 10 <= 5) {
			System.out.println(" idiot");
		} else {
			System.out.println(" not idiot");
		}
	}	
	
	public static void printParity(int x) {
		if(x % 2 > 0) { // O is not a number
			System.out.println(" number is even");
		} else if (x < 0) {
			System.out.println("This is a negative number");
		}
		  else {
			System.out.println(" sdjk");
		}
	}

	public static void printParityNested(int y) {
		if (y == 0) {
			System.out.println("is zero");
		} else {
			if (y < 0) {
					System.out.println(" is negative");
				} else {
					System.out.println(" is possitive");
				} 
			}
	
	}
}