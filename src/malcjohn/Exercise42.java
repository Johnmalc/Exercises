package malcjohn;

public class Exercise42 {
	public static void baffle(String blimp){
		System.out.println(blimp); // 5
		zippo("ping", -5); // 6
	}
	public static void zippo(String quince, int flag) {
		if (flag < 0) { // 2 
			System.out.println(quince + " zoop");
			} else { // 1
				System.out.println("ik");
				baffle(quince); // 4
				System.out.println("Boo-wa-kinada");
			}
	}
	public static void main(String[] args) {
		zippo("rattle", 13); // 1
	}
}
