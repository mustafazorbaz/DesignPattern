package com.mustafazorbaz.visitor;

public class IPad  extends Tablet{

	public IPad(String model, String brand) {
		super(model, brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(IVisitor visitor) {
 		visitor.visit(this);
	}

}
