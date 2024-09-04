  package com.rays.thread;

public class IsAlive extends Thread {

	@Override
	public void run() {
		System.out.println("Method is alive........");
	}

	public static void main(String[] args) {

		IsAlive t1 = new IsAlive();
		IsAlive t2 = new IsAlive();

//		System.out.println(t1.isAlive());
//		System.out.println(">>>>>>>>>>>>>>>>>>");

		t1.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(">>>>>>>>>>>>>>>>>>>");

		t2.start();
		System.out.println(t2.isAlive());
	}
}