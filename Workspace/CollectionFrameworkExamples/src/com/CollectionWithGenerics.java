package com;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithGenerics {

	public static void main(String[] args) {
	// Collection without Generic 
//	List ll = new ArrayList();
//	ll.add(10);
//	ll.add(10.10);
//	ll.add("ravi");
//	ll.add(true);
//	Object obj = ll.get(1);	// object return type
//	if(obj instanceof Integer) {
//	Integer i = (Integer)obj;	// type casting 
//	int n = i.intValue();		// converting object to primitive 
//	System.out.println(n);
//	}
//	if(obj instanceof Double) {
//		Double i = (Double)obj;	// type casting 
//		double n = i.doubleValue();		// converting object to primitive 
//		System.out.println(n);
//		}
		// Collection with Generics 
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		
		int n = ll.get(0);   // auto-unboxing : converting object to primitive 
		System.out.println(n);
		
		List<Object> ll1 = new ArrayList<Object>();
		ll1.add(10);
		ll1.add(10.10);
		ll1.add("Ravi");
		
	}

}
