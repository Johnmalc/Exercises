package malcjohn;
import Prog1Tools.IOTools;

public class Aufgabe6vonUbungen {

	/**
	 * @param args
	 */
	
	public static class Personen {
		String vorname;
		String name;
		String email;
		int telefon;
	}

	
	public static void main(String[] args) {
		Personen freunde[] = new Personen [5];
		
		Personen meinefreunde1 = new Personen();
		Personen meinefreunde2 = new Personen();
		Personen meinefreunde3 = new Personen();
		Personen meinefreunde4 = new Personen();
		Personen meinefreunde5 = new Personen();
		
		meinefreunde1.email = IOTools.readString("email ");
		meinefreunde1.name =  IOTools.readString("name ");
		meinefreunde1.telefon =  IOTools.readInt("telefon ");
		meinefreunde1.vorname =  IOTools.readString("Ihre Vorname ");
		meinefreunde1 = freunde[0];
		
		System.out.println(meinefreunde1.email);
		System.out.println(meinefreunde1.name);
		System.out.println(meinefreunde1.vorname);
		System.out.println(meinefreunde1.telefon);
		
		// to samy udelat pro kazdou z 5 person s array a pak nechat udelat schiwch case loop abych pri zadani cisla vypsal to danou personnu
		
		
	}

}
