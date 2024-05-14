
package tema9.interfaces;

/**
 *
 * @author alumno
 */
public class Aficiones extends javax.swing.JPanel {

    /**
     * Creates new form Ejemplo01
     */
    public Aficiones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_Musica = new javax.swing.JButton();
        bt_Deportes = new javax.swing.JButton();
        bt_Reset = new javax.swing.JButton();
        tf_Resultado = new javax.swing.JTextField();
        lb_Aficiones = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        bt_Musica.setBackground(new java.awt.Color(255, 255, 0));
        bt_Musica.setText("MUSICA");
        bt_Musica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_MusicaMouseClicked(evt);
            }
        });
        bt_Musica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_MusicaActionPerformed(evt);
            }
        });

        bt_Deportes.setBackground(new java.awt.Color(255, 255, 51));
        bt_Deportes.setText("DEPORTES");
        bt_Deportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_DeportesMouseClicked(evt);
            }
        });
        bt_Deportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_DeportesActionPerformed(evt);
            }
        });

        bt_Reset.setBackground(new java.awt.Color(153, 153, 153));
        bt_Reset.setText("RESET");
        bt_Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_ResetMouseEntered(evt);
            }
        });
        bt_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ResetActionPerformed(evt);
            }
        });

        tf_Resultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_Resultado.setText("¿Cual es tu afición?");
        tf_Resultado.setEnabled(false);
        tf_Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ResultadoActionPerformed(evt);
            }
        });

        lb_Aficiones.setBackground(new java.awt.Color(255, 255, 255));
        lb_Aficiones.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_Aficiones.setText("AFICIONES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(bt_Musica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(bt_Deportes)
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(bt_Reset))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(lb_Aficiones)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Musica)
                    .addComponent(bt_Deportes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(lb_Aficiones)
                .addGap(37, 37, 37)
                .addComponent(tf_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(bt_Reset)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_MusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_MusicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_MusicaActionPerformed

    private void bt_DeportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_DeportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_DeportesActionPerformed

    private void bt_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_ResetActionPerformed

    private void tf_ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ResultadoActionPerformed

    private void bt_MusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_MusicaMouseClicked
        this.tf_Resultado.setText("MUSICA");
    }//GEN-LAST:event_bt_MusicaMouseClicked

    private void bt_DeportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_DeportesMouseClicked
        this.tf_Resultado.setText("DEPORTES");
    }//GEN-LAST:event_bt_DeportesMouseClicked

    private void bt_ResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_ResetMouseEntered
        this.tf_Resultado.setText("¿Cual es tu afición");
    }//GEN-LAST:event_bt_ResetMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aficiones().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Deportes;
    private javax.swing.JButton bt_Musica;
    private javax.swing.JButton bt_Reset;
    private javax.swing.JLabel lb_Aficiones;
    private javax.swing.JTextField tf_Resultado;
    // End of variables declaration//GEN-END:variables

}