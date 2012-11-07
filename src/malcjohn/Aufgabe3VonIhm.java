import Prog1Tools.IOTools;

public class Aufg3
{
  public static void main (String[] args) 
  {  
    int len;
    //double[] ar = {3.1,0.7,-2,0,999.99,-3.1,2.2,3.1};
    //len = ar.length;
    
    do
    {
      len = IOTools.readInteger("wieviele Werte? ");
      if (len<1) System.out.println("Anzahl muss >0 sein!");
    }
    while  (len<1);
    double[] ar = new double[len];
    for (int i=0; i<len; i++)
      ar[i] = IOTools.readDouble((i+1) + ": ");
    
    int jmax;
    double zw; 

    for (int i=0; i<ar.length; i++)
      System.out.print(ar[i]+ " "); 
    System.out.println(); 
    
    for (int i=0; i<ar.length-1; i++)  
    {
      zw = ar[i]; 
      jmax = i;
      for (int j=i+1; j<ar.length; j++)
      {
        if (ar[j] < zw)    // Index merken
        {
          zw = ar[j];
          jmax = j;
        }
      }
      if (jmax > i) // nicht nötig, spart nur etwas Arbeit  (kein Tausch i mit i)
      {
        System.out.print("swap " + i + ": " + ar[i]);
        System.out.println("\t" + jmax + ": " + ar[jmax]);
        ar[jmax] = ar[i];
        ar[i] = zw;       // von oben
        for (int k=0; k<ar.length; k++)
          System.out.print(ar[k]+ " ");
        System.out.println();
      }
    }  // for i
    
    // Ergebnis
    for (int i=0; i<ar.length; i++)
      System.out.print(ar[i]+ " "); 
    System.out.println();
    System.out.println(ar); // liefert Adresse (nur Demo)
   
    for (double x : ar)    // verkürzte Schreibweise ab 1.5
      System.out.print(x + " ");
    System.out.println();

    
  }
}
