package com.collection;
import java.util.Iterator;
/*
 * Vector:
 * 	1.It is a dynamic array
 * 	2.Automatically shrink and grow
 * 	3.Default value is []
 * 	4.Default size is 0
 * 	5.Default capacity is 10
 * 	6.Automatically implements list interface
 * 	7.add() and remove()
 * 	8.Data display is same sequence as it store
 * 	9.duplicate value allowed
 */
import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	Vector v1=new Vector<>(3,1);
	System.out.println("Default value is "+v1);
	System.out.println("Default size is "+v1.size());
	System.out.println("Default capacity is "+v1.capacity());
	
	v1.add(123);
	v1.add('T');
	v1.add("Tops");
	v1.add(34.5f);
	v1.add(new Integer(100));
	v1.add(new Integer(100));
	v1.add(new Integer(100));
	System.out.println("Now value is "+v1);
	System.out.println("Now size is "+v1.size());
	System.out.println("Now capacity is "+v1.capacity());
	
	v1.remove(5);
	System.out.println("Now value is "+v1);
	System.out.println("Now size is "+v1.size());
	System.out.println("Now capacity is "+v1.capacity());
	
	Iterator i1=v1.iterator();
	while (i1.hasNext()) {
		System.out.println(i1.next());
		
	}
}
}
