package com;

import java.util.Arrays;

public class ArraysClassExample {

	public static void main(String[] args) {
		int num[]= {3,1,4,7,6,5,9,8};
		System.out.println("Before sort");
		for(int n:num) {
			System.out.print(n+" ");
		}
		System.out.println();
		Arrays.sort(num);   // asc order 
		System.out.println();
		System.out.println("After sort");
		for(int n:num) {
			System.out.print(n+" ");
		}
		
	}

}
