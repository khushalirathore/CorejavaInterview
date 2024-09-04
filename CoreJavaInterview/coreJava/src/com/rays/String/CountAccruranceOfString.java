package com.rays.String;

public class CountAccruranceOfString {

	public static void main(String[] args) {
		String name = "khushali";

		int count = 0;

		for (char a = 'a'; a <= 'z'; a++) {
			for (int i = 0; i < name.length(); i++) {
				if (a == name.charAt(i)) {

					count++;
				}
			}

			if (count != 0) {

				System.out.println(a + " " + count);

				count = 0;

			}

		}

	}

}