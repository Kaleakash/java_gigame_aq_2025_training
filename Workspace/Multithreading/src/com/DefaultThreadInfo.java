package com;

public class DefaultThreadInfo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("My Thread");
		t.setPriority(1);  // min 1 and max 10 
		System.out.println(t);
	}

}
