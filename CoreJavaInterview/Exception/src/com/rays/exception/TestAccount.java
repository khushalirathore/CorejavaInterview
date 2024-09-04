package com.rays.exception;

public class TestAccount {
	public static void main(String[] args) {

		Account a = new Account();

		a.setBalance(1000);

		a.deposite(5000);

		try {
			a.withdrawl(5000);
		} catch (InsufficientBalance e) {
			e.printStackTrace();
		}

	}

}