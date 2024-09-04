package com.rays.first;

public class c {

	public static void main(String[] args) {
		// Initialize the string value
		String str = "rahul";

		// Loop through each character of the string, skipping every second character
		for (int i = 0; i < str.length(); i += 2) {
			// Print the character
			System.out.print(str.charAt(i));

			// If it's not the last character to be printed, print a space
			if (i < str.length() - 2) {
				System.out.print(" ");
			}
		}
	}
}