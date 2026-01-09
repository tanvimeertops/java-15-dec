package com.basic;

import java.util.Scanner;

class BankAccount{
	
	double balance=1000,amt;
	public void deposit(double amount,String name) {
		amt=amount;
		System.out.println("Holder name :"+name);
		System.out.println("balance is "+(amt+balance));
	}
}
class SavingsAcc extends BankAccount{
	double interest=4.5,ie;
	public void interestEarned() {
		ie =balance*interest/100;
		System.out.println("interest earned :"+ie);
	}
}
class CurrentAcc extends BankAccount{
	double overdraft_limit =50000;
	public void withdraw(double amount,String name) {
		if(amount>overdraft_limit) {
			System.out.println("Over draft limit is "+overdraft_limit);
		}else {
	    double remains=overdraft_limit-amount;
	    System.out.println("remaining over draft is :"+remains);
		}
		
	}
	
}
public class hierarchicalDemo2 {
public static void main(String[] args) {
	double amount;
	String name;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name :");
	name=sc.nextLine();
	System.out.println("enter the amount to be deposited :");
	amount= sc.nextDouble();
	SavingsAcc sa=new SavingsAcc();
	CurrentAcc ca=new CurrentAcc();
	sa.deposit(amount,name);
	System.out.println("enter your name :");
	sc.nextLine();
	name=sc.nextLine();
	System.out.println("enter the amount to be withdrawn :");
	amount=sc.nextDouble();
	ca.withdraw(amount,name);
	
}
}
