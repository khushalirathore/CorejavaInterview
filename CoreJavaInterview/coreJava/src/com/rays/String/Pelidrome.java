package com.rays.String;

public class Pelidrome {
	
	public static void main(String[] args) {
		
		
		
		int n = 121, rev = 0, rem = 0, org = n;
		while (n > 0) {

			rem = n % 10;
			System.out.println(rem);

			rev = rem + rev * 10;
			System.out.println(rev);

			n = n / 10;
			System.out.println(n);

		}
		if (rev == org) {
			System.out.println("pallindrome");

		} else {
			System.out.println("not pallindrome");

		}
	}

}
//		String str = "level";
//		boolean flage = true;
//		String name = str.toLowerCase();
//
//		for (int i = 0; i < name.length() / 2; i++) {
//			if (name.charAt(i) != name.charAt(name.length() - i - 1)) {
//				flage = false ;
//			} else {
//				flage = true;
//			}
//		}
//		System.out.println("palindrom = " + flage);
//
//	}
//
//}
