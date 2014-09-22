/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 02.05.2008
  * @author
  */
package malcjohn;

public class Main_8_2_2
{
  public static void main(String[] args)
  {
         Student test = new Student();
         Student st2 = new Student();
         test.setName("otto");
         test.setNummer(12345);
         st2.setName("anna");
         st2.setNummer(123456);
         //int i = st2.nummer;
         System.out.println(test.getName() + "; " + test.getNummer());
         System.out.println(st2.getName() + "; " + st2.getNummer());
         System.out.println(test);
  }
}
