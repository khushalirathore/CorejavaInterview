package com.rays.racing;

public class Racing extends Thread {

	String name = null;

	public static AccountRacing ac = new AccountRacing();//one memory alocate account class ki  

	public Racing(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			ac.deposite(name, 1000);
		}
	}
}