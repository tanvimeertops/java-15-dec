package com.com_class;
/*
 * Wrapper : type conversion :int to float
 * convert data type from primitive to non primitive
 *  and vice a versa
 *  primitive:  		non primitive
 *  int						String
 *  float					Class
 *  char					Integer
 *  long
 *  byte
 *  boolean
 *  
 *  1.autoboxing : direct value to object
 *  2.boxing : value first given to variable to object
 *  3.unboxing :object to variable
 *  
 *  Object :root class for all java class
 *  
 */
class Demo{
	public void display() {
		System.out.println("this is demo class");
	}
}
public class WrapperClass {
public static void main(String[] args) {
	Integer i1=new Integer(100);
	System.out.println("Auto boxing is "+i1);
	int i2=15233;
	Integer i3=i2;
	System.out.println("Boxing is "+i3);
	int i4=i3;
	System.out.println("unboxing is "+i4);
	
	String s1 ="787.52";
	String s2 ="100";
	System.out.println(s1+s2); //887
	
//	int i6=Integer.parseInt(s1);
	double d1=Double.parseDouble(s1);
	int i5=Integer.parseInt(s2);
	
	System.out.println(d1+i5);
	Demo demo=new Demo();
	demo.display();
	String abc=String.valueOf(d1);
			System.out.println(abc);
	
}
}
