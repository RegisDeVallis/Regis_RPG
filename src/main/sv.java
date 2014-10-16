package main;

import java.io.*;

public class sv {

	private static FileOutputStream saveFile;

	public static void save() throws Exception  {
		
		int savePcnt = 0;
		int saveTotal = 30;
		
		System.out.println("Saving.");
		System.out.println("This may take awhile.");
		System.out.println("Please be patient.");
		
		
		saveFile = new FileOutputStream(glblVar.saveName + ".regisrpgsave");
		
		ObjectOutputStream save = new ObjectOutputStream(saveFile);
		
		//29 
		//saves
		
		//save.writeObject(glblVar);
		
		save.writeObject(glblVar.name); savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.sex);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.money);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.health);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.age);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.level);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.xp);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.hunger);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.energy);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.attack);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.armor);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.town);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.inTown);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.north);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.south);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.east);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.west);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.answer);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.ranNum);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.ansterdell);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.shadowridge);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.lochwell);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.highcrest);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.FINDansterdell);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.FINDhighcrest);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.FINDlochwell);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.FINDshadowridge);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.food);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.saveName);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		save.writeObject(glblVar.direction);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");
		
		System.out.println("Saved!");
		
		mnu.Menu();
		
	}

}
