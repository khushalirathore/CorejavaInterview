package JavaBasic;

public class forLoop {

	public static void main(String[] args) {

		int i;
		int sum = 0;

		for (i = 100; i <= 200; i++) {

			if (i % 7 == 0) {
				sum = sum + i;
				System.out.println("i = " + i);
				System.out.println("sum = " + sum);
			}

		}
		System.out.println("sum  = " + sum);

	}

}
