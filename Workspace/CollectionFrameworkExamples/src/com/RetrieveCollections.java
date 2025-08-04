package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class RetrieveCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set Family 
		Set<Integer> ss = new HashSet<Integer>();
		ss.add(10);ss.add(20);ss.add(30);ss.add(40);
		System.out.println(ss);
		System.out.println("using for each loop");
		for(int n:ss) {
			System.out.println(n);
		}
		System.out.println("using for Iterator");
		Iterator<Integer> li = ss.iterator();
		while(li.hasNext()) {
			int n = li.next();
			if(n==20) {
				li.remove();
			}
			System.out.println(n);
		}
		System.out.println(ss);
		//List family 
		List<String> names = new LinkedList<String>();
		names.add("Raj");names.add("Ravi");names.add("Raju");names.add("Ramesh");
		ListIterator<String> li1 = names.listIterator();
		System.out.println("forward direction ");
		while(li1.hasNext()) {
			String name = li1.next();
			System.out.println(name);
		}
		System.out.println("backward direction ");
		while(li1.hasPrevious()) {
			String name = li1.previous();
			System.out.println(name);
		}
		
		Map<Integer, String> mm = new HashMap<Integer, String>();
		mm.put(1, "Ravi");
		mm.put(2, "Raju");
		Set<Integer> keyset = mm.keySet();	// store map key in set 
		Iterator<Integer> li2 = keyset.iterator();
		while(li2.hasNext()){
			int key = li2.next();
			System.out.println("key "+key+" value "+mm.get(key));
		}
		 
	}

}
