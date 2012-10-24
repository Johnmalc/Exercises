package malcjohn;

/**
  * Beschreibung
  *
  * @version 1.0 vom 23.10.2012
  * @author malcjohn
  */

public class BuchstabeAufzahlung {

  public static void main(String[] args) {
    String text = "DerBuchstabeekommtgenauemalvor";
    int anzahl = 0;
    for (int i = 0; i <text.length(); i++ ) {
       String a  = text.substring(i, i+1);
       if (a.equals("e")) {
         anzahl++;
       } 

      // System.out.println("test");
    } 
    System.out.println("Der Buchstabe e kommt genaue " + anzahl + " mal vor.");
  } 

} 
