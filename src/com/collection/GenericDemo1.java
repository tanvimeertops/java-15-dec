package com.collection;

import java.util.Vector;

/*
 * Generic :to generalize collection
 * Integer
 */
public class GenericDemo1 {
public static void main(String[] args) {
	Vector<Integer> v1=new Vector<>();
	v1.add(100);
	v1.add(new Integer(10));
	System.out.println("Now value is "+v1);
	System.out.println("Now size is "+v1.size());
	System.out.println("Now capacity is "+v1.capacity());
}
}
