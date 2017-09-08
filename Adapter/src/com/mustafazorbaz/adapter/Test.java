package com.mustafazorbaz.adapter;

public class Test {

	public static void main(String[] args) {
EnemyTank rx7Tank = new EnemyTank();
		
		//Bu class ilk olu�turulurken  EnemyAttacker interface'inden implement edilerek olu�turulan s�n�f.
		EnemyTank altayTank=new EnemyTank();
		
		//Bu class interface'ten implement olmay�p normal olu�turulan bir nesne
		EnemyHelicopter atakHelicopter=new EnemyHelicopter();
		
		
		EnemyAttacker atakHelicopterAdapter = new EnemyHelicopterAdapter(atakHelicopter);
		
		System.out.println("Tank");
		
		altayTank.assignDriver("Uzm. �avu� Hakan Tatl�");
		altayTank.driveForward();
		altayTank.fireWeapon();
		System.out.println();
		
		System.out.println("Helicopter");

		atakHelicopter.reactToHuman("Aste�men Mustafa ZORBAZ");
		atakHelicopter.walkForward();
		atakHelicopter.smashWithHands();
		System.out.println();
		
		System.out.println("Helicopter Adapter");		 
		atakHelicopterAdapter.assignDriver("Y�zba�� �smail Ak");
		atakHelicopterAdapter.driveForward();
		atakHelicopterAdapter.fireWeapon();
	}

}
