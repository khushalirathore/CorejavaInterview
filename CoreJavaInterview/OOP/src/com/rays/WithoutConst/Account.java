package com.rays.WithoutConst;

public class Account {

	public int balance;
//
//	public Account(int balance) {
//		this.balance = balance;
//	}

	public int getBalance() {
		return balance;

	}

	public void setBalance(int balance) {
		this.balance = balance;

	}

	public void deposit(int amt) {
		balance += amt;
		System.out.println(balance);
	}

	public void withDraw(int amt) {

		if ((balance - amt) < 2000) {
			System.out.println("Low account balance ");
		} else {
			balance -= amt;
			System.out.println(balance);
		}

	}

	public static void main(String[] args) {
		Account a = new Account();

		a.setBalance(2000);

		a.deposit(1000);
		a.withDraw(500);
	}

}
