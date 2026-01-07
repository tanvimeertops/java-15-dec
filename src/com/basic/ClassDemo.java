package com.basic;
/* oops 
 * class : class is collection data member and member function
 * object : gives permission to access functionality of class
 */
class Student{
	int id;
	String name;
	
	public void setData() {
		id=12;
		name="prakash";
	}
	
	public void show() {
		System.out.println("id is :"+id);
		System.out.println("name is :"+name);
	}
}
public class ClassDemo {
public static void main(String[] args) {
	Student s1=new Student();
	s1.setData();
	s1.show();
}
}
