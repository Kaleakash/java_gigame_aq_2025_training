package com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class BytewiseClasses {

	public static void main(String[] args) throws Exception{
		// source --> keyboard 
		// target --> console 
//		DataInputStream dis = new DataInputStream(System.in);
//		PrintStream ps = System.out;
//		ps.println("Enter the text");
//		String data = dis.readLine();
//		ps.print("data is "+data);
		
		// source --> keyboard 
		// target --> file 
//		DataInputStream dis = new DataInputStream(System.in);
//		FileOutputStream fos = new FileOutputStream("abc.txt",true);
//		System.out.println("Enter the data");
//		int ch;
//		while((ch=dis.read())!= '@') {
//			fos.write(ch);
//			System.out.print(ch+"= "+(char)ch);
//		}
//		fos.close();
//		System.out.println("Data stored...");
		// source --> file  
		// destination -->file 
//		FileInputStream fis = new FileInputStream("abc.txt");
//		FileOutputStream fos = new FileOutputStream("info.txt");
//		int ch;
//		while((ch=fis.read()) != -1) {
//			fos.write(ch);
//		}
//		fis.close();
//		fos.close();
//		System.out.println("file copied...");
		// file handling using buffer operation 
		FileInputStream fis = new FileInputStream("abc.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("info1.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int ch;
		while((ch=bis.read()) != -1) {
			bos.write(ch);
		}
		bos.flush();
		fis.close();
		fos.close();
		System.out.println("file copied with buffered option...");
	}

}
