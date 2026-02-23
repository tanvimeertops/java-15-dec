package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo2 {
public static void main(String[] args) {
	ArrayList<Student> a1=new ArrayList<>();
	
	Student s1=new Student();
	s1.setId(1);
	s1.setName("Prakash");
	s1.setDegree("B.Tech");
	s1.setGrade('A');
	
	Student s2=new Student();
	s2.setId(2);
	s2.setName("sally");
	s2.setDegree("BCA");
	s2.setGrade('B');
	
	a1.add(s1);
	a1.add(s2);
	
//	Iterator<Student> i1=a1.iterator();
//	while (i1.hasNext()) {
//		Student s=i1.next();
//		System.out.println(s.getId()); 
//		System.out.println(s.getName()); 
//		System.out.println(s.getDegree()); 
//		System.out.println(s.getGrade()); 
//		
//	}
	
	
	for (Student s : a1) {
		System.out.println(s.getId()); 
		System.out.println(s.getName()); 
		System.out.println(s.getDegree()); 
		System.out.println(s.getGrade());
	}
}
}
