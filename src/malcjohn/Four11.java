package malcjohn;
import Prog1Tools.IOTools;
import java.util.*;

public class Four11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		String name = IOTools.readString("deine name");
		System.out.println("hallo " + name);
		System.out.println("dein Alter bitte ");
		int alter = IOTools.readInt("alter in jahren");
		
		int formula = alter* 365;
		System.out.println(formula);
		
		int b = 2, g=6;
		System.out.println("jkhb"+ (b-g));

		b++;
		//System.out.println(b, formula);
		System.out.println("sak" + formula);
		*/
		double x,y,a,s,q,w,c,v,f,g, o,l;
		x = Math.pow(10,20);
		a = 1223;
		q = Math.pow(10, 18);
		c = Math.pow(10, 15);
		f = 3;
		o = Math.pow(-10, 12);
		y = Math.pow(10, 20);
		s = 2;
		w = Math.pow(-10, 22);
		v = Math.pow(10, 13);
		g = 2111;
		l = Math.pow(10, 16);
		
		double formula = ((x*y)+(a*s)+(q*w)+(c*v)+(f*g)+(o*l));
		System.out.println(formula);
		double rken = (x*y);
		double rken2 = (a*s);
		double rken3 = (q*w);
		double rken4 = (c*v);
		double rken5 = (f*g);
		double rken6 = (l*o);
		System.out.println(rken);
		System.out.println(rken2);
		System.out.println(rken3);
		System.out.println(rken4);
		System.out.println(rken5);
		System.out.println(rken6);
		System.out.println(rken+rken2+rken3+rken4+rken5+rken6);
	}

}
