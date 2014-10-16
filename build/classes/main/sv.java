package main;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.*;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.border.TitledBorder;

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
		
		//30 
		//saves
		
		//save.writeObject(glblVar);
                
                JFrame f = new JFrame("Saaving");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Container content = f.getContentPane();
                JProgressBar progressBar = new JProgressBar();
                progressBar.setValue(savePcnt / saveTotal); 
                progressBar.setStringPainted(true);
                TitledBorder border = BorderFactory.createTitledBorder("Saving...");
                progressBar.setBorder(border);
                content.add(progressBar, BorderLayout.NORTH);
                f.setSize(300, 100);
                f.setVisible(true);
		
		save.writeObject(glblVar.name); savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts."); progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.sex);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.money);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.health);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.age);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.level);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.xp);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.hunger);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.energy);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.attack);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.armor);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.town);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.inTown);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.north);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.south);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.east);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.west);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.answer);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.ranNum);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.ansterdell);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.shadowridge);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.lochwell);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.highcrest);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.FINDansterdell);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.FINDhighcrest);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.FINDlochwell);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.FINDshadowridge);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.food);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.saveName);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		save.writeObject(glblVar.direction);savePcnt++;
		System.out.println("Saving " + savePcnt + "/" + saveTotal + " obejcts.");progressBar.setValue(savePcnt / saveTotal); progressBar.updateUI();Thread.sleep(10);
		
		System.out.println("Saved!");
                
                f.dispose();
		
		mnu.Menu();
		
	}

}
