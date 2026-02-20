package com.basic;
/*
 * Constructor :it is special member function 
 * 1.same name as class name
 * 2.no return type
 * 3.it is invoked automatically whenever object is created
 * types
 * default constructor
 * parameterized constructor 
 * copy constructor
 */
class Box{
	double length,width,height;
	public Box() {
		System.out.println("IN default constructor");
		length=1;
		width=2;
		height=3;
	}
	public Box(double l,double w,double h) {
		System.out.println("IN parameterised constructor");
		length=l;
		width=w;
		height=h;
	}
	public Box(Box b) {
		System.out.println("IN copy constructor");
		length=b.length;
		width=b.width;
		height=b.height;
	}
	public void volOfBox() {
		System.out.println("vol of box is :"+length*width*height);
	}
}
public class ConstrctorDemo {
public static void main(String[] args) {
	Box dc=new Box();
	dc.volOfBox();
	Box pc=new Box(10, 20, 30);
	pc.volOfBox();
	Box cc=new Box(pc);
	cc.volOfBox();
}
}
