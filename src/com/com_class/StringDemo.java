package com.com_class;

/*
 * Common class
 * String
 * String buffer
 * Wrapper
 * Object
 * 
 * String : It is immutable 
 * 
 */
public class StringDemo {
public static void main(String[] args) {
	String s1=new String("This is Tops Technologies...");
	System.out.println("Value is "+s1);
	System.out.println("size is "+s1.length());
	System.out.println("to lower case :"+s1.toLowerCase());
	System.out.println("to upper case :"+s1.toUpperCase());
	System.out.println("substring : "+s1.substring(2));
	System.out.println("substring : "+s1.substring(9,15));
	System.out.println("Char at "+s1.charAt(11));
	
	String pas="Tops";
	
	if(pas.equalsIgnoreCase("tops")) {
		System.out.println("both strings are same");
	}else {
		System.out.println("Both strings are diff");
	}
	System.out.println("Value is "+s1);
	System.out.println("size is "+s1.length());
}
}
