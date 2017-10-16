package com.mustafazorbaz.builder;

public class ConcreteBuilder2 extends Builder {
	private Product  product=new Product();
	
	@Override
	public void builderPart() {
		product.add("Par�a x");
		product.add("Par�a y");
		product.add("Par�a z");
	}

	@Override
	public Product getProduct() {
		return product;
	}
	

}
