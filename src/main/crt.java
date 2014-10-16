package main;

import java.util.Scanner;

public class crt {
	
	public static void createUser() throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What do you want to name your save?");
		
		scn.scan();
		
		glblVar.saveName = glblVar.answer;
		
		System.out.println("What is your name?");
		
		glblVar.name = glblVar.answer;

		System.out.println("What is your age?");
		
		glblVar.age = glblVar.answer;
		
		System.out.println("Are you male or female?");
		System.out.println("1: Male");
		System.out.println("2: Female");
		
		scn.scan();
		
		if(glblVar.answer .equals("1")) {
			glblVar.sex = "male";
		}
		else {
			glblVar.sex = "female";
		}
		
		System.out.println("Welcome to Earth!");
		System.out.println("Your name is " + glblVar.name + ".");
		System.out.println("You are a " + glblVar.sex + ".");
		System.out.println("You are " + glblVar.age + " years old.");
		System.out.println("The year is 1506");
		System.out.println("You are in your hometown of Ansterdell");
		
		glblVar.money = 100;
		glblVar.health = 100;
		glblVar.level = 1;
		glblVar.xp = 0;
		glblVar.attack = 10;
		glblVar.armor = 10;
		glblVar.hunger = 100;
		glblVar.food = 50;
		glblVar.FINDansterdell = true;
		glblVar.FINDhighcrest = false;
		glblVar.FINDlochwell = false;
		glblVar.FINDshadowridge = false;
		twn.townAnsterdell();
		
		
		
		
		
	}

}
