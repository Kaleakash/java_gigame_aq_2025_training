package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class ListClassesExample {

	public static void main(String[] args) {
		//1st Example 
//		ArrayList al = new ArrayList();
//		al.add(10);
//		al.add(20);
//		al.add(30);
//		System.out.println(al);
//		System.out.println(al.get(1));
//			al.add(1, 100);
//		System.out.println(al);
//		al.remove(1);		// remove using index
//		System.out.println(al);
//		Integer val = 20;		// auto-boxing 
//		al.remove(val);
//		System.out.println(al);
//		//2nd example 
//		
//		LinkedList ll = new LinkedList();
//		ll.add(100);
//		ll.add(200);
//		ll.add(300);
//		ll.add(1, 1000);
//		System.out.println(ll);
//		ll.addFirst(200);
		// 3rd example 
		
		
		Stack ss = new Stack();
		ss.push(100);
		ss.push(200);
		ss.push(300);
		System.out.println(ss);
		System.out.println("Pop operation "+ss.pop());
		System.out.println(ss);
		System.out.println("Peek operation "+ss.peek());
		System.out.println(ss);
		System.out.println("search "+ss.search(200));
		System.out.println("search "+ss.search(1000));
	}

}
