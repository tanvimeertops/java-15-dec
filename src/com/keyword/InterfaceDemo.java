package com.keyword;
/* class --> interface :implements
 * interface --> class : implements
 * class-->class : extends
 * interface-->interface :extends
 * 
 * Interface:
 * same as a class but cannot make object of interface
 * all data member are final by default
 * all member functions are abstract by default
 * main purpose is to solve multiple inheritance problem
 * use "implements" to inherit the interface 
 * pure data hiding
 * multiple interface can be inherited using , 
 */
class Result{
	String grade="A+";
	
}
class Demo123 extends Result implements InterDemo1,InterDemo2 {

	@Override
	public void show() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("grade is "+grade);
		System.out.println("i no "+i1);
	}
	
}
public class InterfaceDemo {
public static void main(String[] args) {
	Demo123 d1=new Demo123();
	d1.show();
}
}
