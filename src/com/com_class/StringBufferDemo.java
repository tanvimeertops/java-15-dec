package com.com_class;
/*
 * String Buffer :mutable class
 */
public class StringBufferDemo {
public static void main(String[] args) {
	StringBuffer s1=new StringBuffer("This is Tops Technologies");
	System.out.println("Original String :"+s1);
	System.out.println("Original Size :"+s1.length());
	
	s1.insert(0, "Hii...");
	System.out.println("Original String :"+s1);
	System.out.println("Original Size :"+s1.length());
	s1.append("...Surat");
	System.out.println("Original String :"+s1);
	System.out.println("Original Size :"+s1.length());
	s1.delete(0, 6);
	System.out.println("Original String :"+s1);
	System.out.println("Original Size :"+s1.length());
	
}
}
