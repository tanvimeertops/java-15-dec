package com.collection;

import java.util.HashSet;
import java.util.Iterator;

/*
 * Hashset:
 * 	1.It is a dynamic array
 * 	2.Automatically shrink and grow
 * 	3.Default value is []
 * 	4.Default size is 0
 * 	5.Automatically implements Set interface
 * 	6.add() and remove()
 * 	7.All data is converted into hash code and displayed 
 *    hashcode wise
 * 	8.duplicate value are not allowed
 */
public class HashSetDemo {
public static void main(String[] args) {
	HashSet h1=new HashSet();
	System.out.println("Default value is "+h1);
	System.out.println("Default size is "+h1.size());
	
	h1.add(123);
	h1.add('T');
	h1.add("Tops");
	h1.add(34.5f);
	h1.add(new Integer(100));
	System.out.println("Now value is "+h1);
	System.out.println("Now size is "+h1.size());
	
	h1.remove("Tops");
	System.out.println("Now value is "+h1);
	System.out.println("Now size is "+h1.size());
	h1.remove(34.5f);
	System.out.println("Now value is "+h1);
	System.out.println("Now size is "+h1.size());
	h1.add('T');
	System.out.println("Now value is "+h1);
	System.out.println("Now size is "+h1.size());
	Iterator i1=h1.iterator();
	while (i1.hasNext()) {
		System.out.println(i1.next());
		
	}
}
}
