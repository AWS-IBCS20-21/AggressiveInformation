//sample from TutorialsPoint (Java Tutorials)
//2021 - https://www.tutorialspoint.com/swing/swing_event_handling.htm

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Resturant2 {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public Resturant2(){
      prepareGUI();
   }
   public static void main(String[] args){
      Resturant2 Resturant2 = new Resturant2();
      Resturant2.showDrinkMenu();
      Resturant2.showMainCourse();
    }
   private void prepareGUI(){
      mainFrame = new JFrame("Broski's Resturant");
      mainFrame.setSize(700,900);
      mainFrame.setLayout(new GridLayout(7,12));

      headerLabel = new JLabel("",JLabel.CENTER );
      statusLabel = new JLabel("",JLabel.CENTER);
      statusLabel.setSize(350,100);

      JLabel greeting = new JLabel("Heyyy! Welcome to Broski's. Where everyone here is a bro!");
      mainFrame.add(greeting);
      greeting.setBounds(600,10,57, 80);
      JLabel step1 = new JLabel("---please review the menu items my guy---");
      mainFrame.add(step1);
      JLabel step2 = new JLabel("When your ready to order my dude select an item from each section that you would enjoy eating.");
      mainFrame.add(step2);
      JLabel space = new JLabel(" ");
      mainFrame.add(space);
      JLabel drinks = new JLabel("1. The Drinks");
      mainFrame.add(drinks);

      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }
      });
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);
   }
   private void showDrinkMenu(){


      JButton drink1Button = new JButton("The Bro's Blackberry Banana Smoothie");
      JButton drink2Button = new JButton("The Mate's McIntosh Apple, Apple Juice");
      JButton drink3Button = new JButton("The Sidekick's Super Slurpee");

      drink1Button.setActionCommand("The Bro's Blackberry Banana Smoothie");
      drink2Button.setActionCommand("The Mate's McIntosh Apple, Apple Juice");
      drink3Button.setActionCommand("The Sidekick's Super Slurpee");

      drink1Button.addActionListener(new ButtonClickListener());
      drink2Button.addActionListener(new ButtonClickListener());
      drink3Button.addActionListener(new ButtonClickListener());

      controlPanel.add(drink1Button);
      controlPanel.add(drink2Button);
      controlPanel.add(drink3Button);

      mainFrame.setVisible(true);
    }
    private class ButtonClickListener implements ActionListener{
       public void actionPerformed(ActionEvent e) {
          String command = e.getActionCommand();

          if( command.equals( "The Bro's Blackberry Banana Smoothie" ))  {
             statusLabel.setText("Your Order: The Bro's Blackberry Banana Smoothie");
          } else if( command.equals( "The Mate's McIntosh Apple, Apple Juice" ) )  {
             statusLabel.setText("Your Order: The Mate's McIntosh Apple, Apple Juice");
          } else if( command.equals( "The Sidekick's Super Slurpee") )  {
             statusLabel.setText("Your Order: The Sidekick's Super Slurpee");
          }
       }
    }

    private void showMainCourse(){
      JLabel dishes = new JLabel("2. The Main Dishes");
      mainFrame.add(dishes);

         JButton dish1Button = new JButton("The Surfer Dude Salad");
         dish1Button.setBounds(350,200, 100, 80);
         JButton dish2Button = new JButton("The Chum's Chickpea Chicken Salad");
         dish2Button.setBounds(350,200, 100, 80);
         JButton dish3Button = new JButton("The Dude's Dandelion Green Salad");
         dish3Button.setBounds(350,200, 100, 80);

         dish1Button.setActionCommand("The Surfer Dude Salad");
         dish2Button.setActionCommand("The Chum's Chickpea Chicken Salad");
         dish3Button.setActionCommand("The Dude's Dandelion Green Salad");

         dish1Button.addActionListener(new ButtonClickListener());
         dish2Button.addActionListener(new ButtonClickListener());
         dish3Button.addActionListener(new ButtonClickListener());

         controlPanel.add(dish1Button);
         controlPanel.add(dish2Button);
         controlPanel.add(dish3Button);

         mainFrame.setVisible(true);
   }
   private class Button2ClickListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {
         String command = e.getActionCommand();

         if( command.equals( "The Surfer Dude Salad" ))  {
            statusLabel.setText("Your Order: The Surfer Dude Salad");
         } else if( command.equals( "The Chum's Chickpea Chicken Salad" ) )  {
            statusLabel.setText("Your Order: The Chum's Chickpea Chicken Salad");
         } else if( command.equals( "The Dude's Dandelion Green Salad" ) )  {
            statusLabel.setText("Your Order: The Dude's Dandelion Green Salad");
         }

      }
   }
}
