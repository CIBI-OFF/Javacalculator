import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator implements ActionListener {
    //global variable's
    JLabel displaylabel;
    JButton button0, buttonDecimal, buttonAdd, button1, button2, button3, buttonMinus, button4, button5, button6, buttonMultiply, button7, button8, button9, buttonDivide, buttonClear, buttonEquals, buttonDelete;
    String operation = "";
    double firstInput = 0.0;
    double secondInput = 0.0;

    public Calculator() {
        //title
        JFrame jf = new JFrame("cibi's calculator");
        jf.setLayout(null);
        //layout
        jf.setSize(350, 390);
        jf.setLocation(110, 65);
        jf.setVisible(true);
        jf.getContentPane().setBackground(new Color(36, 36, 36));
        //exit function
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // input field
        displaylabel = new JLabel();
        displaylabel.setBounds(15, 85, 290, 40);
        displaylabel.setFont(new Font("Arial", Font.BOLD, 20));
        displaylabel.setForeground(Color.white);
        displaylabel.setHorizontalAlignment(SwingConstants.LEFT);
        jf.add(displaylabel);

        // Create calculator buttons
        // bottom layer
        button0 = createButton("0", 15, 300, 60, 40);
        buttonDecimal = createButton(".", 80, 300, 60, 40);
        buttonAdd = createButton("+", 210, 300, 60, 40);
        // first layer
        button1 = createButton("1", 15, 255, 60, 40);
        button2 = createButton("2", 80, 255, 60, 40);
        button3 = createButton("3", 145, 255, 60, 40);
        buttonMinus = createButton("-", 210, 255, 60, 40);
        // second layer
        button4 = createButton("4", 15, 210, 60, 40);
        button5 = createButton("5", 80, 210, 60, 40);
        button6 = createButton("6", 145, 210, 60, 40);
        buttonMultiply = createButton("*", 210, 210, 60, 40);
        // third layer
        button7 = createButton("7", 15, 165, 60, 40);
        button8 = createButton("8", 80, 165, 60, 40);
        button9 = createButton("9", 145, 165, 60, 40);
        buttonDivide = createButton("/", 210, 165, 60, 40);

        // clear button
        buttonClear = createButton("C", 145, 300, 60, 40);
        buttonClear.setBackground(new Color(180, 34, 34));

        // equals button
        buttonEquals = createButton("=", 275, 165, 60, 175);
        buttonEquals.setBackground(new Color(28, 196, 80));

        // Delete button
        buttonDelete = createButton("Delete", 15, 120, 320, 40);

        // Add addActionListener to buttons
        button0.addActionListener(this);
        buttonDecimal.addActionListener(this);
        buttonAdd.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        buttonMinus.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        buttonMultiply.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonEquals.addActionListener(this);
        buttonDelete.addActionListener(this);

        // Add buttons to the frame
        jf.add(button0);
        jf.add(buttonDecimal);
        jf.add(buttonAdd);
        jf.add(button1);
        jf.add(button2);
        jf.add(button3);
        jf.add(buttonMinus);
        jf.add(button4);
        jf.add(button5);
        jf.add(button6);
        jf.add(buttonMultiply);
        jf.add(button7);
        jf.add(button8);
        jf.add(button9);
        jf.add(buttonDivide);
        jf.add(buttonClear);
        jf.add(buttonEquals);
        jf.add(buttonDelete);
    }

    //button design
    private static JButton createButton(String label, int x, int y, int width, int height) {
        JButton button = new JButton(label);
        button.setBounds(x, y, width, height);
        button.setBackground(new Color(45, 45, 45));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setFont(new Font("Arial", Font.BOLD, 17));

        // Add opacity while hovering
        if (!label.equals("=") & !label.equals("C")) {
            button.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    button.setBackground(new Color(60, 60, 60));
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    button.setBackground(new Color(45, 45, 45));
                }

            });
        }
        return button;
    }

    public static void main(String[] args) {
        new Calculator();
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button0) {

            displaylabel.setText(displaylabel.getText().concat("0"));
        }
        if (e.getSource() == button1) {

            displaylabel.setText(displaylabel.getText().concat("1"));
        }
        if (e.getSource() == button2) {

            displaylabel.setText(displaylabel.getText().concat("2"));
        }
        if (e.getSource() == button3) {

            displaylabel.setText(displaylabel.getText().concat("3"));
        }
        if (e.getSource() == button4) {

            displaylabel.setText(displaylabel.getText().concat("4"));
        }
        if (e.getSource() == button5) {

            displaylabel.setText(displaylabel.getText().concat("5"));
        }
        if (e.getSource() == button6) {

            displaylabel.setText(displaylabel.getText().concat("6"));
        }
        if (e.getSource() == button7) {

            displaylabel.setText(displaylabel.getText().concat("7"));
        }
        if (e.getSource() == button8) {

            displaylabel.setText(displaylabel.getText().concat("8"));
        }
        if (e.getSource() == button9) {

            displaylabel.setText(displaylabel.getText().concat("9"));
        }
        if (e.getSource() == buttonDecimal) {

            displaylabel.setText(displaylabel.getText().concat("."));
        }
        if (e.getSource() == buttonAdd || e.getSource() == buttonMinus ||
                e.getSource() == buttonMultiply || e.getSource() == buttonDivide ||
                e.getSource() == buttonEquals) {

            double currentInput = Double.parseDouble(displaylabel.getText());

            if (!operation.isEmpty()) {
                // Perform the calculation if the current operation has higher precedence
                if ((operation.equals("+") || operation.equals("-")) &&
                        (e.getSource() == buttonMultiply || e.getSource() == buttonDivide)) {
                    firstInput = calculate(firstInput, currentInput, operation);
                } else {
                    secondInput = currentInput;
                    firstInput = calculate(firstInput, secondInput, operation);
                }
            } else {
                firstInput = currentInput;
            }

            if (e.getSource() == buttonEquals) {
                displaylabel.setText(String.valueOf(firstInput));
                operation = "";
            } else {
                operation = ((JButton) e.getSource()).getText();
                displaylabel.setText("");
            }
        }

        if (e.getSource() == buttonDelete) {
            displaylabel.setForeground(Color.WHITE);
            String del = displaylabel.getText();
            if (!del.isEmpty()) {
                displaylabel.setText(del.substring(0, del.length() - 1));
            }
        }

        if (e.getSource() == buttonClear) {
            displaylabel.setText("");
            firstInput = 0.0;
            secondInput = 0.0;
            operation = "";
            displaylabel.setForeground(Color.WHITE);
        }
    }
    private double calculate(double firstInput, double secondInput, String operation) {
        switch (operation) {
            case "+":
                return firstInput + secondInput;
            case "-":
                return firstInput - secondInput;
            case "*":
                return firstInput * secondInput;
            case "/":
                if (secondInput != 0) {
                    return firstInput / secondInput;
                } else {
                    displaylabel.setForeground(Color.red);
                    displaylabel.setText("zero");
                    return 0;
                }
            default:
                return 0;
        }
    }
}




