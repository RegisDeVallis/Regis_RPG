package main;

import javax.swing.JFrame;
import asciiPanel.AsciiPanel;
 
public class terminal extends JFrame {
    private static final long serialVersionUID = 1060623638149583738L;
 
    private AsciiPanel terminal;
 
    public terminal(){
        super();
        terminal = new AsciiPanel();
        terminal.write(glblVar.say, 1, 1);
        add(terminal);
        pack();
    }

	public static void terminalSay() {
		
	}

	
 
    
}
