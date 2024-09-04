package com.rays.first;

public class BankAcc extends Account {

	public int getBalance() {
		return balance + 10;
	}

	public static void main(String[] args) {

		Account a = new Account();
		System.out.println(a.getBalance());
		Account a1 = new BankAcc();
		System.out.println(a1.getBalance());
		BankAcc b = new BankAcc();
		System.out.println(b.getBalance());

	}

}
