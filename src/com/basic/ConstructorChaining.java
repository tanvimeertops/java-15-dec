package com.basic;
/*
 * polymorphism :
 * function overriding :same func name and prototype but diff func body
 * keyword :
 * super :
 * 	show the immediate parent function
 * abstract
 * final
 * this
 * interface
 * static
 */
class A{
	public A() {
		System.out.println("in constructor A");
	}
	public void show() {
		System.out.println("In A show");
	}
}
class B extends A{
	public B() {
		System.out.println("in constructor B");
	}
	public void show() {
		super.show();
		System.out.println("In B show");
	}
}
class C extends B{
	public C() {
		System.out.println("in constructor C");
	}
	public void show() {
		super.show();
		System.out.println("In C show");
	}
}
public class ConstructorChaining {
public static void main(String[] args) {
	C c1= new C();
	c1.show();
}
}
