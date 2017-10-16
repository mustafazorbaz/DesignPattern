package com.mustafazorbaz.builder;

public class ConcreteBuilder2 extends Builder {
	private Product  product=new Product();
	
	@Override
	public void builderPart() {
		product.add("Parça x");
		product.add("Parça y");
		product.add("Parça z");
	}

	@Override
	public Product getProduct() {
		return product;
	}
	

}
