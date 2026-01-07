package com.basic;
/*
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 * i: 
 * ini :
 * first no of pattern
 * 
 * cond:
 * last no of pattern
 * min to max :<=
 * max to min :>=
 * 
 * incree/decree:
 * <= ++
 * >= --
 * 
 * j:
 * ini :
 * first col of each row in the pattern
 * same no : no
 * diff no : upper loop name
 * 
 * cond:
 * last col of each row in the pattern
 * same no : no
 * diff no : upper loop name
 * min to max :<=
 * max to min :>=
 * 
 * incree/decree:
 * <= ++
 * >= --
 * 1
 * 10
 * 101
 * 1010
 * 10101
 */
public class PatternDemo {
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print(j);
		}
		System.out.println();
	}
}
}
