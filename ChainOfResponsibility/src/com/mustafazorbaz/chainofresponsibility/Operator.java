package com.mustafazorbaz.chainofresponsibility;

public class Operator {
		private boolean status;
		private String name;
		private Operator lastOperator;
		
		public Operator(String name) {
		   this.name=name;
		}
		public void callAnswer() {
			if (status) {
				//Cevapla
				System.out.println(name+"�a�r� cevapland�...");				
			}else if(lastOperator!=null){
				//Sonrakine �let
				lastOperator.callAnswer();
			}
			else
				System.out.println("�a�r� beklemede...");
		
		}
		public boolean isStatus() {
			return status;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Operator getLastOperator() {
			return lastOperator;
		}
		public void setLastOperator(Operator lastOperator) {
			this.lastOperator = lastOperator;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		
}
