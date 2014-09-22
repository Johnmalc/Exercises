package vier;
/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 02.05.2008
  * @author
  */

public class Main_8_2_4
{
  public static void main(String[] args)
  {
         Student test = new Student();
         Student st2 = new Student();
         test.setName("otto");
         test.setNummer(12345);
         st2.setName("anna");
         st2.setNummer(123456);
         System.out.println(test.toString());
         System.out.println(st2);
  }
}
