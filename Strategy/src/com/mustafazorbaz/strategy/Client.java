package com.mustafazorbaz.strategy;

public class Client {

	public static void main(String[] args) {
		  Employee engineer=new Engineer(4200,"Mustafa ZORBAZ");
		  System.out.println("Maa� : "+engineer.calculateSalary()+" �sim :"+engineer.employeeName());

		  Employee manager=new Manager(5400,"Hakan Tak");
		  System.out.println("Maa� : "+manager.calculateSalary()+" �sim :"+manager.employeeName());

		  Employee technician=new Technician(3200,"�smail Akbulut");
		  System.out.println("Maa� : "+technician.calculateSalary()+" �sim :"+technician.employeeName());
	}

}
