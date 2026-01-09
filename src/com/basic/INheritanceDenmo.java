package com.basic;
/*
 * Inheritance : deriving the attribute of some class
 * single : one parent one child
 * multilevel : one grandparent one parent one child
 * hierarchical :one parent multiple child
 * multiple :multiple parent single child(not supported in java)
 * hybird: combination of any two
 * 
 * use keyword extends
 * object will be made for last child
 * 
 */

class Student123{
	int roll_no;
	String name;
	public void setData() {
		roll_no=123;
		name="prakash";
	}
	
}
class Child extends Student123{
	String grade="A+";
	
	public void show() {
		System.out.println("roll no :"+roll_no);
		System.out.println("name :"+name);
		System.out.println("grade :"+grade);
	}
}
public class INheritanceDenmo {
public static void main(String[] args) {
	Child c1=new 
			Child();
	c1.setData();
	c1.show();
}
}
