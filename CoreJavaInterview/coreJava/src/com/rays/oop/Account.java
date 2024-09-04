package com.rays.oop;

public class Account {
	
	double balance; 
	
	public Account(double ammount) {
		this.balance = ammount;
	}
	
	public void deposit (double amt) {
		System.out.println("total balnce " + balance);
		System.out.println("deposite amount " + amt);
			balance +=amt;
			System.out.println(balance);
	}
	
	public void withdraw (double amt) {
		System.out.println("total balnce " + balance);
		System.out.println("withdraw amount " + amt);
		balance -= amt; 
		System.out.println(balance);
		
	}
	
	public static void main(String[] args) {
		Account a = new Account(10000.0);
		a.deposit(100);
		a.withdraw(1000);
	}

}
