package tema9.interfaces;

/**
 *
 * @author Ruper
 */
public class Calculadora extends javax.swing.JFrame {

    // Declaración de componentes
    private javax.swing.JTextField tfDisplay;
    private javax.swing.JButton[] numberButtons;
    private javax.swing.JButton[] functionButtons;
    private javax.swing.JButton addButton, subButton, mulButton, divButton;
    private javax.swing.JButton decButton, equButton, delButton, clrButton;
    private javax.swing.JPanel panel;

    // Variables para operaciones
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        tfDisplay = new javax.swing.JTextField();
        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfDisplay.setEditable(false);
        tfDisplay.setFont(new java.awt.Font("Ink Free", java.awt.Font.BOLD, 20)); // NOI18N

        panel.setLayout(new java.awt.GridLayout(4, 4, 10, 10));

        // Inicialización de botones
        numberButtons = new javax.swing.JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new javax.swing.JButton(String.valueOf(i));
            numberButtons[i].setFont(new java.awt.Font("Ink Free", java.awt.Font.BOLD, 20)); // NOI18N
            numberButtons[i].setFocusable(false);
            numberButtons[i].addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    numberButtonActionPerformed(evt);
                }
            });
        }

        decButton = new javax.swing.JButton(".");
        addButton = new javax.swing.JButton("+");
        subButton = new javax.swing.JButton("-");
        mulButton = new javax.swing.JButton("*");
        divButton = new javax.swing.JButton("/");
        equButton = new javax.swing.JButton("=");
        delButton = new javax.swing.JButton("Del");
        clrButton = new javax.swing.JButton("Clr");

        functionButtons = new javax.swing.JButton[]{addButton, subButton, mulButton, divButton, decButton, equButton, delButton, clrButton};
        for (javax.swing.JButton button : functionButtons) {
            button.setFont(new java.awt.Font("Ink Free", java.awt.Font.BOLD, 20)); // NOI18N
            button.setFocusable(false);
            button.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    functionButtonActionPerformed(evt);
                }
            });
        }

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfDisplay)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clrButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tfDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(clrButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void numberButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        javax.swing.JButton source = (javax.swing.JButton) evt.getSource();
        tfDisplay.setText(tfDisplay.getText().concat(source.getText()));
    }                                            

    private void functionButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        javax.swing.JButton source = (javax.swing.JButton) evt.getSource();
        String command = source.getText();

        switch (command) {
            case "Clr":
                tfDisplay.setText("");
                break;
            case "Del":
                String text = tfDisplay.getText();
                if (!text.isEmpty()) {
                    tfDisplay.setText(text.substring(0, text.length() - 1));
                }
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                num1 = Double.parseDouble(tfDisplay.getText());
                operator = command.charAt(0);
                tfDisplay.setText("");
                break;
            case "=":
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
                break;
            case ".":
                tfDisplay.setText(tfDisplay.getText().concat("."));
                break;
        }
    }                                              

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    // End of variables declaration                   
}

/*
Explicación del Código
Componentes: Se han añadido componentes como botones numéricos y de función, y un campo de texto (tfDisplay) para mostrar los números y resultados.

Inicialización en initComponents:

Se configura el campo de texto (tfDisplay).
Se crea un panel con una cuadrícula de 4x4 para los botones.
Se añaden los botones al panel.
Manejo de Eventos:

numberButtonActionPerformed: Añade el texto del botón al campo de texto.
functionButtonActionPerformed: Gestiona las operaciones aritméticas y otros comandos como "Clr", "Del" y "=".
Disposición: Se utiliza javax.swing.GroupLayout para organizar los componentes en la ventana.
*/