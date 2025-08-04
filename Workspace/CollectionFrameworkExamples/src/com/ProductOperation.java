package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ProductOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> listOfproduct = new ArrayList<Product>();
		System.out.println("number of products are "+listOfproduct.size());
		listOfproduct.add(new Product(2, "TV", 56000));
		listOfproduct.add(new Product(1, "Computer", 36000));
		listOfproduct.add(new Product(3, "Laptop", 98000));
		System.out.println("number of products are "+listOfproduct.size());
		Iterator<Product> li = listOfproduct.iterator();
		System.out.println("Before sort");
		while(li.hasNext()) {
			Product p = li.next();
			System.out.println(p);  // call toString method 
//			if(p.getPid()==2) {
//				li.remove();
//			}
		}
		System.out.println("number of products are "+listOfproduct.size());
		
		//Collections.sort(listOfproduct);
		Collections.sort(listOfproduct, new ProductNameSortDesc());
		System.out.println("After sort");
		for(Product p :listOfproduct) {
			System.out.println(p);
		}
	}

}
