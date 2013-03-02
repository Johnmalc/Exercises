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
		
		double dist = area(1.0, 2.0, 4.0, 6.0); // overloading and 
		double dist2 = area(542.0); // could be NaN =  not a number
		System.out.println(dist);
		System.out.println(dist2);
	}
//	public static double absoluteValue(double x) {
//		if (x < 0) {
//			return -x;
//		} else if (x > 0) {
//			return x; // wrong
//		}
//		return x;
//	}
	public static double area(double x1, double y1, double x2, double y2) {
		double b = x2-x1;
		double a = y2-y1;
		double c  = 2*a-2*b;
		
//		System.out.println(b);
		// System.out.println("dskfn " + c );
		double result = Math.sqrt(c);
		return result;
		
	}
	public static double distance2(double t1, double u1, double t2, double u2) {
//		double b = t2-t1;
//		double a = u2-u1;
//		double c  = 2*a-2*b;
//		
//		double radius = distance2(t1,t2,u1,u2);
//		double area = area(radius);
//		return area;
		
		// either or 
		return area(distance2(t1,t2,u1,u2));


	}
}
