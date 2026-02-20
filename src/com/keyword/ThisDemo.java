package com.keyword;
/*
 * This keyword is used to give the current class context
 */
class TDemo{
	int id;
	String name;
	public void setData(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public void show() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
	}
}
public class ThisDemo {
public static void main(String[] args) {
	TDemo td=new TDemo();
	td.setData(1, "Revanand");
	td.show();
}
}
