package com.mustafazorbaz.singleton;

public class Test {

	public static void main(String[] args) {
		 Sample obj1=Sample.CreateObject();
		 Sample obj2=Sample.CreateObject();
		 Sample obj3=Sample.CreateObject();

		 obj1.setData(305410);
		 System.out.println("Obj1.data ="+obj1.getData());
		 System.out.println("Obj2.data ="+obj2.getData());
		 System.out.println("Obj3.data ="+obj3.getData());
		 
		 System.out.println("-------------------------------");
		 
		 obj1.setData(30000);
		 System.out.println("Obj1.data ="+obj1.getData());
		 System.out.println("Obj2.data ="+obj2.getData());
		 System.out.println("Obj3.data ="+obj3.getData());
	}

}
