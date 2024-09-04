package JavaBasic;

public class largestNumber {
	public static void main(String[] args) {

		// First Largest
		int[] a = { 56, 89, 41, 32, 52, 879, 41 };
		int b = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > b) {
				b = a[i];

			}

		}
		System.out.println("Largest No is: " + b);
	}

}