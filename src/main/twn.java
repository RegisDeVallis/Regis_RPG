package main;




public class twn {

	//north
	public static void townAnsterdell() throws Exception {
		glblVar.ansterdell = true;
		glblVar.shadowridge = false;
		glblVar.highcrest = false;
		glblVar.lochwell = false;
		glblVar.inTown = true;
		glblVar.town = "Ansterdell";
		
		mnu.Menu();
		
	}
	
	//west
	public static void townShadowridge() throws Exception {
		glblVar.ansterdell = false;
		glblVar.shadowridge = true;
		glblVar.highcrest = false;
		glblVar.lochwell = false;
		glblVar.inTown = true;
		glblVar.town = "Shadowridge";
		
		mnu.Menu();
		
	}
	
	//south
	public static void townHighcrest() throws Exception {
		glblVar.ansterdell = false;
		glblVar.shadowridge = false;
		glblVar.highcrest = true;
		glblVar.lochwell = false;
		glblVar.inTown = true;
		glblVar.town = "Highcrest";
		
		mnu.Menu();
		
	}
	
	//east
	public static void townLochwell() throws Exception {
		glblVar.ansterdell = false;
		glblVar.shadowridge = false;
		glblVar.highcrest = false;
		glblVar.lochwell = true;
		glblVar.inTown = true;
		glblVar.town = "Lochwell";
		
		mnu.Menu();
		
	}

}
