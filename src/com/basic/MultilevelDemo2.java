package com.basic;
class Person{
	String name;
	byte age;
	
	public void displayPerson() {
		System.out.println("name is "+name);
		System.out.println("age is "+age);
	}
}
class Employee extends Person{
	int emp_id;
	long salary;
	public void displayEmp() {
		System.out.println("emp id "+emp_id);
		System.out.println("salary is "+salary);
	}
}
class Manager extends Employee{
	String dept;
	public void displayManager() {
		System.out.println("department is "+dept);
	}
}

public class MultilevelDemo2 {
public static void main(String[] args) {
	Manager m1=new Manager();
	m1.name="rahul";
	m1.age=34;
	m1.emp_id=123;
	m1.salary=3400000l;
	m1.dept="IT";
	
	m1.displayPerson();
	m1.displayEmp();
	m1.displayManager();
}
}
