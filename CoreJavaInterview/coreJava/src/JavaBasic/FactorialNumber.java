package JavaBasic;

public class FactorialNumber {

	public static void main(String[] args) {

		int fact = 1;
		int num = 7;

		for (int i = num; i > 0; i--) {
//			System.out.println(i + " i ");
//			System.out.println(fact + " fact1");

			fact = fact * i;
			// System.out.println(fact + " fact2");

		}

		System.out.println(fact);

	}

}
