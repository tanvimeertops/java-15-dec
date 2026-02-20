package com.keyword;
/*
 * Abstract :
 * method :
 * 	Don't have method body
 * 	must define into child class
 *  if method is abstract class must be abstract
 * class:
 * 	cannot make object of abstract class
 * 	must inherit into some other class
 */
abstract class ADemo{
	public abstract void show();
}
class Demo extends ADemo{

	@Override
	public void show() {
		System.out.println("this is a abstract method");
		
	}
	
}
public class AbstractDemo {
public static void main(String[] args) {
//	ADemo ad=new ADemo();
	Demo d1=new Demo();
	d1.show();
}
}
