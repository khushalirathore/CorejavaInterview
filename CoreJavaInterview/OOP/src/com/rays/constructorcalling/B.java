package com.rays.constructorcalling;

public class B extends A {
	public B(int id, String name) {
		super(id, name);
	}
	
	public static void main(String[] args) {
		B b=new B(10, "XYZ");
	}

}
