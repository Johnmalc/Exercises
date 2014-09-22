package od_ucitele;
/*
 * 
 * Chybi main, nedase spustit
 * 
 * 
 */

public class Bruch
{
  protected long zlr;  // Zaeler long, da die Zahlen schnell gross werden
  private long nen;   // Nenner  
  private int vz;     // Vorzeichen
  
  public Bruch ()
  {
    zlr = 0;
    nen = 1;
    vz = 1; 
  }
  
  public void setZlr (int z)  // Zaehler wird uebergeben
  {
    vz = z>0?vz:-vz;          //Vorzeichenwechsel
    this.zlr = z * vz;
  }
  
  public void setNen(int n)      // Schnittstellenfunktionen (Setter-Nenner)
  {
    if (n==0) 
    {
      System.out.println("Nenner 0!");
      nen = 1;
    } 
    else 
    {
      vz = n>0?vz:-vz;         // ?- Elvis Ausdruck (if-else)
      this.nen = Math.abs(n);  //abs-Absolutwert
    } 
  }
  
  public static Bruch mul(Bruch b1, Bruch b2)  //mul (multiplizieren) static- Instanzmethode
  {
    Bruch erg = new Bruch();
    erg.zlr = b1.zlr * b2.zlr;   //
    erg.nen = b1.nen * b2.nen;
    erg.kuerzen();               // Methode "kuerzen"
    erg.vz = b1.vz * b2.vz;
    return erg;
  }
  
  public void mul2(Bruch b1, Bruch b2)
  {
    this.zlr = b1.zlr * b2.zlr;
    nen = b1.nen * b2.nen;         //ohne this geht auch
    kuerzen();
    this.vz = b1.vz * b2.vz;
    // kein return, da Ergebnis in Instanzvariable
  }
  
  public Bruch mul3(Bruch arg)
  {
    Bruch erg = new Bruch();
    erg.zlr = this.zlr * arg.zlr;
    erg.nen = nen * arg.vz;
    erg.kuerzen();
    erg.vz = vz * arg.vz;
    return erg;
  }
  
  public String toString()
  {
    return "(" + ((vz==1)?"":"-") + zlr + " / " + nen + ")"; //Vorzeichen identisch 1, wenn nicht (-)
  }
  
  public double wert ()
  {
    return vz * zlr / (double) nen; // ()- Typecast
  }
  public void kuerzen ()
   {
    long a = zlr>0?zlr:-zlr;
    long b = nen>0?nen:-nen;
    this.vz = vz * (int)(zlr/a) * (int)(nen/b);
    zlr = a; nen = b; // beide positiv
    while (a>0 && b>0 ) 
    { 
      if (a>b) 
         a = a % b;
      else
         b = b % a;
      //System.out.println(a + " " + b);       
      } 
    
    a +=b; // a = a + b;
    zlr /= a;
    nen /= a;
}
}
  
    
    
    
   
    
  