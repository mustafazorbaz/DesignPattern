package com.mustafazorbaz.chainofresponsibility;

import java.util.ArrayList;

public class CallCenter {
	private ArrayList<Operator> agents=new ArrayList<Operator>();
	public CallCenter() {
		Operator op1=new Operator("Mustafa");
		Operator op2=new Operator("Hakan");
		Operator op3=new Operator("Serkan");
		Operator op4=new Operator("Mehmet");
		Operator op5=new Operator("Abdulkadir");
		
		op1.setStatus(false);
		op2.setStatus(false);
		op3.setStatus(false);
		op4.setStatus(true);  //Mehmet uygun
		op5.setStatus(false);
		
		op1.setLastOperator(op2);
		op2.setLastOperator(op3);
		op3.setLastOperator(op4);
		op4.setLastOperator(op5);
		op5.setLastOperator(null);
		
		agents.add(op1);
		agents.add(op2);
		agents.add(op3);
		agents.add(op4);
		agents.add(op5);
	}
	public void getCall(){
		agents.get(0).callAnswer();
	}
}
