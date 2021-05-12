 //package com.tutorialspoint.gui;

//import javax.swing.JFrame;
//import javax.swing.ImageIcon;
//import javax.swing.JLabel;

//import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Main {
  public static void main(String args[]) {
    JFrame first = new JFrame(); 
    JFrame second = new JFrame();
    JFrame thirdRegion1 = new JFrame();
    JFrame thirdRegion2 = new JFrame();
    JFrame thirdRegion3 = new JFrame();
    JFrame thirdRegion4 = new JFrame();

    //frame containing ingredients
    JFrame thirdRegion2Ing = new JFrame();

      
    //new button  
    JButton title = new JButton("Recipe Book");
    JButton titleToNext = new JButton("Click to Browse Regions!");
    JButton region1 = new JButton("South Korea");
    JButton region2 = new JButton("United States");
    JButton region3 = new JButton("Mexico");
    JButton region4 = new JButton("Canada");
   
    //setting up the dimensions for the buttons
    titleToNext.setBounds(105, 350, 250, 40);
    title.setBounds(80, 100, 300, 50);
    region1.setBounds(40, 100, 200, 40);
    region2.setBounds(350, 100, 200, 40);
    region3.setBounds(40, 250, 200, 40);
    region4.setBounds(350, 250, 200, 40);
    first.setVisible(true);
    second.setVisible(false);
    thirdRegion1.setVisible(false);
    thirdRegion2.setVisible(false);
    thirdRegion3.setVisible(false);
    thirdRegion4.setVisible(false);

    thirdRegion2Ing.setVisible(false);
    //event listener
    titleToNext.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        //System.out.println("Hello world!");
        first.setVisible(false);
        second.setVisible(true);
      }
    });

    region1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        second.setVisible(false);
        thirdRegion1.setVisible(true);
      }
    });

    region2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        second.setVisible(false);
        thirdRegion2.setVisible(true);
      }
    });

    region3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        second.setVisible(false);
        thirdRegion3.setVisible(true);
      }
    });

    region4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        second.setVisible(false);
        thirdRegion4.setVisible(true);
      }
    });
 
    first.add(title);
    first.add(titleToNext);
    first.setSize(450, 500);
    first.setLayout(null);

    second.add(region1);
    second.add(region2);
    second.add(region3);
    second.add(region4);
    second.setSize(600, 500);
    second.setLayout(null);

    ImageIcon icon = new ImageIcon("imgs/DumplingSoup.jpg");
    JLabel label = new JLabel(icon);
    thirdRegion1.add(label);
    //thirdRegion1.setSize(600, 500);
    thirdRegion1.pack();
    thirdRegion1.setLayout(null);

    ImageIcon icon2 = new ImageIcon("imgs/CheeseburgerFinal.jpg");
    JLabel label2 = new JLabel(icon2);
    thirdRegion2.add(label2);
    thirdRegion2.pack();
    thirdRegion2.setLayout(null);

    ImageIcon icon3 = new ImageIcon("imgs/Tacos.jpg");
    JLabel label3 = new JLabel(icon3);
    thirdRegion3.add(label3);
    //thirdRegion3.setSize(600, 500);
    thirdRegion3.pack();
    thirdRegion3.setLayout(null);

    ImageIcon icon4 = new ImageIcon("imgs/Poutine.jpg");
    JLabel label4 = new JLabel(icon4);
    thirdRegion4.add(label4);
    //thirdRegion4.setSize(600, 500);
    thirdRegion4.pack();
    thirdRegion4.setLayout(null);
   
   /* ImageIcon icon = new ImageIcon("imgs/DumplingSoup.jpg");
    ImageIcon icon2 = new ImageIcon("imgs/Cheeseburger.jpg");
    JLabel label = new JLabel(icon);
    JLabel label2 = new JLabel(icon2);
    c.add(label);
    f.add(label2); */


   //private class ButtonClickListener implements ActionListener{
      //public void actionPerformed(ActionEvent e) {
       //  String command = e.getActionCommand();  
         
       //  if( command.equals( "OK" ))  {
        //    statusLabel.setText("Ok Button clicked.");
   // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   // f.pack(); 

   // new TitleScreen();
  }
}
