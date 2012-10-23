package malcjohn;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 23.10.2012
  * @author    malcjohn
  */

public class UberpruftContains {

  public static void main(String[] args) {
    String text = "WieoftkommtderBuchstabe(kleines)eindiesemkurzenTextvor";
    //String a = text.maches(Buchstabe);
    String a = "Buchstabe";
    if (text.contains(a)) {
      System.out.println("Ja, es kommt vor");
    } else {
    System.out.println("Nein, es kommt nicht vor");
    } // end of if-else
    
    
    
    
    
  } // end of main

} // end of class aufgabe3
