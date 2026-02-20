package com.exception;

import java.util.Scanner;

/*
 * exception:any abnormal condition
 * 1.compile time error:
 *   ; } missing syntax error
 * 2.runtime error :
 * 		ArrayIndexoutofbound, numberformatexeption, Arithmetic
 * 
 * 3.error: developer mistake
 * 
 * Exception handle :
 *	1.try :
 *		if we have a doubt that a code might have error we can skip
 *	the code which have error keep the code in try
 *	try does not solve the error but throws the error to catch
 *	the code which have error will skip
 *
 *	2.catch :
 *		catch handles the error and trace the error
 *		try followed by multiple catch
 *	3.finally :whether error is there or not finally block 
 *		will be executed
 *	4.throw
 *	5.throws
 *
 */
public class ExceptionDemo {
public static void main(String[] args) {
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a num :");
	a=sc.nextInt();
	System.out.println("enter a num :");
	b=sc.nextInt();
	try {
		System.out.println("division is "+a/b);
		
		// TODO: handle exception
	
	
	
	int[] num1= {1,2,4,5};
	for (int i = 0; i <num1.length; i++) {
		
			System.out.println(num1[i]);
		
		
	}
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	
	finally {
		System.out.println("This code is written by tanvi");
		System.out.println("call 911 for any query");
	}
	

}
}
