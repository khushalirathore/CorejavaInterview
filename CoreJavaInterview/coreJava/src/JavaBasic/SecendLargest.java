package JavaBasic;

public class SecendLargest {

	public static void main(String[] args) {
		int[] arr = { 30, 20, 100, 50, 60 };

		int secondHighest = 0;

		int highest = 0;

		for (int i = 0; i < arr.length; i++) {

			if (highest < arr[i]) {

				secondHighest = highest;

				highest = arr[i];
			}

			if (arr[i] > secondHighest && arr[i] < highest) {

				secondHighest = arr[i];

			}

		}
		System.out.println("secound largest : " + secondHighest);
	}
}
