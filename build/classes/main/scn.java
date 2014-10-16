package main;

import java.util.Scanner;
import static main.gui.gui;

public class scn {
   
	public static void scan() throws InterruptedException  {
		
		glblVar.answer = (" ");
                
                glblVar.ifAnswer = false;
                
                scanCheck();
                
                
                
	}
        
        public static void scanCheck() throws InterruptedException {
                
                    
                if (glblVar.ifAnswer == true) {
                    
                    
                }
                else {
                    Thread.sleep(10);
                    scanCheck();
                    
                }
                
            }
}


