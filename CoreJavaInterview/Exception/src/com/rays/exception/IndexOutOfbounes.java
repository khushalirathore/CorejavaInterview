package com.rays.exception;

public class IndexOutOfbounes {
	public static void main(String[] args) {
		
	
	String name = "java";
	
	try {
		System.out.println(name.charAt(5));
	} catch (IndexOutOfBoundsException e) {
		// TODO: handle exception
		e.printStackTrace();
	}

}
}