package com.mustafazorbaz.chainofresponsibility;

public class Test {

	public static void main(String[] args) {
		 //İstemci operatörleri,operatörler de iistemciyi tanımamaktadır.
		Client.openCall(new CallCenter());
	}

}
