package com.rays.String;

public class ExtractVowels {

	public static void main(String[] args) {
		String name = "khushali ";
		String name1 = name.toLowerCase();
		int count = 0;

		for (int i = 0; i < name.length(); i++) {
			char c   = name.charAt(i);
			
			
			if (c=='a'|| c=='e'||c=='o'||c=='u') {
				count++;
			}
			if ("khushali".indexOf(c) != -1) {
				System.out.print(c);
			}
		}
		System.out.print(" No of Vowels :" + count);

	}
}