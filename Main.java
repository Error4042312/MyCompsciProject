//Important Info: User may have to drag some windows around in program to see the ingredients for the food properly. 

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
    JFrame thirdRegion1Ing = new JFrame();
    JFrame thirdRegion2Ing = new JFrame();
    JFrame thirdRegion3Ing = new JFrame();
    JFrame thirdRegion4Ing = new JFrame();

      
    //new button  
    JButton title = new JButton("Recipe Book");
    JButton titleToNext = new JButton("Click to Browse Regions!");
    JButton region1 = new JButton("South Korea");
    JButton region2 = new JButton("United States");
    JButton region3 = new JButton("Mexico");
    JButton region4 = new JButton("Canada");

    //buttons for ingredients
    JButton ingredients1 = new JButton("Ingredients: 8 Korean dumplings, 4 1/2 cups Korean stock, 1 Tbsp regular soy sauce, 1/2 tsp minced garlic, 2 eggs (beaten), 1 tsp sesame oil, 1  to 2 stalks green onion, thinly sliced, (optional) 2 eggs, egg white and yolk separated, (optional) dried seaweed (gim / nori), thinly sliced, (optional) fine sea salt, to taste, (optional) black pepper, to taste");
    JButton ingredients2 = new JButton("Ingredients: 2 pounds freshly ground chuck, (at least 80% lean), 1 tablespoon onion powder, 1 teaspoon salt, 1 teaspoon freshly ground black pepper, 2 slices deli-counter American cheese, 1 large burger bun");
    JButton ingredients3 = new JButton("Ingredients: 1 lb. 90% to 93% lean ground beef, 1 Tablespoon chili powder, 1 teaspoon ground cumin, 3/4 teaspoon salt, 1/2 teaspoon dried oregano, 1/2 teaspoon garlic powder, 1/4 teaspoon ground black pepper, 1/2 cup tomato sauce, 1/4 cup water, 12 taco shells - either hard shells or small 6-inch soft flour tortillas will work, (Optional) Taco Toppings: shredded cheese shredded lettuce, chopped tomatoes, diced red onion, taco sauce, sour cream, guacamole, etc.");
    JButton ingredients4 = new JButton("Ingredients: 3 Tbsp cornstarch, 2 Tbsp water, 6 Tbsp unsalted butter, 1/4 cup unbleached all purpose flour, 20 oz beef broth, 10 oz chicken broth,Pepper, 2 lbs Russet potatoes (3-4 medium potatoes), Peanut or other frying oil,1 - 1 1/2 cups white cheddar cheese curds");
    
   
    //setting up the dimensions for the buttons
    titleToNext.setBounds(105, 350, 250, 40);
    title.setBounds(80, 100, 300, 50);
    region1.setBounds(40, 100, 200, 40);
    region2.setBounds(350, 100, 200, 40);
    region3.setBounds(40, 250, 200, 40);
    region4.setBounds(350, 250, 200, 40);
    ingredients1.setBounds(125, 300, 550, 400);
    ingredients2.setBounds(125, 300, 550, 400);
    ingredients3.setBounds(125, 300, 550, 400);
    ingredients4.setBounds(125, 300, 550, 400);
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
        thirdRegion1Ing.setVisible(true);
      }
    });

    region2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        second.setVisible(false);
        thirdRegion2.setVisible(true);
        thirdRegion2Ing.setVisible(true);
      }
    });

    region3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        second.setVisible(false);
        thirdRegion3.setVisible(true);
        thirdRegion3Ing.setVisible(true);
      }
    });

    region4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        second.setVisible(false);
        thirdRegion4.setVisible(true);
        thirdRegion4Ing.setVisible(true);
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

    thirdRegion1Ing.add(ingredients1);
    thirdRegion1Ing.pack();
    thirdRegion1Ing.setLayout(null);

    thirdRegion2Ing.add(ingredients2);
    thirdRegion2Ing.pack();
    thirdRegion2Ing.setLayout(null);

    thirdRegion3Ing.add(ingredients3);
    thirdRegion3Ing.pack();
    thirdRegion3Ing.setLayout(null);

    thirdRegion4Ing.add(ingredients4);
    thirdRegion4Ing.pack();
    thirdRegion4Ing.setLayout(null);

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

    ImageIcon icon3 = new ImageIcon("imgs/TacosFinal.jpg");
    JLabel label3 = new JLabel(icon3);
    thirdRegion3.add(label3);
    //thirdRegion3.setSize(600, 500);
    thirdRegion3.pack();
    thirdRegion3.setLayout(null);

    ImageIcon icon4 = new ImageIcon("imgs/PoutineFinal.jpg");
    JLabel label4 = new JLabel(icon4);
    thirdRegion4.add(label4);
    //thirdRegion4.setSize(600, 500);
    thirdRegion4.pack();
    thirdRegion4.setLayout(null);
  }
}
