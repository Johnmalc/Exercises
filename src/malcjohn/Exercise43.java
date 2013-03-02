package malcjohn;

public class Exercise43 {
	public static void fromNineto(int number, int numberMinusOne) {
		if (number == 0) {
			System.out.println("No bottles of beer on the wall, no bottles of beer, ya \' can\'t take");
			System.out.println("one down, ya\' can\'t  pass it around, \' cause there are no more");
			System.out.println("bottles of beer on the wall");	
		} else if (number < 100) {
			System.out.println(number + " bottles of bear on the wall, " + number + " bottles of beer, ya\' take one ");
			System.out.println("down, ya\' pass it around, " + numberMinusOne + " bottles of beer on the wall.");
			fromNineto(number-1, numberMinusOne-1);			
		}
	}
	public static void main(String[] args) {
		fromNineto(99,98);
		
	}
}
