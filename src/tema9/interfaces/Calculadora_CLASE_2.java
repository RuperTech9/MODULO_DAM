package tema9.interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora_CLASE_2 extends JFrame implements ActionListener {

    // Declaración de componentes
    private JTextField tfDisplay;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subButton, mulButton, divButton;
    private JButton decButton, equButton, delButton, clrButton;
    private JPanel panel;

    private Font font = new Font("Ink Free", Font.BOLD, 20);

    // Variables para operaciones
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    // Constructor de la clase
    public Calculadora_CLASE_2() {
        setTitle("Calculadora");
        setSize(420, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Inicialización del campo de texto
        tfDisplay = new JTextField();
        tfDisplay.setBounds(50, 25, 300, 50);
        tfDisplay.setFont(font);
        tfDisplay.setEditable(false);
        add(tfDisplay);

        // Inicialización de botones
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(font);
            numberButtons[i].setFocusable(false);
        }

        decButton = new JButton(".");
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("Clr");

        functionButtons = new JButton[8];
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;

        for (int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(font);
            functionButtons[i].setFocusable(false);
        }

        // Panel para los botones
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        // Añadir botones al panel
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        add(panel);
        add(delButton);
        add(clrButton);

        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                tfDisplay.setText(tfDisplay.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == decButton) {
            tfDisplay.setText(tfDisplay.getText().concat("."));
        }
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(tfDisplay.getText());
            operator = '+';
            tfDisplay.setText("");
        }
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(tfDisplay.getText());
            operator = '-';
            tfDisplay.setText("");
        }
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(tfDisplay.getText());
            operator = '*';
            tfDisplay.setText("");
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(tfDisplay.getText());
            operator = '/';
            tfDisplay.setText("");
        }
        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(tfDisplay.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            tfDisplay.setText(String.valueOf(result));
            num1 = result;
        }
        if (e.getSource() == clrButton) {
            tfDisplay.setText("");
        }
        if (e.getSource() == delButton) {
            String string = tfDisplay.getText();
            tfDisplay.setText("");
            for (int i = 0; i < string.length() - 1; i++) {
                tfDisplay.setText(tfDisplay.getText() + string.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        new Calculadora_CLASE_2();
    }
}
