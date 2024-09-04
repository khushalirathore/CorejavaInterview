package com.rays.String;

public class BasicString {
	
	public static void main(String[] args) {
			String str = "khushali";
//		
////		int len = str.length();
////		System.out.println(len);
//		
//		System.out.println(str.length());
		
		
//		for (char i='A'; i<='Z'; i++) {
//			System.out.print(i);
//		}
			
			
			for(int i=0; i<str.length();i++) {
				for (int j =i+1 ; j<str.length(); j++) {
				System.out.println(str.substring(i,j));
				}
			}
	}
	
	

}


	



