package malcjohn;

public class Raviolita {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double PI = Math.PI;
		double u, p, boden, bod, boden3, bode, boden5;
		u = 50;
		p = 60;
		
		boden = u/PI;
		bod = PI* Math.pow((boden/2),2);
		boden3 = u * p;
		bode = 2 * boden3 * bod;
		boden5 = p * bod;
		
		System.out.println("boden:" + u/PI);
		System.out.println("boden:" + bod);
		System.out.println("boden:" + boden3);
		System.out.println("boden:" + bode);
		System.out.println("boden:" + boden5);
		
	}

}
