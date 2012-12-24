package malcjohn;

import java.util.Arrays;

/**
 * @author malcjohn
 * 
 *         Array vergrossern und verkleinern
 * 
 */
public class ArrayVerkleinernVergrossern {

	public static void main(String[] args) {
		int[] bigger = { 5, 64, 897, 1, 6854, 897, 231, 564 };
		int[] neu = new int[8];
		System.out.println(Arrays.toString(bigger));

		// nur vegrossern
		int bigger2[] = new int[bigger.length + 1];
		System.arraycopy(bigger, 0, bigger2, 0, bigger.length);
		System.out.println(Arrays.toString(bigger2));

		// nur verkkleinern
		// prosterdni cislo urcuje kolik cisel z leva nebude zkopirovano do
		// noveho []
		// pokud length-1 tak i posledni cislo nebude zkopirovano do noveho []
		int smaller[] = Arrays.copyOfRange(bigger, 3, bigger.length);
		System.out.println(Arrays.toString(smaller));

		System.out.println("\n");

		// array umdrehen
		int[] array = new int[bigger.length];
        for(int i = 0, j = bigger.length-1; i < bigger.length; i++, j--){
            array[i] = bigger[j];
        }
		System.out.println(Arrays.toString(array));

	}
}
