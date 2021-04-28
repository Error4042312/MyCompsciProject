//package com.tutorialspoint.gui;

//import javax.swing.JFrame;
//import javax.swing.ImageIcon;
//import javax.swing.JLabel;

//import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Main {
  public static void main(String args[]) {
    JFrame s = new JFrame();
    //ImageIcon icon = new ImageIcon("imgs/DumplingSoup.jpg");
   // JLabel label = new JLabel(icon);
    //frame.add(label);
    JButton okButton = new JButton("OK");
    okButton.setBounds(80, 100, 250, 40);
    s.add(okButton);
    s.setSize(400, 500);
    s.setLayout(null);
   
    //s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //s.pack(); 
    s.setVisible(true);

    //new TitleScreen();
  }
}
