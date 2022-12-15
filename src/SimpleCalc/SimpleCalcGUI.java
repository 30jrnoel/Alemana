package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{
    private JPanel CalcPanel;
    private JTextField tfNumber1;
    private JTextField tfNumber2 ;
    private JComboBox cbOperations ;
    private JButton btnCompute ;
    private JTextField lblResult;

    public SimpleCalcGUI(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compute();
            }
        });
    }
    public static void main(String[] args) {
        SimpleCalcGUI appCalc = new SimpleCalcGUI();
        appCalc.setContentPane(appCalc.CalcPanel);
        appCalc.setSize(600, 400);
        appCalc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        appCalc.setVisible(true);
        appCalc.setTitle("Simple Calculator");

    }
    public void compute(){
        try{
            int firstNum = Integer.parseInt(tfNumber1.getText());
            int secondNum = Integer.parseInt(tfNumber2.getText());
            int result =0;
            switch (cbOperations.getSelectedItem().toString()){
                case "+":
                    result = firstNum + secondNum;
                    break;
                case "-":
                    result = firstNum - secondNum;
                    break;
                case "*":
                    result = firstNum * secondNum;
                    break;
                case "/":
                    result = firstNum / secondNum;
                    break;
            }
            lblResult.setText(result+"");
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(CalcPanel, "Error please try again");
        }catch (ArithmeticException e){
            JOptionPane.showMessageDialog(CalcPanel, "Cannot Divide by 0");
        }
    }
}
