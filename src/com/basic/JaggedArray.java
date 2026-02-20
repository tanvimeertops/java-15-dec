package com.basic;

import java.util.Scanner;

/*
 * Jagged array :same like 2D array
 * where row is fixed but col is not fixed
 */
public class JaggedArray {
public static void main(String[] args) {
	String[][] a;
	int nrow ,ncol;
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	System.out.println("enter number of row :");
	nrow=sc.nextInt();
	a=new String[nrow][];
	for (int i = 0; i < nrow; i++) {
		System.out.println("enter no of col for row no "+(i+1));
		ncol=sc.nextInt();
		a[i]= new String[ncol];
	}
	System.out.println("enter values:");
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			a[i][j]=sc1.nextLine();
		}
	}
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.print
			(" "+a[i][j]);
		}
		System.out.println();
	}
}
}
