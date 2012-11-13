package malcjohn;

public class ArrayWerteTauschen {

	/**
	 * @param args
	 */
	private static int[] intArr = { 5, 24, 18, 76 };

    public boolean tauschIndex(int l, int r) {

        if (l < 0 || l >= intArr.length) {
            System.err.println("Ausgangsindex zu hoch oder zu niedrig!");
            return false;
        }
        if (r < 0 || r >= intArr.length) {
            System.err.println("Zielindex zu hoch oder zu niedrig!");
            return false;
        }

        int k = intArr[l];
        intArr[l] = intArr[r];
        intArr[r] = k;
        return true;
    }

    public static void main(String[] args) {
    	ArrayWerteTauschen wt = new ArrayWerteTauschen();
        System.out.println("vorher:");
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
        // es werden alle auser diesen beiden getasucht , von 0 genommen
        if (wt.tauschIndex(1, 2)) {
            System.out.println("\nnachher:");
            for (int i = 0; i < intArr.length; i++) {
                System.out.println(intArr[i]);
            }
        }
    }
}