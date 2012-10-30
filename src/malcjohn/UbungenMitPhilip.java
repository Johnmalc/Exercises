package malcjohn;

public class UbungenMitPhilip {
	public static void main(String[] args) {
		// aufgabe 1
//		int alter = 8;
//		if(alter == 18) {
//			System.out.println("ist 18");
//		}else if (alter < 18) {
//			System.out.println("kleiner 18");
//		}else {
//			System.out.println("grosser 18");
//		}
		
		//aufgabe 2 - art 1
//		boolean  wind = false;
//		boolean sonne = false;
//		boolean luft  = false; 
		
//		if((wind && luft) != true){ // false - else ; true - if
//			System.out.println("regen mit");
//		}else {
//			System.out.print("nichts");
//		}
		// art 2
//		boolean  wind = true;
//		boolean sonne = true;
//		boolean luft  = true;
//		
//		if(wind && luft) {
//			System.out.println("Rgens mitnehmen");
//		}
		System.out.println("----------------------------------------------");
		
		
		// aufgabe 3
//		int ja, po, de, re, we,pw;
//		ja = 15;
//		po = 48;
//		de = 645;
//		we = 564;
//		pw = 6514;
//		re = 64;
		
//		double formel = ((ja+po+de+we+re+pw)/6); // logische mit double 
//		System.out.println(formel);
		
		// aufageb 4 string vergleichen
//		String text = "Ichm  ahedlkf";
//		String tex2 = "jlksgldsknglsk";
		
//		if(text.equals(tex2)) {
//			System.out.println("richtig ");
//		}else {
//			System.out.println("falsch");
//		}
		
//		System.out.println(text.length()); // rechnen auch mit leerzeichen
//		System.out.println(tex2.length());
		
		// substring
		
		// System.out.println(text.substring(5, 9)); // inclusive 
		
		// charAt
		/*
		char sub = text.charAt(2);
		char du = tex2.charAt(6);
		System.out.println(sub); 
		System.out.println(du);
		*/
		//replace 1
		/*
		String qpp = "dsflkn";
		String rep = text.replace('I', 'i');
		String reo = tex2.replace("jlks", qpp); // vezme neco z orig. stringu a replasuje mit string qpp
		String ret = text.replaceAll("Ichm", "d"); // lieber nicht nutzen docs.api, replaceall ist langsamer
		*/
		// http://stackoverflow.com/questions/10827872/difference-between-java-string-replace-and-replaceall
		// replace('.', '\\'); 
		/*
		System.out.println(rep); // i 
		System.out.println(reo);
		System.out.println(ret);
		
		String a = text.toUpperCase();
		System.out.println(a);
		System.out.println(ret);
		 */
		// breite 10 und hohe 5 while loop
		int place = 0;
		
		for(int x = 0; x < 10; x++){
			for (int p = 0; p < 5; p++){
			System.out.print("X");	
		}
		System.out.print("X");
		System.out.println("");
		
//		while(place < 10){
//			place++;
//			System.out.print("X");
//		}
		
		//System.out.println("x");
		
		
				
				
	}
	
	}
}
