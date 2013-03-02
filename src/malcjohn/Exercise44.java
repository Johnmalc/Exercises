package malcjohn;

public class Exercise44 {
	public static void zoop(String fred, int bob) {
		System.out.println(fred);
		if (bob == 5) {
			ping("not ");
		} else {
			System.out.println("!");
		}
	}
	public static void ping(String strangStrung) {
		System.out.println("any " + strangStrung + "more ");
		
	}
	public static void clink(int fork) {
		System.out.println("It's ");
		zoop("breakfast ", fork); 
	}
	public static void main(String[] args) {
		int buzz = 2;
		int bizz = 5;
		zoop("just for", bizz);
		clink(2*buzz);
	}
}
