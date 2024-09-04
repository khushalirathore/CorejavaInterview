package com.rays.thread;

public class TestThread extends Thread {

	private String name;

	public TestThread(String name) {

		this.name = name;
	}

	@Override
	public void run() {

		for (int i = 0; i < 3; i++) {

			System.out.println(i + " " + name);

		}
	}

	public static void main(String[] args) {

		TestThread t1 = new TestThread("khushali");
		TestThread t2 = new TestThread("paras");

		t1.start();
		t2.start();

	}

}