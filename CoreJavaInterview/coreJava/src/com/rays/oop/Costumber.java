package com.rays.oop;

public class Costumber implements Cloneable {

	public String name = null;
	public Account1 account1 = null;

	public Costumber(String name) {
		this.name = name;
		this.account1 = new Account1(100);

	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Costumber c = (Costumber) super.clone();
		c.account1 = (Account1) account1.clone();
		return c;
	}

}
