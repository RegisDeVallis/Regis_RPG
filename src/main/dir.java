package main;




public class dir {
	
	public static void directionN() throws Exception {
		//north
		glblVar.north = true;
		glblVar.south = false;
		glblVar.east = false;
		glblVar.west = false;
		
		glblVar.direction = "North";
		
		explr.exploreActions();
	}
	
	public static void directionS() throws Exception {
		//south
		glblVar.north = false;
		glblVar.south = true;
		glblVar.east = false;
		glblVar.west = false;
		
		glblVar.direction = "South";
		
		explr.exploreActions();
	}
	
	public static void directionE() throws Exception {
		//east
		glblVar.north = false;
		glblVar.south = false;
		glblVar.east = true;
		glblVar.west = false;
		
		glblVar.direction = "East";
		
		explr.exploreActions();
	}
	
	public static void directionW() throws Exception {
		//west
		glblVar.north = false;
		glblVar.south = false;
		glblVar.east = false;
		glblVar.west = true;
		
		glblVar.direction = "West";
		
		explr.exploreActions();
	}
	
}
