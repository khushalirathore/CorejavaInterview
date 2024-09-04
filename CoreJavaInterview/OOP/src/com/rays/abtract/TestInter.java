package com.rays.abtract;

public class TestInter implements Inter {
	public int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		TestInter t = new TestInter();

		System.out.println(t.sum(10, 20));
	}
}
