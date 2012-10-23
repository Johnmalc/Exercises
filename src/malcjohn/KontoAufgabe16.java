package malcjohn;

/**
  * Beschreibung
  *
  * @version 1.0 vom 23.10.2012
  * @author
  */

public class KontoAufgabe16 {

  public static void main(String[] args) {
    double startguthaben = 1250.54;
    int age = 10;
    double rate = 0.34;
    double nachJahr = startguthaben;
    System.out.println("Das Startguthaben in Euro betraegt:" + startguthaben);
    System.out.println("----------------");
    
    for (int i=0; i<age; i++ ) {
      System.out.println( rate * startguthaben);
      System.out.println("");
    } // end of for
    
    System.out.println(rate*10);
    
         double Einzahlung=1250.54;
         double Zinssatz=1.34; //<-0.04!!!!
         double Endbetrag=Einzahlung;
         for (int i=1; i<4;i++){
         Endbetrag =  Einzahlung * Zinssatz;
         System.out.println("Jahr: " + i + " -> " + Endbetrag);
         }
    
    
    double nach1jahr = (startguthaben * rate*1 * 1) / (12*100);
//    double nach1jahr2 = startguthaben * rate*1 * 1;
//    double nach1jahr3 = startguthaben * rate*1 * 1;
//    double nach1jahr4 = startguthaben * rate*1 * 4;
//    double nach1jahr5 = startguthaben * rate*1 * 5;
//    double nach1jahr6 = startguthaben * rate*1 * 6;
//    double nach1jahr7 = startguthaben * rate*1 * 7;
    
    System.out.println("Das Guthaben nach 1 Jahr betraegt:" + nach1jahr);
//    System.out.println("Das Guthaben nach 1 Jahr betraegt:" + nach1jahr2);
//    System.out.println("Das Guthaben nach 1 Jahr betraegt:" + nach1jahr3);
//    System.out.println("Das Guthaben nach 1 Jahr betraegt:" + nach1jahr4);
//    System.out.println("Das Guthaben nach 1 Jahr betraegt:" + nach1jahr5);
//    System.out.println("Das Guthaben nach 1 Jahr betraegt:" + nach1jahr6);
//    System.out.println("Das Guthaben nach 1 Jahr betraegt:" + nach1jahr7);
    
    
    
    
    System.out.println("----------------");
    double Dynamic = startguthaben * age * rate / (12*100); /// MONTHS= 12*100 DAYS =[365*100]
    System.out.println("Zinsen nach 10 Jahren: " + Dynamic);
  } // end of main

} // end of class aufgabe16
