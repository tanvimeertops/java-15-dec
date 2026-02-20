package com.collection;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Collection : collection of data
 * 
 * Class:
 * ArrayList:
 * 	1.It is a dynamic array
 * 	2.Automatically shrink and grow
 * 	3.Default value is []
 * 	4.Default size is 0
 * 	5.Automatically implements list interface
 * 	6.add() and remove()
 * 	7.Data display is same sequence as it store
 * 	8.duplicate value allowed
 * HashSet
 * HashMap
 * vector
 * Generic
 * 
 * interface:
 * List
 * Set
 * Map
 * Iterator :when we want to display the data in list ..
 * 
 * Enumeration
 */
public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	System.out.println("Default value is "+a1);
	System.out.println("Default size is "+a1.size());
	
	a1.add(123);
	a1.add('T');
	a1.add("Tops");
	a1.add(34.5f);
	a1.add(new Integer(100));
	System.out.println("Now value is "+a1);
	System.out.println("Now size is "+a1.size());
	
	a1.remove(2);
	System.out.println("Now value is "+a1);
	System.out.println("Now size is "+a1.size());
	a1.add(34.5f);
	System.out.println("Now value is "+a1);
	System.out.println("Now size is "+a1.size());
	
	Iterator i1=a1.iterator();
	while (i1.hasNext()) {
		System.out.println(i1.next());
		
	}
}
}
