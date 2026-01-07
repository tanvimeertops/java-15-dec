package com.basic;

import javax.security.auth.login.LoginContext;

/*
 * convert one datatype to another
 * implicit(automatic) : smaller datatype to bigger datatype
 * explicit :bigger to smaller datatype
 * 
 * 
 * 
 */
public class TypeConversion {
public static void main(String[] args) {
	int i1=123; //4
	long l1=i1; //8
	int i2=(int)l1;
	System.out.println("explicit conversion :"+i2);
	char ch='A';//2
	int i3=ch;//4
	System.out.println("implicit conversion :"+i3);
	int i4=626565; //4
	byte b1=(byte)i4; //-128 -127 -126  to 127
	System.out.println("explicit conversion: "+b1);
}
}
