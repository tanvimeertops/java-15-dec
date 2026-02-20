package com.basic;
/*
 * a=10
 * b=20
 * c=30
 * gretest of 3 nos
 */
public class NestedIfDemo {
public static void main(String[] args) {
	int a=1000,b=2000,c=3000;
	if(a>b) {
		if(a>c) {
			System.out.println("A is greater");
			
		}else {
			System.out.println("C is greater");
		}
			
	}else {
		if(b>c) {
			System.out.println("B is greater");
			
		}else {
			System.out.println("c is greater");
		}
	}
}
}
