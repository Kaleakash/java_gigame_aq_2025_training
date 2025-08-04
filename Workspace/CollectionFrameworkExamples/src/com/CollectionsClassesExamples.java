package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassesExamples {

	public static void main(String[] args) {
	List<String> names = new ArrayList<String>();
	names.add("mahesh");
	names.add("vikash");
	names.add("ajay");
	System.out.println("Before sort");
	for(String name:names) {
		System.out.print(name+" ");
	}
		Collections.sort(names);
	System.out.println();
	System.out.println("After sort - Asc");
	for(String name:names) {
		System.out.print(name+" ");
	}
	Collections.reverse(names);
	System.out.println("After sort - Desc");
	for(String name:names) {
		System.out.print(name+" ");
	}
	}

}
