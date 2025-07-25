package com;

public class RuntimeException {

	public static void main(String[] args) {
		System.out.println("Hello");
		int a=10;
		int b=0;
		try {
			int result = a/b;
		System.out.println("result is "+result);
		}catch(Exception e) {
			//System.out.println("I Take care!");
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			//e.printStackTrace();
		}
		System.out.println("bye");
		System.out.println("bye");
	}

}
