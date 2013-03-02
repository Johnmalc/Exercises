package malcjohn;

public class Return {
	public static void printLogarithm(double x ) {
		if (x <= 0.0) {
			System.out.println("possitive !");
		return;
	}
		
		double result = Math.log(x); // (int) - type-casting > 1.0
		System.out.println("result " + result);
	
	}
	public static void main(String[] args) {
		printLogarithm(5);
	}
//		double result = Math.log(x);
//		System.out.println("result" + result);
//	}

}
