package main;

import java.util.Random;


public class rndm {
	
	

	public static void random(){
		
		
		
		Random ran = new Random();
		glblVar.ranNum = ran.nextInt(100);
		
	}
	
	public static void random10() {
		
		Random ran = new Random();
		glblVar.ranNum = ran.nextInt(100);
	}
}
