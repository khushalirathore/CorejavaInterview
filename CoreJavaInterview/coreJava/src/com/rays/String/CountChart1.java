package com.rays.String;

public class CountChart1 {

	public static void main(String[] args) {
		String str = "khushali";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'h') {
				count++;

			}

		}
		System.out.println("h :" + count);
	}

}
