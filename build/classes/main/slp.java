package main;




public class slp {
	
	public static void sleep() throws Exception {
		
		if (glblVar.inTown = true) {
			
			System.out.println("You go to the inn.");
			System.out.println("It costs 75 coins to stay the night.");
			System.out.println("Would you like to stay the night?");
			
                        askyn.askYesNo();
			
			if (glblVar.answer .equals("1")) {
				System.out.println("You stay the night.");
				System.out.println("Your health is restored by 25 points.");
				
				glblVar.health = glblVar.health + 25;
				
				//health check
				if (glblVar.health > 100) {
					glblVar.health = 100;
				}
				
				System.out.println("Your health is " + glblVar.health + ".");
				
				mnu.Menu();
			}
			
			else {
				mnu.Menu();
			}
		}
		
		else {
			System.out.println("You need to be in a town to sleep.");
			mnu.Menu();
		}
		
		
		
	}

}
