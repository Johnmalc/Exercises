package klausur;

public class Main extends Superklasse{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// nedase udelat object z abstract klasse
		Superklasse cl = new Superklasse();
		System.out.println(cl.getBlbost());
		cl.setDomecek("rot");
		System.out.println(cl.getDomecek());
		System.out.println(cl.toString()); // vypise adresssu
		cl.ko();

		Superklasse[] ar = new Superklasse[5];
		ar[0] = new Subklasse();
		ar[1] = new Subklasse();
		// to samy jako predtim, vypise adressu 2* a pak pouze 3* null
		for (int a = 0; a < ar.length; a++) {
			System.out.println(ar[a]);
		}
	}

}
