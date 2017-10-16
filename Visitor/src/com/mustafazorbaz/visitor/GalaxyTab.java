package com.mustafazorbaz.visitor;

public class GalaxyTab extends Tablet{

	public GalaxyTab(String model, String brand) {
		super(model, brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
		
	}

}
