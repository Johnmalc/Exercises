package malcjohn;

import java.util.Scanner.*;
import Prog1Tools.IOTools;

public class WurfelSpiel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int anzahlX = 12;
		
		int durchlaufe = 54;
		
		System.out.println("Anzahl der Durchlaufe: " + durchlaufe);
		int meinTipp = IOTools.readInt();
		
		// System.out.println("Mein Tipp war " + meinTipp);
		String text = "Mein Tipp war";
		boolean pokudJemojeCislo = true; 
		int cisla = IOTools.readInt(); 
		switch(cisla) {
		case 1: 
			System.out.println("Geben sie jetzt ihren tipp ");
			if(pokudJemojeCislo){
			for(int d = 0; d < durchlaufe; d++) {
				int f = 1 + (int)(Math.random() * ((6 - 1) + 1));
				System.out.println(f);
				System.out.println(text + " " + f);
				//System.out.println("-------------------------------------------------------------");
				//System.out.println("Anzahl der Siege " + meinTipp);
				//System.out.println("Anzahl der Niederlage " + meinTipp);
				
				// Richtig 
				if(f == meinTipp) {
					System.out.println("Sie haben richtig getippt");
				}else {
					System.out.println("Sie haben falsch getippt");
				}
			}
			break;
		}
	}
}
}
			
			
//			for (int d = 0; d < 6; d++) {
//				int f = 1 + (int)(Math.random() * ((6 - 1) + 1));		
//				System.out.println(text + " " + f);
//			}	
				
//			System.out.println("-------------------------------------------------------------");
//			System.out.println("Anzahl der Siege " + meinTipp);
//			System.out.println("Anzahl der Niederlage " + meinTipp);


