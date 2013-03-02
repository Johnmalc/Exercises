package malcjohn;

public class StringKlasse {
	/**
	  *
	  * Beschreibung
	  *
	  * @version 1.0 vom 16.10.2012
	  * @author malcjohn
	  */

	  public static void main(String[] args) {

	    // lange
	    String geheimCode = "125ADBDXA";
	    int laenge = geheimCode.length();
	    if (laenge == 9) {
	    	System.out.println("Ist richtig");
	    } else {
	    	System.out.println("Ist falsch");
	    }
	    
	    // toUpperCase
	    String buchstaben = "abcs";
	    String grosseBuchstaben = buchstaben.toUpperCase();
	    System.out.println("Es werden die Buchstaben Gross geschrieben: "
	                           + grosseBuchstaben);
	    
	    // replace
	    String target = "abcd";
	    System.out.println("Man hat die Buchstaben geandert. Statt a wird y sein: "
	                             + target.replace('a', 'y'));
	    
	    // substring
	    // Returns a new string that is a substring of this string. The substring 
	    // begins with the character at the specified index and extends
	    // to the end of this string. (pocita od 0)
	    String ma = "abcs";
	    String substring = ma.substring(1); // return bsc
	    System.out.println(substring);
	    
	    //charAt
	    /** 
	     * One good use for charAt is for taking a letter from a string variable
	     * that is typed by a user, and then converting it to
	     * a single char variable.
	     * 
	     * @javadoc  
	     * "the char value at the specified index of this string. The first char value is at index 0"
	     */
	    String na = "hapdyUnPeople";
	    char charAt = na.charAt(2); // p
	    System.out.println(charAt);
	    
	    
	    
  }

}
