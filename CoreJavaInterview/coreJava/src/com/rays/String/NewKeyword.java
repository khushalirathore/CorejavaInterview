package com.rays.String;

public class NewKeyword {

	public static void main(String[] args) {

		// String str = new String();
		String str1 = "Hello";
		// String str2 = "Hello";

		String str2 = new String("Hello");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));

//		if (str1 == str2) {
//			System.out.println(str1 + "" + str2 + " are the same object.");
//		} else {
//			System.out.println(str1 + "" + str2 + " are different objects.");
//		}
//
//		if (str1.equals(str2)) {
//			System.out.println("str1 and str2 have the same value.");
//		} else {
//			System.out.println("str1 and str2 have different values.");
//		}
	}
}
