package klausur;

import java.util.Arrays;

public class WorteAlpha{

	public static void main(String[] args) {
		String [] wort = new String[3];
		wort[0] = "sdfyyyyyyyyy";
		wort[1] = "sdf";
		wort[2] = "sdfd";
		// abecedne i dle delky znaku
		Arrays.sort(wort);
		
		for (int i = 0; i<wort.length;i++){
			System.out.println(wort[i]);
		}

	}
}
