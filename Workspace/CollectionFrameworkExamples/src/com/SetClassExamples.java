package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
class A {}
public class SetClassExamples {

	public static void main(String[] args) {
	//1st Example 
//	HashSet hs = new HashSet();
//	int a=10;
//	Integer b = new Integer(a);
//	hs.add(b);
//	hs.add(20);	// auto-boxing :converting primitive to object. 
//	hs.add(10.20);
//	hs.add("Ravi");
//	hs.add(true);
//	hs.add(new A());
//	System.out.println(hs);
		// 2nd Example 
		//HashSet hs = new HashSet();
		//LinkedHashSet hs = new LinkedHashSet();
		TreeSet hs = new TreeSet();
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		hs.add(30);
		hs.add(10);
		hs.add(50);
		hs.add(30);
		hs.add(80);
		//hs.add(10.20);
		System.out.println(hs);
	}

}
