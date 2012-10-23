package malcjohn;
/**
  *
  * Beschreibung  Aufgabe 1
  *
  * @version 1.0 vom 23.10.2012
  * @author malcjohn
  */

public class QuadratOhneMitSchleife {

  public static void ohneSchleife() {
    // sehr klug gelost; von V.E
    int a = 1;
    System.out.println(a*a);
    ++a;
    System.out.println(a*a);
    ++a;
    System.out.println(a*a);
    ++a;
    System.out.println(a*a);
    a++;
    System.out.println(a*a);
    a++;
    System.out.println(a*a);
    a++;
    System.out.println(a*a);
    // etc.....
    System.out.println();

    int zahl1 = 1;
    int zahl2 = 2;
    int zahl3 = 3;
    int zahl4 = 4;
    int zahl5 = 5;
    int zahl6 = 6;
    int zahl7 = 7;
    int zahl8 = 8;
    int zahl9 = 9;
    int zahl10 = 10;
    int zahl11 = 11;
    int zahl12 = 12;
    int zahl13 = 13;
    int zahl14 = 14;
    int zahl15 = 15;
    int zahl16 = 16;
    int zahl17 = 17;
    int zahl18 = 18;
    int zahl19 = 19;
    int zahl20 = 20;
    
    int antwort = zahl1 * zahl1;
    int antwort2 = zahl2 * zahl2;
    int antwort3 = zahl3 * zahl3;
    int antwort4 = zahl4 * zahl4;
    int antwort5 = zahl5 * zahl5;
    int antwort6 = zahl6 * zahl6;
    int antwort7 = zahl7 * zahl7;
    int antwort8 = zahl8 * zahl8;
    int antwort9 = zahl9 * zahl9;
    int antwort10 = zahl10 * zahl10;
    int antwort11 = zahl11 * zahl11;
    int antwort12 = zahl12 * zahl12;
    int antwort13 = zahl13 * zahl13;
    int antwort14 = zahl14 * zahl14;
    int antwort15 = zahl15 * zahl15;
    int antwort16 = zahl16 * zahl16;
    int antwort17 = zahl17 * zahl17;
    int antwort18 = zahl18 * zahl18;
    int antwort19 = zahl19 * zahl19;
    int antwort20 = zahl20 * zahl20;

    System.out.println(antwort);
    System.out.println(antwort2);
    System.out.println(antwort3);
    System.out.println(antwort4);
    System.out.println(antwort5);
    System.out.println(antwort6);
    System.out.println(antwort7);
    System.out.println(antwort8);
    System.out.println(antwort9);
    System.out.println(antwort10);
    System.out.println(antwort11);
    System.out.println(antwort12);
    System.out.println(antwort13);
    System.out.println(antwort14);
    System.out.println(antwort15);
    System.out.println(antwort16);
    System.out.println(antwort17);
    System.out.println(antwort18);
    System.out.println(antwort19);
    System.out.println(antwort20); // 400    
  }
  public static void mitSchleife() {
	  
	  for (int i = 1; i <= 20; i++) {
		  System.out.println(i*i);
	  }
  }
  public static void main(String[] args) {
	  ohneSchleife(); // egal was
	  mitSchleife();
  }
} 
