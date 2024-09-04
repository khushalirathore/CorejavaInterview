package com.rays.String;

import java.util.Arrays;

public class StringArraysToIntArray {
	public static void main(String[] args) {

		String[] name = { "khushali123456" };
		String result = "";

		for (String s : name) {
			char[] ch = s.toCharArray();

			for (int i = 0; i < s.length(); i++) {
				if (Character.isDigit(ch[i])) {
					result = result + ch[i];
				}
			}
			int[] intArray = new int[result.length()];
			for (int i = 0; i < result.length(); i++) {
				intArray[i] = Character.getNumericValue(result.charAt(i));

			}
			System.out.println(Arrays.toString(intArray));
		}
	}
}
