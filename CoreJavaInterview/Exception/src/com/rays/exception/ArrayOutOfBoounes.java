package com.rays.exception;

public class ArrayOutOfBoounes {
	public static void main(String[] args) {
	
	String[] name = {"khushali"};
	
	try {
		System.out.println(name[12]);
	}catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
	}
}
