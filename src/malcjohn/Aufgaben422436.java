package malcjohn;

import java.util.Arrays;

import Prog1Tools.IOTools;

public class Aufgaben422436 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 4.22
		//		int i, j;
//		for(i=1;i<=10;i++){
//			System.out.println("a1 " + i);
//			i=5;
//			System.out.println("a2 " + i);
//		}
//		for(i=7;i<=20;i++){
//			System.out.println("a1 " + i);
//			i+=2;
//			System.out.println("a2 " + i);
//		}
		
		//4.24
//		double a, b,c,d,e;
//		a = IOTools.readDouble();
//		b = IOTools.readDouble();
//		c = IOTools.readDouble();
//		d = IOTools.readDouble();
		
//		if(b>a){
//			if(c>b){
//				if(d>c){
//					e=d;
//				}else {
//					e=c;
//				}
//			}else {
//				if(d>b){
//					e=d;
//				}else{
//					e=b;
//				}
//			}
//		}else{
//			if(c>a){
//				if(d>c){
//					e=d;
//				}else {
//					e=c;
//				}
//			}else {
//				if(d>a){
//					e=d;
//				}else {
//					e=a;
//				}
//			}
//		} 
//		System.out.println("e" + e);
//	}
//		
//		e=a;
//		if(d>e){
//			e=b;
//		}
//		if(c>e){
//			e=c;
//		}
//		if(b>e){
//			e=d;
//		}
//		System.out.println("e" + e);
		
		//4-26
		// while 
//		querSumme = 0;
//
//	    while ( zahl != 0 ) {
//
//	      aktuelleZiffer = zahl % 10;  // letzte Ziffer auslesen
//	      zahl           = zahl / 10;  // letzte Ziffer abschneiden
//	      querSumme     += aktuelleZiffer;
//	      System.out.print( aktuelleZiffer  );
//	      if ( zahl != 0 ) System.out.print( " + " ); // nach 'letzter' (eigentlich: erster) Ziffer darf kein '+' ausgegeben werden
//	    }
//
//	    System.out.println( " = " + querSumme );
//	  }
		
		
		
//		int suma = IOTools.readInt("pos Zahl");
//		
//		if(suma < 0 || suma >= 10000){ 
//			System.out.println("falshc");
//		}else {	
//			System.out.println( "\nDie Quersumme ergibt sich zu: " );
//			int aktuelleZiffer;
//			int querSumme;
//			for(querSumme = 0; suma != 0; querSumme+= aktuelleZiffer) {
//				aktuelleZiffer = suma % 10; // letzter zahl
//				suma = suma / 10; // abspaltet
//				
//				System.out.print( aktuelleZiffer  );
//			  if ( suma != 0 ) {
//				  System.out.print( " + " ); //2 + 1 +  = 3 kann nicht sein 
//			  }
//			  // nach 'letzter' (eigentlich: erster) Ziffer darf kein '+' ausgegeben werden   
//			}  System.out.println( " = " + querSumme );
//		}
		
		//4-28
		int zahl = IOTools.readInt("posi Zahl");
//		if(zahl > 0) {
//			System.out.println("is ok " + zahl);
//					
//			int zerlegung = 0;
//			int neuezahl;			
//			while(zahl != 0){
//				neuezahl = zahl % 10 ;
//				zahl = zahl / 10;
//				zerlegung+=neuezahl;
//				// zerlegt ruckwaerts
//					
//				switch(neuezahl){
//				// oder auch so
////				switch (rest) {
////		        case 1: ziffer = "eins";   break;
////		        case 2: ziffer = "zwei";   break;
////		        case 3: ziffer = "drei";   break;
//				case 0 : System.out.print("nul "); continue;
//				case 1 : System.out.print("eins ");continue;
//				case 2 : System.out.print("zwei "); continue;
//				case 3 : System.out.print("drei ");continue;
//				case 4 : System.out.print("vier ");continue;
//				case 5 : System.out.print("funf ");continue;
//				case 6 : System.out.print("sechs ");continue;
//				case 7 : System.out.print("sieben ");continue;
//				case 8 : System.out.print("acht ");continue;
//				case 9 : System.out.print("neuen ");continue;				
//				}
//			//System.out.print(neuezahl)
//		    break;
//			}
//		}else {
//			System.out.print("nur possitive");
		int [] me = {1,5,8,80};
		int [] de = {5613,44897,68431,31};
		
		
		boolean check = Arrays.equals(me, de);
		
		if(check == false){
			System.out.println("sadf");
		}
		
		
		
		
		
		
		
	}
}


