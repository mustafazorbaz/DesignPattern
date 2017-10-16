package com.mustafazorbaz.builder;

public class Test {
	 public static void main(String[] args) {
		Builder builder=new ConcreteBuilder();
		Director.constructor(builder);
		Product p1=builder.getProduct();
		System.out.println(p1.toString());
		
		Builder builder2=new ConcreteBuilder2();
		Director.constructor(builder2);
		Product p2=builder2.getProduct();
		System.out.println(p2.toString());
		
	}
}
