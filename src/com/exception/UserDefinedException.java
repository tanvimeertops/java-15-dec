package com.exception;
/*	Deposit :
 * 		balance+amount
 * 	withdraw :
 * 		amount<balance: 2000<5000
 * 			balance-amount
 * 		amount>balance : 15000>5000
 * 			if you deposit 10000 rs more u can withdraw 15000 rs
 * 			
 * user defined exception class must inherit exception class
 * Throw : 
 * 		throw new Constructor
 * 	
 * Throws:
 */

import java.util.Scanner;

class TanviException extends Exception {
	double amount;
	public TanviException(double amount) {
		this.amount=amount;
	}
}
class ATM{
	double balance=1000;
	public void deposit(double amount) {
		balance+=amount;
		System.out.println(amount+" rs added to account you current"
				+ " balance is "+balance);
	}
	
	public void withdraw(double amount) throws TanviException {
		if (amount<balance) {
			balance-=amount;
			System.out.println(amount+" rs withdrawn from account"
					+ " you current balance is "+balance);
		}else {
			double needs=amount-balance;
//			System.out.println(needs);
			throw new TanviException(needs);
		}
	}
}
public class UserDefinedException {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double amount;
	ATM atm=new ATM();
	System.out.println("Enter amount to be deposited :");
	amount=sc.nextDouble();
	atm.deposit(amount);
	System.out.println("Enter amount to be withdrawn :");
	amount=sc.nextDouble();
	try {
		atm.withdraw(amount);
	} catch (TanviException e) {
		// TODO Auto-generated catch block
//		e.printStackTrace();
		System.out.println("if you deposit "
+e.amount +" rs more u can withdraw "+amount+" rs");
	}
	sc.close();
}
}
