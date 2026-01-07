package com.basic;

class Students{
	int roll_no;
	String name;
	
	public void setData() {
		roll_no=133;
		name="abc";
		
	}
}
class Sports extends Students{
	int sports_marks=67;
	
}
class Result extends Sports{
	String grade="A+";
	public void show() {
		System.out.println("roll no :"+roll_no);
		System.out.println("name :"+name);
		System.out.println("sports marks :"+sports_marks);
		System.out.println("grade :"+grade);
	}
}
public class MultilevelInheritance {
public static void main(String[] args) {
	Result r1=new Result();
	r1.setData();
	r1.show();
}
}
