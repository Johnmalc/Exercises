package malcjohn;

public class SekundenZerlegen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long a,d,r,h,t,de,re,he,te;
		a = 15806515121311622L;
		
		d = a/60;
		r = d/60;
		h = r/24;
		t = h/365;
		
		de = a%60; // sekunden
		re = d%60; // minuten
		he = r%24; // tagen
		te = h%365;  // jahren
		
//		System.out.println("in minuten " + (de));
//		System.out.println("in stunden " + (re));
//		System.out.println("in tagen " + (he));
//		System.out.println("in jahren" + (te));

		System.out.println((t) +" Jahren ");
		System.out.println((te) +" tagen ");
		System.out.println((he) +" stunden ");
		System.out.println((re) +" minuten ");
		System.out.println((de) +" sekunden ");

	}

}
