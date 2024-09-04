package com.rays.thread;

public class DemonThread extends Thread {

	public void run() {
		while (true) {// alwy true kabhi false na ho
			try {
				Thread.sleep(500);
				System.out.println("deon thread");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {
		DemonThread d = new DemonThread();
		d.setDaemon(true);// thread ko demon thread me convert karta h main thread ko support kar ke kaam

		d.start();

		for (int i = 1; i <= 3; i++) {  
			try {
				Thread.sleep(500);

			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("main thread" + i);

		}

	}

}
