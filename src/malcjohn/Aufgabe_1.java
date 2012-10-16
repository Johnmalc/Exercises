package malcjohn;

public class Aufgabe_1 {
	public static void main(String[] args) {
		/**
		 * @Licence MIT
		 * @author malcjohn 
		 * @for Mr. Seicher at HSR
		 * 
		 * Because the integer/(data type) overflows. When it overflows, 
		 * the next value is Integer.MIN_VALUE.
		 * If an integer(data types) addition overflows, then the result is the low-order 
		 * bits of the mathematical sum as represented in some sufficiently 
		 * large two's-complement format. If overflow occurs, 
		 * then the sign of the result is not the same as the sign
		 *  of the mathematical sum of the two operand values.
		 */
		
		
		System.out.println(Integer.MAX_VALUE); //      2147483647
		System.out.println(Integer.MAX_VALUE + 1); // -2147483648
		System.out.println(Integer.MIN_VALUE); //     -2147483648
		System.out.println(Integer.MIN_VALUE + 1); // -2147483647
		System.out.println(Integer.MIN_VALUE - 1); //  2147483647
		
		System.out.println();
		
		System.out.println(Short.MAX_VALUE); //      32767
		System.out.println(Short.MAX_VALUE + 1 ); // 32768
		System.out.println(Short.MIN_VALUE); // 	-32768
		System.out.println(Short.MIN_VALUE + 1 ); //-32767
		System.out.println(Short.MIN_VALUE - 1 ); //-32769
		
		System.out.println();

		
		System.out.println(Byte.MAX_VALUE);		// 127
		System.out.println(Byte.MAX_VALUE + 1);	// 128
		System.out.println(Byte.MIN_VALUE - 1); //-129 
		System.out.println(Byte.MIN_VALUE);		//-128
		System.out.println(Byte.MIN_VALUE + 1); //-127
		
		System.out.println();
		
		System.out.println(Long.MAX_VALUE);    //  9223372036854775807
		System.out.println(Long.MAX_VALUE + 1);// -9223372036854775808
		System.out.println(Long.MIN_VALUE);    // -9223372036854775808
		System.out.println(Long.MIN_VALUE + 1);// -9223372036854775807
		System.out.println(Long.MIN_VALUE - 1);//  9223372036854775807

		System.out.println(Float.MAX_VALUE * 10); // unEndlich
		
		System.out.println(Double.MAX_VALUE * 10); // unEndlich
		
		System.out.println(1 / 10); // standart wird int
		System.out.println(2 / 10); // um richtig haben : 2.0
		System.out.println(3 / 10); // so wird 0
		System.out.println(4 / 10);
		
	}

}
