/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.text.DefaultCaret;



/**
 *
 * @author Dalen
 */
public class gui {
    
    public static void gui() {
        
        JFrame frame = new JFrame("Regis RPG");
        JLabel title = new JLabel("Regis RPG");
        JTextArea console = new JTextArea();
        JTextField usrInput = new JTextField();
        JButton enter = new JButton("Enter");
        JLabel healthDisp = new JLabel("Health: " + glblVar.health);
        JLabel moneyDisp = new JLabel("Money: $" + glblVar.money);
        JLabel levelDisp = new JLabel("Level: " + glblVar.level);
        JLabel xpDisp = new JLabel("xp: " + glblVar.xp);
        JScrollPane scroll = new JScrollPane(console);
        JPanel outerPanel = new JPanel(new BorderLayout());
        JPanel topPanel = new JPanel(new BorderLayout());
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        
        TextAreaOutputStream taos = TextAreaOutputStream.getInstance(console);
        
        frame.add(outerPanel);
        
        outerPanel.add(topPanel, BorderLayout.BEFORE_FIRST_LINE);
        outerPanel.add(mainPanel, BorderLayout.CENTER);
        
        topPanel.add(title, BorderLayout.BEFORE_LINE_BEGINS);
        topPanel.setSize(600, 25);
        
        
        mainPanel.add(scroll, BorderLayout.CENTER);
        scroll.setSize(400, 400);
        
        
        
        //frame.getContentPane().add(console); 
        //frame.getContentPane().add(scroll);
        //frame.getContentPane().add(usrInput); 
        //frame.getContentPane().add(enter); 
        //frame.getContentPane().add(healthDisp); 
        //frame.getContentPane().add(moneyDisp); 
        //frame.getContentPane().add(levelDisp); 
        //frame.getContentPane().add(xpDisp);  
        
        frame.pack();
        frame.setSize(600, 400);
        console.setEditable(false);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        frame.show();
        
        DefaultCaret autoscroll = (DefaultCaret)console.getCaret();
        autoscroll.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        
    }
    
}
