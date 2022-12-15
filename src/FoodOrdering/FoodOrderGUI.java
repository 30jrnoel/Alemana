package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

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
    private JButton btnOrder;
    List<JCheckBox> food;
    public FoodOrderGUI(){
        food = new ArrayList<>();
        food.add(cPizza);
        food.add(cBurger);
        food.add(cFries);
        food.add(cSoftDrinks);
        food.add(cTea);
        food.add(cSundae);

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                order();
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderGUI appFood = new FoodOrderGUI();
        appFood.setContentPane(appFood.FoodPanel);
        appFood.setSize(500, 700);
        appFood.setDefaultCloseOperation(EXIT_ON_CLOSE);
        appFood.setVisible(true);
        appFood.setTitle("Food Ordering System");
    }
    public void order(){
        double total= 0;
        for(JCheckBox cb : food){
            if(cb.isSelected()){
                if (cPizza.equals(cb)) {
                    total += 100;
                }
                if (cBurger.equals(cb)) {
                    total += 80;
                }
                if (cFries.equals(cb)) {
                    total += 65;
                }
                if (cSoftDrinks.equals(cb)) {
                    total += 55;
                }
                if (cTea.equals(cb)) {
                    total += 50;
                }
                if (cSundae.equals(cb)) {
                    total += 40;
                }
            }
        }
        if (rbNone.isSelected()){
        }else if (rb5.isSelected()){
            total*=0.95;
        }else if (rb10.isSelected()){
            total*=0.90;
        }else if (rb15.isSelected()){
            total*=0.85;
        }
        DecimalFormat df = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(FoodPanel,"The total price is Php " + df.format(total));
    }
}
