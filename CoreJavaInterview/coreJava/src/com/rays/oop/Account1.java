package com.rays.oop;

public class Account1 implements Cloneable {

	public int balance = 0;

	public Account1(int balance) {
		this.balance = balance;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

}
