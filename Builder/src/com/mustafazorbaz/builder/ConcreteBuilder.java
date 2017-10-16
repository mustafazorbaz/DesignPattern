package com.mustafazorbaz.builder;

public class ConcreteBuilder extends Builder{

	private Product product=new Product();
	
	@Override
	public void builderPart() {
		product.add("Par�a 1");
		product.add("Par�a 2");
		product.add("Par�a 3");
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
