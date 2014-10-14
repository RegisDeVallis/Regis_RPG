package main;




public class atk {
	
	public static void attack() throws Exception {
		System.out.println("You are under attack!");
		System.out.println("You are being attacked by a level " + glblVar.enemyLevel + ".");
		System.out.println("The " + glblVar.enemyName + " has " + glblVar.enemyHealth + " health, and has " + glblVar.enemyDamage + " maxinum damage.");
		
		if((glblVar.playerStats / glblVar.enemyDamage) > (glblVar.enemyStats / glblVar.damage)) {
			
			System.out.println("You win the fight!");
			
			//health after fight
			glblVar.health = glblVar.health - (glblVar.playerStats / glblVar.enemyDamage);
			
			System.out.println("Your health is" + glblVar.health + ".");
			
			mnu.Menu();
		}
		
		else {
			System.out.println("You died");
		}
	}

}
