package com.basic;
/*
 * a=10
 * b=20
 * c=30
 * gretest of 3 nos
 * logical operator :&& || !
  grade
 */
public class ElseIfLadder {
public static void main(String[] args) {
	int a=10,b=20,c=30;
	if(a>b && a>c) {
		System.out.println("A is greater");
	}else if(b>a && b>c) {
		System.out.println("B is greater");
	}else {
		System.out.println("C is greater");
	}
	/*grade*/
	float avg=56.3f;
	
	if(avg>70) {
		System.out.println("Distinction");
	}else if(avg>60) {
		System.out.println("First Class");
	}else if(avg>50) {
		System.out.println("Second Class");
	}else if(avg>35) {
		System.out.println("Third Class");
	}else {
		System.out.println("Fail");
	}
	
	/*vowel & consonant*/
	char ch='a';
	if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		System.out.println("vowel");
	}else {
		System.out.println("consonant"
				+ ""
				+ ""
				+ "");
	}
}
}
