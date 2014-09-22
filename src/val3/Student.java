/** Diese Klasse simuliert einen Studenten */
package val3;

public class Student
{

  /** Der Name des Studenten */
  private String name;

  /** Die Matrikelnummer des Studenten */
  private int nummer;

  /** Gib den Namen des Studenten als String zurueck */
  public String getName() {
    return this.name;
  }

  /** Setze den Namen des Studenten auf einen bestimmten Wert */
  public void setName(String name) {
    this.name = name;
  }

  /** Gib die Matrikelnummer des Studenten als Integer zurueck */
  public int getNummer() {
    return nummer;
  }

  /** Setze die Matrikelnummer des Studenten auf einen best. Wert */
  public void setNummer(int n)
  {
    int alteNummer = this.nummer;
    this.nummer = n;
    if (!validateNummer())
    { // neue Nummer ist nicht gueltig
      this.nummer = alteNummer;
    }
  }

  /** Pruefe die Matrikelnummer des Studenten
      auf ihre Gueltigkeit */
  public boolean validateNummer()
  {
    return
      (((this.nummer >= 10000) && (nummer <= 99999)) && (nummer % 2 == 1));
  }
  
}
  
