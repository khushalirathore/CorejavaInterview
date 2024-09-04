package JavaBasic;

public class findIndexWithMethodCalling {

	public static int findIndex(int[] arr, int num) {
		int temp = -1;

		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				// temp = arr[i];
				temp = i;
				// break;
			}
		}

		return temp;
	}

	public static void main(String[] args) {

		int[] arr = { 18, 17, 16, 14, 5, 6, 7, 8 };
		int num = 1;

		int index = findIndex(arr, num);

		System.out.println(index);
	}
}