package com.mustafazorbaz.adapter;

public class EnemyHelicopterAdapter implements EnemyAttacker {

	EnemyHelicopter theHelicopter;
	
	public EnemyHelicopterAdapter(EnemyHelicopter newHelicopter){
		this.theHelicopter = newHelicopter;
	}
	@Override
	public void fireWeapon() {
		theHelicopter.smashWithHands();
		
	}

	@Override
	public void driveForward() {
		theHelicopter.walkForward();
		
	}

	@Override
	public void assignDriver(String driverName) {
		theHelicopter.reactToHuman(driverName);
		
	}

}
