package com.mustafazorbaz.adapter;

public class Test {

	public static void main(String[] args) {
EnemyTank rx7Tank = new EnemyTank();
		
		//Bu class ilk oluþturulurken  EnemyAttacker interface'inden implement edilerek oluþturulan sýnýf.
		EnemyTank altayTank=new EnemyTank();
		
		//Bu class interface'ten implement olmayýp normal oluþturulan bir nesne
		EnemyHelicopter atakHelicopter=new EnemyHelicopter();
		
		
		EnemyAttacker atakHelicopterAdapter = new EnemyHelicopterAdapter(atakHelicopter);
		
		System.out.println("Tank");
		
		altayTank.assignDriver("Uzm. Çavuþ Hakan Tatlý");
		altayTank.driveForward();
		altayTank.fireWeapon();
		System.out.println();
		
		System.out.println("Helicopter");

		atakHelicopter.reactToHuman("Asteðmen Mustafa ZORBAZ");
		atakHelicopter.walkForward();
		atakHelicopter.smashWithHands();
		System.out.println();
		
		System.out.println("Helicopter Adapter");		 
		atakHelicopterAdapter.assignDriver("Yüzbaþý Ýsmail Ak");
		atakHelicopterAdapter.driveForward();
		atakHelicopterAdapter.fireWeapon();
	}

}
