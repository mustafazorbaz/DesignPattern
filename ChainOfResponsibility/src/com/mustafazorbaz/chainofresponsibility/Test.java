package com.mustafazorbaz.chainofresponsibility;

public class Test {

	public static void main(String[] args) {
		 //�stemci operat�rleri,operat�rler de iistemciyi tan�mamaktad�r.
		Client.openCall(new CallCenter());
	}

}
