package com.basic;
/*
 * function : does something
 * polymorphism
 * function overloading: 
 * same function nut diff parameter
 */

class Calc{
	int num_1,num_2;
	public void sum() {
		num_1=10;
		num_2=56;
		System.out.println("sum is :"+(num_1+num_2));
	}
	public void sum(int a,int b) {
		num_1=a;
		num_2=b;
		System.out.println("sum is :"+(num_1+num_2));
	}
	
	// function without parameter with return type
	public double div() {
		num_1=10;
		num_2=5;
		return num_1/num_2;
	}
	// function with parameter with return type
		public double div(int a,int b) {
			num_1=a;
			num_2=b;
			return (double)num_1/num_2;
		}
}
public class FunctionDemo {
public static void main(String[] args) {
	Calc c1=new Calc();
	c1.sum();
	c1.sum(100, 562);
	System.out.println("div is :"+c1.div());
	System.out.println("div is :"+ c1.div(12,10));
}
}
