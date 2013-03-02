package malcjohn;
import Prog1Tools.IOTools;

public class Four31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int obergrenze  =100,
		    untergrenze =1,
		    zaehler     =0,
		        eingabe,
		        zufall;


		    System.out.println(" *** Zahlenraten\n");
		    System.out.print("Ich denke mir eine Zahl zwischen "+untergrenze+" und");
		    System.out.println(" "+obergrenze+". Rate diese Zahl!\n");
		    
		    zufall = (int)(Math.random()*(obergrenze-untergrenze)+untergrenze);

		    do {
		      zaehler++;
		      System.out.print(zaehler + ". Versuch: ");
		      eingabe=IOTools.readInteger();
		      if (eingabe < zufall)
		        System.out.println("Meine Zahl ist groesser!");
		      else if (eingabe > zufall)
		        System.out.println("Meine Zahl ist kleiner!");
		      else
		        System.out.println("Du hast meine Zahl beim "
		                           + zaehler + ". Versuch erraten.");
		    } while (eingabe!=zufall);

	}

}
