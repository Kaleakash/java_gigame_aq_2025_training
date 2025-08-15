package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class CharacterwiseExamples {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// source --> keyboad 
		// destination --> console 
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the name");
//		String name = br.readLine();
//		System.out.println("name is "+name);
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("info2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		int ch;
		while((ch=br.read())!= -1) {
			bw.write(ch);
		}
		fr.close();
		bw.close();
		System.out.println("stored the data");
	}

}
