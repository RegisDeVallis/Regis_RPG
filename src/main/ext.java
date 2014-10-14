package main;


public class ext {
	
	public static void exit() throws Exception {
            
            System.out.println("Do you want to save?");
            
            askyn.askYesNo();
            
            if (glblVar.yesno = true) {
                
                mnu.Menu();
                
            }
            
            else {
                
            System.out.println("Exiting the program");
            System.out.println("Exited!");
		 
	    System.exit(0);
            }
		
            
	}

}
