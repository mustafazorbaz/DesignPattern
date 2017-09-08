package com.mustafazorbaz.strategy;

public class Client {

	public static void main(String[] args) {
		  Employee engineer=new Engineer(4200,"Mustafa ZORBAZ");
		  System.out.println("Maaþ : "+engineer.calculateSalary()+" Ýsim :"+engineer.employeeName());

		  Employee manager=new Manager(5400,"Hakan Tak");
		  System.out.println("Maaþ : "+manager.calculateSalary()+" Ýsim :"+manager.employeeName());

		  Employee technician=new Technician(3200,"Ýsmail Akbulut");
		  System.out.println("Maaþ : "+technician.calculateSalary()+" Ýsim :"+technician.employeeName());
	}

}
