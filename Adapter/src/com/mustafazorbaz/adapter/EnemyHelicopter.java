package com.mustafazorbaz.adapter;

import java.util.Random;

public class EnemyHelicopter {
	Random random = new Random();
	
	public void smashWithHands() {
		
		int attackDamage = random.nextInt(10) + 1;
		
		System.out.println("Enemy Helicopter Causes " + attackDamage + " Damage With Its Hands");
		
	}

	public void walkForward() {
		
		int movement = random.nextInt(5) + 1;
		
		System.out.println("Enemy Helicopter Walks Forward " + movement + " spaces");
		
	}

	public void reactToHuman(String driverName) {
		
		System.out.println("Enemy Helicopter Tramps on " + driverName);
		
	}
}
