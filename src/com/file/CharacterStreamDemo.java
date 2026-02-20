package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * Character Stream 
 *  to write into file
 *  	FileWriter
 *  to read from the file
 *  	FileReader
 *  
 */
public class CharacterStreamDemo {
public static void main(String[] args) throws Exception {
	FileWriter fw;
	try {
		// 1.to create and open file
		fw = new FileWriter("file2.txt",true);
		String data = "\nThis is character stream program";
		fw.write(data);
		//3.to flush fos
		fw.flush();
		//4.close file
		fw.close();
		System.out.println("data written");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	// 1.to open and read from the file
	FileReader fr=new FileReader("file2.txt");
	int data;
	while((data= fr.read())!=-1) {
		System.out.print((char)data);
	}
	fr.close();
}
}
