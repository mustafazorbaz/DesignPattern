package com.mustafazorbaz.visitor;

public class ThreeGVisitor implements  IVisitor {

	@Override
	public void visit(Tablet tablet) {
		if (tablet instanceof IPad)  
			System.out.println("IPad wifi 3G bulunmamaktad�r...");
		else if(tablet instanceof GalaxyTab) 
			System.out.println("GalaxyTab  3G ye sahip a��ld�...");
		else
		    System.out.println("Bu nesne bir tablet de�il...");
	}

}
