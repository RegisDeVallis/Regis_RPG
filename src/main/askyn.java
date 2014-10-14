/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Dalen
 */
public class askyn {
    
    public static void askYesNo() {
        
        String yesNoNum;
       
        System.out.println("1: Yes");
        System.out.println("2: No");
        
        Scanner scanYesNo = new Scanner(System.in);
		
	yesNoNum = scanYesNo.next();
        
        if (yesNoNum .equals ("1")) {
        
            glblVar.yesno = true;
    }
        else {
            glblVar.yesno = false;
        }
    }
    
    
    
    
    
}
