package malcjohn;

public class GgT {

	public static void main(String[] args) {
		System.out.println(ma(20, 40));
	}

	public static int ma(int a, int b) {
		if (a == b) {
			return a;
		} else if (a < b) {
			return ma(a, b - a);
		} else {
			return ma(a - b, b);
		}
	}
	public static int ka (int a, int b) {
		return a*(b/ma(a,b));
		
	}

}