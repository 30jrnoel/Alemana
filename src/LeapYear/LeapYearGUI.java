package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LeapYearGUI extends JFrame{
    private JPanel leapPanel;
    private JTextField tfYear;
    private JButton btnCheckYear;
    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkLeap();
            }
        });
        tfYear.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    checkLeap();
                }
            }
        });
    }
    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setContentPane(app.leapPanel);
        app.setSize(500, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");
    }
    public void checkLeap() {
        try {
            int year = Integer.parseInt(tfYear.getText());
            boolean leap = false;
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        leap = true;
                    else
                        leap = false;
                } else
                    leap = true;
            } else
                leap = false;
            if (leap)
                JOptionPane.showMessageDialog(leapPanel, tfYear.getText() + " is a leap year.");
            else
                JOptionPane.showMessageDialog(leapPanel, tfYear.getText() + " is not a leap year.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(leapPanel, "Please input a valid Integer");
        }
    }
}
