package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * HashMap:
 * 	1.It is a dynamic array
 * 	2.Automatically shrink and grow
 * 	3.Default value is {}
 * 	4.Default size is 0
 * 	5.Automatically implements Map interface
 * 	6.put() and remove()
 * 	7.All values are stored in key value pair
 * 	8.All value display hash code wise
 * 	8.duplicate key are not allowed
 */
public class HashMapDemo {
public static void main(String[] args) {
	HashMap h1=new HashMap();
	
	System.out.println("Default value is "+h1);
	System.out.println("Default size is "+h1.size());
	
	h1.put(1,"tops");
	h1.put("192.168.1.10", 4);
	h1.put(10, 3);
	System.out.println("Now value is "+h1);
	System.out.println("Now size is "+h1.size());
	
	h1.put(1, "tops technologies");
	System.out.println("Now value is "+h1);
	System.out.println("Now size is "+h1.size());
	
	h1.put(2, 3);
	System.out.println("Now value is "+h1);
	System.out.println("Now size is "+h1.size());
	
	h1.remove(10);
	System.out.println("Now value is "+h1);
	System.out.println("Now size is "+h1.size());
	
	Set s1=h1.entrySet();
	Iterator i1=s1.iterator();
	while (i1.hasNext()) {
//		System.out.println(i1.next());
		Map.Entry me=(Map.Entry)i1.next();
		System.out.println("key is :"+me.getKey());
		System.out.println("value is :"+me.getValue());
	}
}
}
