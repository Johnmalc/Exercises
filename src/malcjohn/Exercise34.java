package malcjohn;

public class Exercise34 {
	public static void printAmerica() {
		String day = "Tuesday";
		String month = "October";
		int year = 2012;
		int date = 2;
		System.out.println(day + ", " + month + " " + date + ", " + year);

	}
	
	public static void main(String[] args) { // void means it doenst retern a value
		printAmerica();
		printEurope();
	}
	
	public static void printEurope() { 
		String day= "Tuesday";
		String month = "October";
		int year = 2012;
		int date = 2;
		System.out.print(date + " " + month + " " + year + ", " + day);
		
	}
}
