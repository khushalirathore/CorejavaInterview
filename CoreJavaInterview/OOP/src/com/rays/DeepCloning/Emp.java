package com.rays.DeepCloning;

public class Emp implements Cloneable {
	public String name;
	public Address add;

	public Emp(String name, Address add) {
		this.name = name;
		this.add = add;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Emp e = (Emp) super.clone();
		//e.add = (Address) add.clone();
		return e;
	}

}