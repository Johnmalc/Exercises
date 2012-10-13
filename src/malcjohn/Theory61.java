package malcjohn;

public class Theory61 {
	public static double area(double radius) {
		// double area = Math.PI * radius * radius;
		return Math.PI * 2 * radius;
	}
	public static void main(String[] args) {
		double radius = 4;
		System.out.println(area(radius));
//		absoluteValue(0);
		
		double dist = distance(1.0, 2.0, 4.0, 6.0);
		System.out.print(dist);
	}
//	public static double absoluteValue(double x) {
//		if (x < 0) {
//			return -x;
//		} else if (x > 0) {
//			return x; // wrong
//		}
//		return x;
//	}
	public static double distance(double x1, double y1, double x2, double y2) {
		double b = x2-x1;
		double a = y2-y1;
		double c  = 2*a-2*b;
		
//		System.out.println(b);
		// System.out.println("dskfn " + c );
		double result = Math.sqrt(c);
		return result;
		
	}
	
	



}
