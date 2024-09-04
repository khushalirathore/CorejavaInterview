package com.rays.Constructore;

public class ConstructorOverloadings {

	public int id;
	public String name;
	public String add;

	public ConstructorOverloadings() {
		System.out.println("this is defoult ");
	}

	public ConstructorOverloadings(int id) {
		this();
		this.id = id;
		System.out.println( id + "  this is 1 param ");
	}

	public ConstructorOverloadings(int id, String name) {
		this(id);
		this.name = name;
		System.out.println( id + " "+ name +" = this is 2 param ");
	}

	public static void main(String[] args) {
		ConstructorOverloadings c = new ConstructorOverloadings(1, "sdfghj");
	}

}