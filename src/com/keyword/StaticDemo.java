package com.keyword;
/*
 * Static :constant at memory side
 * variable:
 * 
 * method: 
 * all variable are static by default
 * only static variable is allowed in static method
 */
class SDemo{
	int no;
    static int s_no;
	
    public static void display() {
		s_no=52;
//		no=85;
		int r_no=15;
		System.out.println(" s no is "+s_no);
		System.out.println("r no is "+r_no);
	}
}
public class StaticDemo {
public static void main(String[] args) {
	SDemo s1=new SDemo();
	SDemo s2=new SDemo();
	SDemo s3=new SDemo();
	
	s1.no=1;//4
	s2.no=2;//4
	s3.no=3;//4
		
	System.out.println("no is "+s1.no);
	System.out.println("no is "+s2.no);
	System.out.println("no is "+s3.no);
	
	SDemo.s_no=10;
	s2.s_no=20;//4 byte
	s3.s_no=30;
	System.out.println("s no is "+s1.s_no);
	System.out.println("s no is "+s2.s_no);
	System.out.println("s no is "+s3.s_no);
	
	SDemo.display();
}
}
