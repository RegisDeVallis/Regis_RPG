package main;


public class wrk {
	
	public static void work() throws Exception {
		
		
		
		System.out.println("You look around " + glblVar.town + " for a job.");
		
		rndm.random10();
		
		if (glblVar.ranNum == 1) {
			workAction();
		}
		else {
			System.out.println("You cannot find a job in town " + glblVar.town + ".");
			mnu.Menu();
		}
		
	}

	private static void workAction() throws Exception {
		
		int hour = glblVar.ranNum;
		int ppHour = glblVar.level * 7;
		int total$Job = ppHour * hour;
		
		System.out.println("You find a job and work for " + hour + " hours making $" + ppHour + " per hour.");
		System.out.println(" You get $" + total$Job + ".");
		
		glblVar.money = glblVar.money + total$Job;
		
		System.out.println("Your total amount of coins is $" + glblVar.money + ".");
		
		mnu.Menu();
		
	}
}
