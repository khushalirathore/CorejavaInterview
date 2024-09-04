package com.rays.DeepCloning;

public class Costumber implements Cloneable {

	public String name = null;
	public Account1 account1 = null;

	public Costumber(String name, Account1 account1) {
		this.name = name;
		this.account1 = account1;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Costumber c = (Costumber) super.clone();
		c.account1 = (Account1) account1.clone();
		return c;
	}

}
