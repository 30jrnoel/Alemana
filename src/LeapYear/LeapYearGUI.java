package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    private JPanel leapPanel;
    private JTextField input;
    private JButton checker;
    public LeapYearGUI() {
        checker.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkLeap();
            }
        });
    }
    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setContentPane(app.leapPanel);
        app.setSize(500, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
    public void checkLeap() {
        try {
            int year = Integer.parseInt(input.getText());
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
                JOptionPane.showMessageDialog(leapPanel, input.getText() + " is a leap year.");
            else
                JOptionPane.showMessageDialog(leapPanel, input.getText() + " is not a leap year.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(leapPanel, "Please input a valid Integer");
        }
    }
}
