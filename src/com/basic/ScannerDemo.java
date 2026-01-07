package com.basic;

import java.util.Scanner;

/*
 * Scanner :it is a class
 * use to take input from the user
 * use system.in as a argument
 * int nextInt()
 * float nextFloat()
 * char next().charAt()
 * String next() :read until space is pressed
 * line nextLine() :read until enter is pressed
 *  */
public class ScannerDemo {
public static void main(String[] args) {
	int a,b;
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	System.out.println("enter a:");
	a=sc.nextInt();
	System.out.println("enter b:");
	b=sc.nextInt();
	
	System.out.println(a+b);
	
	char ch;
	System.out.println("enter char value :");
	ch=sc.next().charAt(0);
	System.out.println(ch);
	
//	sc.nextLine(); //buffer clean
	String name;
	System.out.println("enter your name: ");
	name=sc1.nextLine();
	System.out.println("name is :"+name);
}
}
