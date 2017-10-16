package com.mustafazorbaz.visitor;

public class WifiVisitor implements IVisitor  {

	@Override
	public void visit(Tablet tablet) {
		  if (tablet instanceof IPad)  
			System.out.println("IPad Wifi a��l�yor");
		  else if(tablet instanceof IPad) 
			System.out.println("GalaxyTab  Wifi bulunmamaktad�r...");
		  else
			  System.out.println("Bu nesne bir tablet de�il...");
			
		
	}
	
 
}
