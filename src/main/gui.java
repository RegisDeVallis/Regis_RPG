/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import javax.swing.*;
import javax.swing.text.DefaultCaret;



/**
 *
 * @author Dalen
 */
public class gui {
    
    public static void gui() {
        
        JFrame jframe = new JFrame("Regis RPG");
        JTextArea console = new JTextArea();
        JTextField usrInput = new JTextField();
        JButton enter = new JButton("Enter");
        JLabel healthDisp = new JLabel("Health: " + glblVar.health);
        JLabel moneyDisp = new JLabel("Money: $" + glblVar.money);
        JLabel levelDisp = new JLabel("Level: " + glblVar.level);
        JLabel xpDisp = new JLabel("xp: " + glblVar.xp);
        JScrollPane scroll = new JScrollPane(console);
        
        TextAreaOutputStream taos = TextAreaOutputStream.getInstance(console); 
        
        jframe.getContentPane().add(console); 
        //jframe.getContentPane().add(scroll);
        //jframe.getContentPane().add(usrInput); 
        //jframe.getContentPane().add(enter); 
        //jframe.getContentPane().add(healthDisp); 
        //jframe.getContentPane().add(moneyDisp); 
        //jframe.getContentPane().add(levelDisp); 
        //jframe.getContentPane().add(xpDisp);  
        
        jframe.pack();  
        jframe.show();
        
        DefaultCaret autoscroll = (DefaultCaret)console.getCaret();
        autoscroll.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        
    }
    
}
