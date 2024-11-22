import javax.swing.*;
import java.awt.event.*;

public class SimpleCalculator {

    public static void main(String[] args) {
      
        JFrame frame = new JFrame("Simple Calculator");
        JTextField number1 = new JTextField(10);
        JTextField number2 = new JTextField(10);
        JButton addButton = new JButton("Add");
        JLabel resultLabel = new JLabel("Result: ");
        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter first number: "));
        panel.add(number1);
        panel.add(new JLabel("Enter second number: "));
        panel.add(number2);
        panel.add(addButton);
        panel.add(resultLabel);
        
        frame.add(panel);
        
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(number1.getText());
                    double num2 = Double.parseDouble(number2.getText());
                    double sum = num1 + num2;
                    resultLabel.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers.");
                }
            }
        });
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
