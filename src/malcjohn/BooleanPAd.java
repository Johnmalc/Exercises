package malcjohn;

public class BooleanPAd {
	public static void main(String[] args) {
		
		boolean doIneedUmbrella; 
		doIneedUmbrella = true;
		
		boolean wind;
		boolean luftf;
		
		luftf = true;
		wind = true;
		
		
		if (wind || luftf == true) { // || yes because of Booleanische Algebra
			System.out.println(!doIneedUmbrella); // ! not || or
		}
		
		
		boolean bigFlat = !doIneedUmbrreerell(51);
		System.out.println(bigFlat);
		System.out.println(doIneedUmbrreerell(154));
		
		if (doIneedUmbrreerell(5)) { // x neni cislo, musi byt cislo
			System.out.println("skdj");
		}else {
			System.out.println("sdsdfsd");
		}
		
				
}
	public static boolean doIneedUmbrreerell(int x) {
		return (x >= 0 && x < 10);	
	}
}
