package main;




public class et {
	
	public static void eat() throws Exception {
		
		System.out.println("Your hunger is " + glblVar.hunger + ".");
		System.out.println("Are you sure you want to eat?");
		System.out.println("1: Yes");
		System.out.println("2: No");
		
		scn.scan();
		
		if(glblVar.answer .equals("1")) {
			glblVar.hunger = glblVar.hunger + glblVar.food;
			
			if(glblVar.hunger > 100) {
				glblVar.food = glblVar.hunger - 100;
				glblVar.hunger = glblVar.hunger - glblVar.food;
				
				System.out.println("You ate your food. You now have " + glblVar.food + " food left.");
			}
			
			else {
				System.out.println("You ate all you food. You have 0 food left and your hunger is " + glblVar.hunger + ".");
			}
		}
		
		else if(glblVar.answer .equals("2")) {
			mnu.Menu();
		}
		
		
	}

}
