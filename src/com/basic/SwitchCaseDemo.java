package com.basic;
/*
 * switch case :
 * 
 */
public class SwitchCaseDemo {
public static void main(String[] args) {
	int choice=5;
	
	switch (choice) {
	case 1:
		System.out.println("Light is on");
		break;
		
	case 2:
		System.out.println("Fan is on");
		break;
	case 3:
		System.out.println("Ac is on");
		break;
	default:
		System.out.println("Invalid input");
		break;
	}
	
	char ch='p';
	switch (ch) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
		System.out.println("Vowel");
		break;

	default:
		System.out.println("consonant");
		break;
	}
		
}
}
