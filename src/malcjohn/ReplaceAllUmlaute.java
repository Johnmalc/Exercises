package malcjohn;

/**
  *
  * Beschreibung
  * @version 1.0 vom 23.10.2012
  * @author
  */

public class ReplaceAllUmlaute {

  public static void main(String[] args) {
    String text = new String ("DerÖsihätteüberdieStraßelaufenmüssen.ÜbrigensderösterreichischeBaumhatvieleÄste!");
    String a = "ae";
    String result = text.replaceAll("ä", a);
    String b = "Ae";
    String result1 = text.replaceAll("Ä", b);
    String c = "Oe";
    String result2 = text.replaceAll("Ö", c);
    String d = "oe";
    String result3 = text.replaceAll("ö", d);
    String e = "Ue";
    String result4 = text.replaceAll("ü", e);
    String r = "ue";
    String result5 = text.replaceAll("Ü", r);
    String z = "ss";
    String result6 = text.replaceAll("ß", z);
    System.out.println(result);
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result5);
    System.out.println(result6);
    /**
    * Ä mit Ae und ä mit ae Ö mit Oe und ö mit oe Ü mit Ue und ü mit ue ß mit ss
    */
  }

}
