package JavaBasic;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int originalNumber = 153;
		int sumOfCubes = 0;
		int tempNumber = originalNumber;
		int rem = 0;

		while (tempNumber != 0) {

			rem = tempNumber % 10;
			sumOfCubes += rem * rem * rem;
			tempNumber /= 10;

		}

		if (sumOfCubes == originalNumber) {

			System.out.println("Armstrong Number");

		} else {
			System.out.println("Not an Armstrong Number");
		}

	}

}
