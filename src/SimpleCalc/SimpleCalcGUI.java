package SimpleCalc;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame{
    private JPanel CalcPanel;
    private JTextField num1;
    private JTextField num2;
    private JComboBox opp;
    private JButton computeResultButton;

    public static void main(String[] args) {
        SimpleCalcGUI appCalc = new SimpleCalcGUI();
        appCalc.setContentPane(appCalc.CalcPanel);
        appCalc.setSize(700, 1000);
        appCalc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        appCalc.setVisible(true);
    }

}
