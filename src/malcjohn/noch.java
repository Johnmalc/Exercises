package malcjohn;

public class noch {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 8 };
		foo(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	public static void foo(int[] array) {
		array[0] = 4;
		array[1] = 5;
		array[2] = 6;
	}

	// Scanner scan = new Scanner(System.in);
	//
	// System.out.println("Size");
	// int yourNumbers = scan.nextInt();
	// double[] array = new double[yourNumbers];
	//
	// System.out.println("Numbers");
	//
	// for(int i = 0; i < array.length; i++) {
	// System.out.println(array[i]);
	// array[i] = scan.nextDouble();
	// }
	//
	// Sort2(array);
	//
	// }
	// public static void Sort2(double[] yourNumbers) {
	// double swap;
	// for(int i = 0; i < yourNumbers.length - 1; i++){
	// for(int d = i + 1; d < yourNumbers.length; d++){
	// if(yourNumbers[i] > yourNumbers[d]){
	// //swap feature
	// swap = yourNumbers[i];
	// yourNumbers[i] = yourNumbers[d];
	// yourNumbers[d] = swap;
	//
	// }
	// }
	// }

}