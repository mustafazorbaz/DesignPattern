package com.mustafazorbaz.builder;

public class ConcreteBuilder extends Builder{

	private Product product=new Product();
	
	@Override
	public void builderPart() {
		product.add("Parça 1");
		product.add("Parça 2");
		product.add("Parça 3");
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
