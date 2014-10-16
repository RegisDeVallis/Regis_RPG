package main;




public class stt {
	
	public static void stats() throws Exception {
		
		//health
		System.out.println("Your health is " + glblVar.health + ".");
		
		//age
		System.out.println("Your age is " + glblVar.age + ".");
		
		//money
		System.out.println("You have $" + glblVar.money + ".");
		
		//hunger
		System.out.println("Your hunger is " + glblVar.hunger + ".");
		
		//food
		System.out.println("You have " + glblVar.food + " food left.");
		
		//level
		System.out.println("Your level is " + glblVar.level + ".");
		
		//xp 
		System.out.println("Your xp is " + glblVar.xp + ".");
		
		//sleep
		System.out.println("Your energy is " + glblVar.energy + ".");
		
		//location
		if (glblVar.inTown = true) {
			System.out.println("Your location is " + glblVar.town + ".");
		}
		else {
			System.out.println("You are in the " + glblVar.direction + " woods.");
		}
		
		
		//strength
		System.out.println("Your attack is " + glblVar.attack + ".");
		
		//armor
		System.out.println("Your armor is " + glblVar.armor + ".");
		
		mnu.Menu();
	}

}
