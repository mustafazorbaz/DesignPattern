package com.mustafazorbaz.strategy;

public class Technician implements Employee {
	int salary;
	String name;
	public Technician(int salary,String name) {
		this.salary=salary;
		this.name=name;
	}
	@Override
	public int calculateSalary() { 
		return salary;
	}

	@Override
	public String employeeName() { 
		return name;
	}

}
