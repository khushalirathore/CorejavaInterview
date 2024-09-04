package JavaBasic;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
//		Random r = new Random();
//		for (int i = 0; i<5; i++) {
//			int random = r.nextInt(10);
//			System.out.print(random);
//		}
//			

		for (int i = 1; i < 5; i++) {

			System.out.println((int) (Math.random() * 10000));

		}
	}

}
