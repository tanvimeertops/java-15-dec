package com.file;

import java.io.File;
import java.io.IOException;

class FDemo{
	File file=new File("file3.txt");
	public FDemo() throws IOException {
		file.createNewFile();
		display();
	}
	public void display() {
		System.out.println("can read or not :"+file.canRead());
		System.out.println("can write or not :"+file.canWrite());
		System.out.println("can execute or not :"+file.canExecute());
		System.out.println("is file or not :"+file.isFile());
		System.out.println("is directory or not :"+file.isDirectory());
		System.out.println("file name is :"+file.getName());
		System.out.println("file path is :"+file.getPath());
		System.out.println("Absolute file path :"+file.getAbsolutePath());
	}
}
public class FileDemo {
public static void main(String[] args) throws IOException {
	new FDemo();
	
	
}
}
