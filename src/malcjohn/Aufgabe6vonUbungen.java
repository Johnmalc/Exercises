package malcjohn;

import Prog1Tools.IOTools;
import java.util.Scanner;

public class Aufgabe6vonUbungen {

	public static class Personen {
		String vorname;
		String name;
		String email;
		int telefon;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Personen[] freunde = new Personen[5];

		System.out.println("freund 1");

		freunde[0] = new Personen();
		freunde[0].telefon = scan.nextInt();
		freunde[0].email = scan.nextLine();
		freunde[0].name = scan.nextLine();
		freunde[0].vorname = scan.nextLine();

		// Vypise prvniho cloveka

		System.out.println("freund 2");

		freunde[1] = new Personen();
		freunde[1].email = scan.nextLine();
		freunde[1].name = scan.nextLine();
		freunde[1].telefon = IOTools.readInt("telefon ");
		freunde[1].vorname = scan.nextLine();

		// vypise dalisho cloveka
		freunde[2] = new Personen();
		System.out.println("freund 3");
		freunde[2].email = scan.nextLine();
		freunde[2].name = scan.nextLine();
		freunde[2].telefon = IOTools.readInt("telefon ");
		freunde[2].vorname = scan.nextLine();

		// vypise 3 cloveka

		System.out.println("freund 4");
		freunde[3] = new Personen();
		freunde[3].email = scan.nextLine();
		freunde[3].name = scan.nextLine();
		freunde[3].telefon = IOTools.readInt("telefon ");
		freunde[3].vorname = scan.nextLine();

		System.out.println("freund 5");
		freunde[4] = new Personen();
		freunde[4].email = scan.nextLine();
		freunde[4].name = scan.nextLine();
		freunde[4].telefon = IOTools.readInt("telefon ");
		freunde[4].vorname = scan.nextLine();

		for (int i = 0; i < 5; i++) {
			// vypise petkrat co jsem zadal
			System.out.println(freunde[i].email);
			System.out.println(freunde[i].name);
			System.out.println(freunde[i].vorname);
			System.out.println(freunde[i].telefon);

		}
		scan.close();
	}

}
