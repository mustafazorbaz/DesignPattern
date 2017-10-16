package com.mustafazorbaz.chainofresponsibility;

public class Test {

	public static void main(String[] args) {
		 //Ýstemci operatörleri,operatörler de iistemciyi tanýmamaktadýr.
		Client.openCall(new CallCenter());
	}

}
