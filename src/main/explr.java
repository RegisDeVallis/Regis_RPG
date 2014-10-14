package main;




public class explr {
	
	public static void explore() throws Exception {
		
		System.out.println("Do you want to explore?");
		System.out.println("1: Yes");
		System.out.println("2: No");
		scn.scan();
		
		if (glblVar.answer .equals("1") ) {
			glblVar.inTown = false;
		}
		else 
		{
			mnu.Menu();
		}
		
		
		System.out.println("Where would you like to explore?");
		System.out.println("1: North");
		System.out.println("2: South");
		System.out.println("3: East");
		System.out.println("4: West");
		
		scn.scan();
		
		//north
		if(glblVar.answer .equals("1")) {
			dir.directionN();
			
			
		}
		
		//south
		else if(glblVar.answer .equals("2")) {
			dir.directionS();
		}
		
		//east
		else if(glblVar.answer .equals("3")) {
			dir.directionE();
		}
		
		//west
		else if(glblVar.answer .equals("4")) {
			dir.directionW(); 
		}
		
		
	}

	

	public static void exploreActions() throws Exception {
		rndm.random();
		
		//goblin attack 0 - 25
		if (glblVar.ranNum < 25) {
			goblinAttack();
		}
		
		//small treasure 26 - 30
		if ((glblVar.ranNum > 26) && (glblVar.ranNum < 30)) {
			smallTreasure();
		}
		
		//large treasure 31
		if (glblVar.ranNum == 31) {
			largeTreasure();
		}
		
		//town find
		if ((glblVar.ranNum > 32) && (glblVar.ranNum < 35)) {
			findTown();
		}
		
		//nothing 36 - 75
		if ((glblVar.ranNum > 36) && (glblVar.ranNum < 76)) {
			nothing();
		}
		
		//scraps of food 76 - 85
		if ((glblVar.ranNum > 76) && (glblVar.ranNum < 85)) {
			findFood();
		}
		
		//item find
		if ((glblVar.ranNum > 86) && (glblVar.ranNum < 100)) {
			findItem();
		}
		
	}



	private static void findItem() throws Exception {
		// TODO Auto-generated method stub
		mnu.Menu();
	}



	private static void findFood() throws Exception {
		glblVar.food = glblVar.food + glblVar.ranNum;
		System.out.println("You found food!");
		System.out.println("You now have " + glblVar.food + " food in your bag.");
		
		mnu.Menu();
		
	}



	private static void nothing() throws Exception {
		glblVar.xp = glblVar.xp + glblVar.ranNum;
		System.out.println("You found nothing.");
		System.out.println("You have recived " + glblVar.ranNum + " xp.");
		System.out.println("Your total xp is " + glblVar.xp + ".");
		
		mnu.Menu();
		
	}

	private static void findTown() throws Exception {
		if((glblVar.north = true) && (glblVar.FINDansterdell = false)) {
			System.out.println("You found a town!");
			twn.townAnsterdell();
		}
		else if((glblVar.south = true) && (glblVar.FINDhighcrest = false)) {
			System.out.println("You found a town!");
			twn.townHighcrest();
		}
		else if((glblVar.east = true) && (glblVar.FINDlochwell = false)) {
			System.out.println("You found a town!");
			twn.townLochwell();
		}
		else if((glblVar.west = true) && (glblVar.FINDshadowridge = false)) {
			System.out.println("You found a town!");
			twn.townShadowridge();
		}
		else {
			exploreActions();
		}
		
	}

	private static void largeTreasure() throws Exception {
		glblVar.money = glblVar.money + (glblVar.ranNum * 10);
		
		System.out.println("You found a small treasure!");
		System.out.println("You now have " + glblVar.money + " coins in your bag.");
		
		mnu.Menu();
	}

	private static void smallTreasure() throws Exception {
		glblVar.money = glblVar.money + glblVar.ranNum;
		
		System.out.println("You found a large treasure!");
		System.out.println("You now have " + glblVar.money + " coins in your bag");
		
		mnu.Menu();
	}

	private static void goblinAttack() throws Exception {
		glblVar.enemyName = "Goblin";
		
		atk.attack();
		
	}
	
	
}
