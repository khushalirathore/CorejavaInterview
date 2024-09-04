package com.rays.first;

import java.lang.reflect.Constructor;

public class Example11 {
	public void display() {
		System.out.println("Object created using Constructor.newInstance()");
	}

	public static void main(String[] args) {
		try {
			Constructor<Example> constructor = Example.class.getDeclaredConstructor();
			Example example = constructor.newInstance();
			example.display();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}