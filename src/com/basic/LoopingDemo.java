package com.basic;
/*
 * Loop: iterative ,repetitive
 * for 
 * while
 * do while
 * 0 1 2 3 4
 */
public class LoopingDemo {
public static void main(String[] args) {
	System.out.println("for loop");
	for (int i = 0; i <5; i++) { //6
		System.out.println(i+1);//5
	}
	// 11 time loop executed
	System.out.println("while loop");
	int i=1; //1
	while (i<=5) { //6
		System.out.println(i); //5
		i++;//5
	}
	//17 times loop executed
	System.out.println(" do while loop");
	int j=6;
	do {
		System.out.println(j);
		j++;
		
		
		
		
		
	} while (j<=5);
}
}
