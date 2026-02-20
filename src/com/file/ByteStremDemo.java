package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * File: class
 * stream :to store data
 * byte stream (1 byte): 
 * 	to write into file
 * 		FileOutputStream
 * 	to read from file
 * 		FileInputStream
 * 
 * character stream (2 byte):
 * 
 * File not found
 * IO exception
 */
public class ByteStremDemo {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos;
		try {
			// 1.to create and open file
			fos = new FileOutputStream("file1.txt",true);
			String data = "\nThis is tops technologies";
			// 2.to write into file
			byte[] bb = data.getBytes();
			fos.write(bb);
			//3.to flush fos
			fos.flush();
			//4.close file
			fos.close();
			System.out.println("data written");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 1.to open and read from the file
		FileInputStream fis=new FileInputStream("file1.txt");
		int data;
		while((data= fis.read())!=-1) {
			System.out.print((char)data);
		}
		fis.close();
		
	}
}
