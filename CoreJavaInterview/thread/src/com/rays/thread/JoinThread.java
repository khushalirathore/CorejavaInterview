package com.rays.thread;

public class JoinThread extends Thread {

	String name = null;

	public JoinThread(String name) {
		this.name = name;
	}

	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "=" + name);
		}
	}

	public static void main(String[] args) {

		JoinThread j = new JoinThread("khushali");
		JoinThread j1 = new JoinThread("paras");

		j.start(); // Start J first

		try {
			j.join(); // Waiting for j to complete
		} catch (Exception e) {
			e.printStackTrace();
		}

		j1.start(); // Start j1 after j complete
	}

}
