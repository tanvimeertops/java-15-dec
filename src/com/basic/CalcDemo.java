package com.basic;
/*
 * Arithmetic operator:
 * +-/*%
 * 12345
 * to bring last digit of a number use 12345%10
 */
public class CalcDemo {
public static void main(String[] args) {
	int num1=10,num2=2;
	System.out.println("sum is :"+(num1+num2));
	System.out.println("sub is :"+(num1-num2));
	System.out.println("multi is :"+num1*num2);
	System.out.println("div is :"+(float)num1/num2); //3.33
	System.out.println("mod is :"+num1%num2);
}
}
