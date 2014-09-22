/** Diese Klasse simuliert einen Studenten */
package malcjohn;

public class Student {
	/** Der Name des Studenten */
	private String name;

	/** Die Matrikelnummer des Studenten */
	private int nummer;

	/** Gib den Namen des Studenten als String zurueck */
	public String getName() {
		return this.name;
	}

	/**
	 * Setze den Namen des Studenten auf einen bestimmten Wert
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** Gib die Matrikelnummer des Studenten als Integer zurueck */
	public int getNummer() {
		return nummer;
	}

	/**
	 * Setze die Matrikelnummer des Studenten auf einen bestimmten Wert
	 */
	public void setNummer(int n) {
		nummer = n;
	}

}
