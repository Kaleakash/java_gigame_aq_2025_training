package com;

import java.util.Comparator;

public class ProductNameSortDesc implements Comparator<Product>{
	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o2.getPname().compareTo(o1.getPname());
	}

}
