package com.rays.oop;

public class ConstCalling {

//	public int a;
//	public int b;

	public ConstCalling() {
		System.out.println("I am defoult const");
	}

	public ConstCalling(int a) {
		this();
		// this.a = a;
		System.out.println("I am param const");
	}

	public ConstCalling(int a, int b) {
		this(a);
		// this.b = b;
		System.out.println("I am 1 param const");

	}

	public static void main(String[] args) {
		// ConstCalling c = new ConstCalling();
		ConstCalling s = new ConstCalling(10, 20);
	}

}
