package com.rays.thread;

public class PriorityThread extends Thread {

	String name = null;

	public PriorityThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " = " + name);
		}
	}

	public static void main(String[] args) {

		PriorityThread t1 = new PriorityThread("abc");

		PriorityThread t2 = new PriorityThread("xyz");
		//PriorityThread t3 = new PriorityThread("asdf");

		// Set thread priorities
		t1.setPriority(1); // Maximum priority
		//t3.setPriority(5);
		t2.setPriority(10); // Minimum priority
		// jiski priorty jyada higi chalne ke chances jyada rahte h
		t1.start();

		t2.start();
	}
}
