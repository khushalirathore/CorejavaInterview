package com.rays.String;

public class CharcterCount {

	public static void main(String[] args) {
		String[] name = { "abc", "cdf" };
		int[] Count = new int[256]; // zzzASCII characters

		for (String s : name) {
			for (char ch : s.toCharArray()) {
				Count[ch]++;
			}
		}

		for (int i = 0; i < Count.length; i++) {
			if (Count[i] > 0) {
				System.out.println((char) i + ": " + Count[i]);
			}
		}
	}
}
