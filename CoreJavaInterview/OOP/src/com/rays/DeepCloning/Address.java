package com.rays.DeepCloning;

public class Address implements Cloneable {
	public String city;
	public String state;

	public Address(String city, String state) {
		this.city = city;
		this.state = state;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
