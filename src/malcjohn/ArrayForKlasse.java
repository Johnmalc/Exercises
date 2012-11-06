package malcjohn;
import Prog1Tools.IOTools;

public class ArrayForKlasse {
  
  public static class Car {

    public String marke;
    public String model;
    public String zeichen;
    public String bessitzer;
    public int sitzplatze;
    public int jahr;

  }
  
  
  public static void main(String[] args) {
	  
        Car meinedaten[] = new Car[3];
    
        Car meine1 = new Car();
        Car meine2 = new Car();
        Car meine3 = new Car();
        
        
         meine1.marke = "Porsche";
         meine1.model = "Ferrrai";
         meine1.zeichen = "sdifugh";
         meine1.bessitzer = "Du";
         meine1.sitzplatze = 90;
         meine1.jahr = 5;
         meinedaten[0] = meine1;
         
         meine2.marke = "VW";
         meine2.model = "Dodge";
         meine2.zeichen = "sdifugh";
         meine2.bessitzer = "Du";
         meine2.sitzplatze = 910;
         meine2.jahr = 5514;
         meinedaten[1] = meine2;
         
         meine3.marke = "fsdf";
         meine3.model = "Fersdgrrai";
         meine3.zeichen = "sdisdgdsfsdffugh";
         meine3.bessitzer = "Dsdfsdfu";
         meine3.sitzplatze = 9551430;
         meine3.jahr = 5451;
         meinedaten[2] = meine3;
    
         for(int i = 0; i < 5; i++) { // cislo se da menit a tolik krat to vypise
        	 // pokud i tak ukaze posledni protoze to uberschreibbt,
        	 // cislo indexu meni co vypise trikrat 0.1.2
           System.out.println("marke " + meinedaten[1].marke);
           System.out.println("model " + meinedaten[1].model);
           System.out.println("zeichen " + meinedaten[1].zeichen);
           System.out.println("besittzer " + meinedaten[1].bessitzer);
           System.out.println("sitzplatze " + meinedaten[1].sitzplatze);
           System.out.println("jahr " + meinedaten[1].jahr);
        }
    
    
    
    
      // }
  } // end of main

} // end of class Mitarraty
