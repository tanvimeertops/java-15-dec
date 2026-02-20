package com.basic;
/*
 * Array: collection of data of similar type
 * 1 D
 * 2 D
 * jagged array
 * length=size-1
 */
public class ArrayDemo {
public static void main(String[] args) {
//	int[] a=new int[100];
//	for (int i = 0; i <a.length; i++) {
//		a[i]=i+1;
//		System.out.println(a[i]);
//	}
	
	int[][] a=new int[3][3];
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			a[i][j]=j+1;
			System.out.print("  "+a[i][j]);
		}
		System.out.println();
	}
	System.out.println();
	int[][] b=new int[3][3];
	for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b[i].length; j++) {
			b[i][j]=j*1;
			System.out.print("  "+b[i][j]);
		}

		
		
		System.out.println();
	}
	
	System.out.println();
	int[][] c=new int[3][3];
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c[i].length; j++) {
			c[i][j]=a[i][j]+b[i][j];
			System.out.print("  "+c[i][j]);
		}
		System.out.println();
	}
}
}
