package val3;
/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 02.05.2008
  * @author
  */

public class Student_8_2_3_main {

  public static void main(String[] args)
  {
         Student test = new Student();
         Student st2 = new Student();
         test.setName("otto");
         test.setNummer(12345);
         st2.setName("anna");
         st2.setNummer(123456);
         System.out.println(test.getName() + "; " + test.getNummer());
         System.out.println(st2.getName() + "; " + st2.getNummer());
         System.out.println(st2);
  }
}
