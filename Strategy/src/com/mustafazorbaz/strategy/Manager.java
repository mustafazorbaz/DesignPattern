package com.mustafazorbaz.strategy;

public class Manager implements Employee {
	int salary;
	String name;
	public Manager(int salary,String name) {
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
