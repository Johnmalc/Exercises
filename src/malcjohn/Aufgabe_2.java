package malcjohn;

public class Aufgabe_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("// 1st. Sentence");
		int a = 2_000_000;
		int d = 500_000;
		double b = 54.85;
		double c = 989787.845664;
		System.out.println(a+b+c+d); // basic sum
		
		System.out.println("// 2nd. Sentence");
		double r = 6445641689494.6546; // random
		float t = (float) 65464654646.4; // random
		
		float by = Integer.MAX_VALUE; // this is right
		double dy = Integer.MAX_VALUE; // this is right
		
		int g = Integer.MAX_VALUE;
		double y = g+t+r;  // or comment this in and change println to g+r+t
		
		System.out.println(by); // another sum, this time converted to double/float
		System.out.println(dy);
		
		
		System.out.println("// 3rd. Sentence");
		int w = (int) y;
		int q = (int) r;
		int qw = (int) t;
		System.out.println(w); // just takes the max value from integer
		System.out.println(q); // in general there ist always the same number of int
		System.out.println(qw); // it's max_value of that; 10 numbers
		
		System.out.println("// 4th. Sentence");
		float byt = by - 1;
		float duk = by - 10;
		float buk = by / 10 ;
		float puk = (by -10) / 10;
		System.out.println(byt);
		int tuk = (int) byt;
		System.out.println(duk);
		System.out.println(buk);
		System.out.println(tuk);
		System.out.println(puk);

		
		System.out.println("// 5th. Sentence [the last part]");
		long sj = Long.MAX_VALUE;
		long sd = Long.MIN_VALUE;
		
		float fr = (float) sj; // for max value
		double re = (double) sj; // for max value
		
		System.out.println(fr * 10);
		System.out.println(re * 10);
		
		float fg = (float) sd; // for min value
		double ft = (double) sd; // for min value 
		
		System.out.println(fg / 10);
		System.out.println(ft / 10);
		
	}

}
