package main;




public class mnu {
	
	public static void startMenu() throws Exception {
			
			System.out.println("Welcome!");
			System.out.println("1: Load");
			System.out.println("2: New");
			System.out.println("3: Exit");
			
			
			scn.scan();
			
			
			 if(glblVar.answer .equals("1")) {
				 ld.loadUser();
			 }
			 
			 if(glblVar.answer .equals("2")) {
				crt.createUser(); 
			 }
			 
			 if(glblVar.answer .equals("3")) {
				 ext.exit();
				 
			 }
			
		}

	public static void Menu() throws Exception {
		
		//level check
		if((glblVar.level * 200) == glblVar.xp) {
			glblVar.level++;
			System.out.println("You went up a level!");
			System.out.println("You are at level " + glblVar.level + "!");
		}
		
		glblVar.answer = "0";
				
		System.out.println("What do you want to do?");
		System.out.println("1: Sleep");
		System.out.println("2: Work");
		System.out.println("3: Eat");
		System.out.println("4: Explore");
		System.out.println("5: Travel");
		System.out.println("6: Quests");
		System.out.println("7: Store");
		System.out.println("8: Bag");
		System.out.println("9: Stats");
		System.out.println("S: Save");
		System.out.println("Q: Quit");
		
		
		
		scn.scan();
		
		//sleep
		if(glblVar.answer .equals("1")) {
			slp.sleep();
		}
		
		//work
		if(glblVar.answer .equals("2")) {
			wrk.work();
		}
		
		//eat
		if(glblVar.answer .equals("3")) {
			et.eat();
		}
		
		//explore
		if(glblVar.answer .equals("4")) {
			explr.explore();
		}
		
		//travel
		if(glblVar.answer .equals("5")) {
			trvl.travelAsk();
		}
		
		//quests
		if(glblVar.answer .equals("6")) {
			qst.quests();
		}
		
		//store
		if(glblVar.answer .equals("7")) {
			str.store();
		}
		
		//bag
		if(glblVar.answer .equals("8")) {
			bg.bag();
		}
		
		//stats
		if(glblVar.answer .equals("9")) {
			stt.stats();
		}
		
		//save 
		if(glblVar.answer .equals("s")) {
			sv.save();
                        mnu.Menu();
		}
		
		//quit
		if(glblVar.answer .equals("q")) {
			ext.exit();
		}
	}
}
