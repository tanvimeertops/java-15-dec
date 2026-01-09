package com.basic;
class Parent{
	String p_name;
	long ph_no;
	public void setParent() {
		p_name="salim khan";
		ph_no=545454522l;
	}
}
class Child_1 extends Parent{
	String ch_name="salman";
	public void display() {
		System.out.println("For any complain of "+ch_name+" "
	+p_name+" call "+ph_no);
	}
}

class Child_2 extends Parent{
	String ch_name="suhail";
	public void display() {
		System.out.println("For any complain of "+ch_name+" "
	+p_name+" call "+ph_no);
	}
}
public class HierarchicalInheritance {
public static void main(String[] args) {
	Child_1 c1=new Child_1();
	Child_2 c2=new Child_2();
	c1.setParent();
	c2.setParent();
	
	c1.display();
	c2.display();
}
}
