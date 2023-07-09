
package Vista;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Loggin extends javax.swing.JFrame {

    /**
     * Creates new form Loggin
     */
    public Loggin() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPasswordPin = new javax.swing.JPasswordField();
        jTextUsuario = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LBADVERTENCIA2 = new javax.swing.JLabel();
        LBADVERTENCIA1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(178, 178, 178));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Entrar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 50, 30));

        jPasswordPin.setBackground(new java.awt.Color(178, 178, 178));
        jPasswordPin.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jPasswordPin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordPin.setActionCommand("<Not Set>");
        jPasswordPin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)), "PIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N
        jPasswordPin.setOpaque(true);
        jPasswordPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordPinActionPerformed(evt);
            }
        });
        jPasswordPin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordPinKeyPressed(evt);
            }
        });
        jPanel2.add(jPasswordPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 170, 60));

        jTextUsuario.setBackground(new java.awt.Color(178, 178, 178));
        jTextUsuario.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jTextUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)), "USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 14))); // NOI18N
        jTextUsuario.setDoubleBuffered(true);
        jTextUsuario.setOpaque(true);
        jTextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUsuarioActionPerformed(evt);
            }
        });
        jTextUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextUsuarioKeyPressed(evt);
            }
        });
        jPanel2.add(jTextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 180, 60));

        jButton2.setText("Salir");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 50, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1687968369999.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 460, 280));

        LBADVERTENCIA2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jPanel2.add(LBADVERTENCIA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 270, 30));

        LBADVERTENCIA1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jPanel2.add(LBADVERTENCIA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 190, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String usuario = jTextUsuario.getText();
        String pin = jPasswordPin.getText();
        
        if(usuario.isEmpty()  || pin.isEmpty()){
                LBADVERTENCIA2.setForeground(new Color (255,0,0));
                LBADVERTENCIA2.setText("COMPLETA TODOS LOS CAMPOS!!");
                jTextUsuario.setText("");
                jPasswordPin.setText("");
        }else{
            if (usuario.equals("12345") && pin.equals("4321")){
                JOptionPane.showMessageDialog(null, "Bienvenido");
                Menuprincipal panel2 = new Menuprincipal();
                panel2.setVisible(true);
                this.dispose();
            }else{
                LBADVERTENCIA1.setForeground(new Color (255,0,0));
                LBADVERTENCIA1.setText("ACCESO DENEGADO!!");
                jTextUsuario.setText("");
                jPasswordPin.setText("");
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUsuarioActionPerformed

    private void jPasswordPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordPinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordPinActionPerformed

    private void jTextUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextUsuarioKeyPressed
        // TODO add your handling code here:
        LBADVERTENCIA2.setText("");
    }//GEN-LAST:event_jTextUsuarioKeyPressed

    private void jPasswordPinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordPinKeyPressed
        // TODO add your handling code here:
        LBADVERTENCIA2.setText("");
    }//GEN-LAST:event_jPasswordPinKeyPressed

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
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loggin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBADVERTENCIA1;
    private javax.swing.JLabel LBADVERTENCIA2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordPin;
    private javax.swing.JTextField jTextUsuario;
    // End of variables declaration//GEN-END:variables
}
