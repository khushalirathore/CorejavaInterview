package com.rays.String;

public class CountNotAccuranceOfString {
	public static void main(String[] args) {

		String name = "khushali rathore";
		int count = 0;

		for (char a = 'a'; a <= 'z'; a++) {
			for (int i = 0; i < name.length(); i++) {
				if (a == name.charAt(i)) {
					count++;
				}
			}

			if (count == 0) {

				System.out.println(a);

			} else {
				count = 0;
			}

		}

	}

}