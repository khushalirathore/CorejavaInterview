package com.rays.racing;

public class AccountRacing {

	public int balance = 0;

	public void setBalance(int balance) {

		try {
			Thread.sleep(200);
		} catch (Exception e) {
			e.printStackTrace();
		}

		this.balance = balance;
	}

	public int getBalance() {

		try {
			Thread.sleep(200);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return balance;

	}

	// sorting order m amount lana ho to
	// public synchronized void deposit kr do
	// method synchronized
	public  void deposite(String name, int amt) {
		// block synchronized
		// synchronized (this) {
		int total = getBalance() + amt;

		setBalance(total);

		System.out.println(name + " " + getBalance());
		// }
	}

}
