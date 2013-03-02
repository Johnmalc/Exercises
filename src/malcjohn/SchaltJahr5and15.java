package malcjohn;

public class SchaltJahr5and15 {

	public static void main(String[] args) {
		// via wikipedia  - leap year. Thanks to pseudocode
		int jahr = 1993;
		
		if (jahr % 400 == 0) {
			System.out.print("Meine Geburstjahr " + jahr + " ist Schaltjahr");
		}else if (jahr % 100 == 0) {
			System.out.print("Meine Geburstjahr " + jahr + " ist kein Schaltjahr");
		}else if (jahr % 4 ==0) {
			System.out.print("Meine Geburstjahr " + jahr + " ist Schaltjahr");
		} else {
			System.out.print("Meine Geburstjahr " + jahr + " ist kein Schaltjahr");
		}
		
		
		for (int i= 1900; i<2012 ; i++) {
			System.out.println(i);
			if (i % 400 == 0) {
				System.out.print("Meine Geburstjahr " + i + " ist Schaltjahr");
			}
			if (i % 4 ==0) {
				System.out.print("Meine Geburstjahr " + i + " ist Schaltjahr");
			}
		}
		
		
		
	}

}
