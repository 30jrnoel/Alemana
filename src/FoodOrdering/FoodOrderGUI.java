package FoodOrdering;

import LeapYear.LeapYearGUI;

import javax.swing.*;

public class FoodOrderGUI extends JFrame{
    private JPanel FoodPanel;
    private JCheckBox cPizza ;
    private JCheckBox cBurger ;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone ;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton orderButton;
    public static void main(String[] args) {
        FoodOrderGUI appFood = new FoodOrderGUI();
        appFood.setContentPane(appFood.FoodPanel);
        appFood.setSize(500, 700);
        appFood.setDefaultCloseOperation(EXIT_ON_CLOSE);
        appFood.setVisible(true);
        appFood.setTitle("Food Ordering System");
    }
}
