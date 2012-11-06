package malcjohn;
public class ArrayMitKlasse {
  
  public static class Car {

    public String marke;
    public String model;
    public String zeichen;
    public String bessitzer;
    public int sitzplatze;
    public int jahr;
    
  }

  
  public static void main(String[] args) {

    Car meinedaten;
    meinedaten = new Car(); // zugriff
    meinedaten.marke = "Ferrrai";
    meinedaten.model = "CAlifornia";
    meinedaten.zeichen = "Noob";
    meinedaten.bessitzer = "Ich";
    meinedaten.sitzplatze = 6;
    meinedaten.jahr = 2009;

    System.out.println("marke" + meinedaten.marke);
    System.out.println("modell" + meinedaten.model);
    System.out.println("zeichen" + meinedaten.zeichen);
    System.out.println("besitzer" + meinedaten.bessitzer);
    System.out.println("sitzpaltze" + meinedaten.sitzplatze);
    System.out.println("jahr" + meinedaten.jahr);

  } // end of main

} // end of class Da
