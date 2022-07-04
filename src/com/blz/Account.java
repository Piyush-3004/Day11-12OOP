package com.blz;

import java.util.Scanner;

public class Account {

	double balance = 10000.00;

	public void debit(double amount) {
		if (balance - amount < 0)
			System.out.println("Debit amount exceeded account balance.");
		else {
			balance = balance - amount;
			System.out.println(amount + " was debited current balance is : " + balance);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account obj = new Account();
		System.out.println("your account balance is " + obj.balance);
		System.out.println("Enter amount to be debited");
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextDouble();
		obj.debit(amount);
		sc.close();

	}
}
