package ostatni;
import java.util.*;
import java.util.concurrent.TimeUnit;
/**
 * @author  John Malc
 * @version 
 *
 */
public class MillisecondToDays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Bud takhle 
		/// long millis = 10 * 24*60*60*1000L;
		/// long days  = millis / 86_400_000L;
		/// System.out.println( days );    // 10 
		
		
		// Nebo takhle 
		/// skvela vec http://docs.oracle.com/javase/6/docs/api/java/util/concurrent/TimeUnit.html
		System.out.println("Zadej kolik chces milsec. prevest do dnu");	
		long mil = new Scanner(System.in).nextLong();		
		long days = TimeUnit.MILLISECONDS.toDays(mil);
		System.out.println(days);
     
	}

}
