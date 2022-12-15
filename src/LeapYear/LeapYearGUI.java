package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel leapPanel;
    private JTextField input;
    private JButton checker;
    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setContentPane(app.leapPanel);
        app.setSize(500, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
