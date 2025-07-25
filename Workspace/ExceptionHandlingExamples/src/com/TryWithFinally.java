package com;

public class TryWithFinally {
	public static void main(String[] args) {
		
		try {
			int a=100/0;
			System.out.println("no exception "+a);
		} finally {
			// TODO: handle finally clause
			System.out.println("finally block");
		}
		System.out.println("normal statement");
	}
}
