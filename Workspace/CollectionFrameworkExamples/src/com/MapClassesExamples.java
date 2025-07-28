package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapClassesExamples {

	public static void main(String[] args) {
		//HashMap hm = new HashMap();			// unorder 
		//LinkedHashMap hm = new LinkedHashMap();	// order 
		///TreeMap hm = new TreeMap();			// asc as key
		Hashtable hm = new Hashtable();
		hm.put(2, "Ravi");
		hm.put(1, "Ramesh");
		hm.put(3, "Raj");
		hm.put(5, "Raju");
		System.out.println(hm);
		hm.put(3, "Vikash");
		hm.put("a", "b");
		if(hm.containsKey(1)) {
			System.out.println("present");
		}else {
			System.out.println("not present");
		}
		hm.put(6, "Ravi");
		System.out.println(hm);
	}

}
