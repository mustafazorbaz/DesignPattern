package com.mustafazorbaz.strategy;

public class Engineer implements Employee {
	int salary;
	String name;
	public Engineer(int salary,String name) {
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
