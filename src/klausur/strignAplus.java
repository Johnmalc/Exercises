package klausur;
import java.util.Arrays;

public class strignAplus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * String + number > string and number together
		 */
		String a = "sdjlkkjdf";
		int b = 556;
		System.out.println(a+b);

		/*
		 * String equels
		 * Nehraje roli zda new string nebo proste jenom string ; equels dela obsah
		 */
		String so = new String ("ldsfndf");
		String ao = new String ("jh");
		System.out.println(so.equals(ao));  // true/flase
		System.out.println(so==ao); 		// false
		boolean f = (so==ao);
		System.out.println(f);
		System.out.println("");

		// u double a bytku je to jine, pouze u intioger je to jine
		Double ado = new Double (654);
		Double tos = new Double (64);

		Integer tko = 126;
		Integer klj = 126;

		Float rew = (float) 15.98;
		Float wer = (float) 15.98;
		
		System.out.println(ado.equals(tos)); // protoze ruzne
		System.out.println(tos==ado);
		System.out.println();
		System.out.println(tko==klj);// ausnahme true
		System.out.println(tko.equals(klj)); //ausnahme true
		
		System.out.println(rew==wer);// ausnahme false
		System.out.println(rew.equals(wer)); //ausnahme true


		/*
		 * Array :  toString a for loop !!!!!!!!!
		 */
		int [] ar = new int [5];
		int [] dol = {1,1,1,11,1,1,1,1,1}; // eine andere moglickeit
		ar[0] = 5;
		ar[1] = 9;
		// vypise pouze Speicher-platz 
		System.out.println(ar.toString());
		
		for (int i = 0; i < ar.length ;i++) {
			System.out.println(ar[i]); // vypise 5 9 a pak same nuly
		}
	}

}
