package com.rays.constructorcalling;

public class A {

	public int id;
	public String name;

	public A(int id) {
		this.id = id;
		System.out.println(id);
	}

	public A(int id, String name) {
		this(id);
		this.name = name;
		System.out.println(id + " " + name);
	}

}
