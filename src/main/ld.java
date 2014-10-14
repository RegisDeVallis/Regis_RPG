package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ld {
	
	
	public static void load() throws Exception {
		
		System.out.println("Loading. Please Wait.");
		
		for(int i = 1; i<101; i++) {
			System.out.println("Loading " + i +"%");
			
		}
		
		System.out.println("#####################");
		System.out.println("#                   #");
		System.out.println("#     Regis RPG     #");
		System.out.println("#                   #");
		System.out.println("#####################");
                
                System.out.println("Created by Regis_DeVallis");
                
                System.out.println("Version 0.0.0.1");
		
		mnu.startMenu();
	}
	
	public static void loadUser() throws IOException, Exception {
		
		System.out.println("What is the name of your save file?");
		scn.scan();
		
		glblVar.saveName = glblVar.answer;
		
		FileInputStream saveFile = new FileInputStream(glblVar.saveName + ".regisrpgsave");
		
		ObjectInputStream save = new ObjectInputStream(saveFile);
		
		glblVar.name = (String) save.readObject();
		glblVar.sex = (String) save.readObject();
		glblVar.money = (int) save.readObject();
		glblVar.health = (int) save.readObject();
		glblVar.age = (int) save.readObject();
		glblVar.level = (int) save.readObject();
		glblVar.xp = (int) save.readObject();
		glblVar.hunger = (int) save.readObject();
		glblVar.energy = (int) save.readObject();
		glblVar.damage = (int) save.readObject();
		glblVar.armor = (int) save.readObject();
		glblVar.town = (String) save.readObject();
		glblVar.inTown = (boolean) save.readObject();
		glblVar.north = (boolean) save.readObject();
		glblVar.south = (boolean) save.readObject();
		glblVar.east = (boolean) save.readObject();
		glblVar.west = (boolean) save.readObject();
		glblVar.answer = (String) save.readObject();
		glblVar.ranNum = (int) save.readObject();
		glblVar.ansterdell = (boolean) save.readObject();
		
		glblVar.shadowridge = (boolean) save.readObject();
		glblVar.highcrest = (boolean) save.readObject();
		glblVar.lochwell = (boolean) save.readObject();
		glblVar.FINDansterdell = (boolean) save.readObject();
		glblVar.FINDhighcrest = (boolean) save.readObject();
		glblVar.FINDlochwell = (boolean) save.readObject();
		glblVar.FINDshadowridge = (boolean) save.readObject();
		glblVar.food = (int) save.readObject();
		//glblVar = () save.readObject();
		
		mnu.Menu();
		
		
		
		
	}
}
