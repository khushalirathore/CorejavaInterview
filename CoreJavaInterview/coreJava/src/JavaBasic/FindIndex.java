package JavaBasic;

public class FindIndex {

	public static void main(String[] args) {

		int arr[] = { 20, 30, 40, 60, 50, 70, 80 };

		int num = 80;
		int index = -1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == num) {
				index = i;

			}

		}
		System.out.println(index);

	}
}
