package com.mustafazorbaz.builder;

import java.util.ArrayList;

public class Product {
	private ArrayList<String>  arrayList=new ArrayList<String>();
	
	public void add(String part) {
		arrayList.add(part);
	}

	@Override
	public String toString() {
		return "Product [arrayList=" + arrayList + "]";
	}
	

}
