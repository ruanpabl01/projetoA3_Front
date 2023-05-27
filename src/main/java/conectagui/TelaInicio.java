/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conectagui;

/**
 *
 * @author ruan.pablo.a.gomes
 */
public class TelaInicio extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicio
     */
    public TelaInicio() {
        initComponents();
        DAO dao = new DAO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSouCliente = new javax.swing.JButton();
        jButton2SouRest = new javax.swing.JButton();
        jButton3CadastroCliente = new javax.swing.JButton();
        jButton1CadastroRest = new javax.swing.JButton();
        jButton1loginAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSouCliente.setLabel("Já sou cliente");
        jButtonSouCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSouClienteMouseClicked(evt);
            }
        });
        jButtonSouCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSouClienteActionPerformed(evt);
            }
        });

        jButton2SouRest.setLabel("Já sou restaurante");
        jButton2SouRest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2SouRestMouseClicked(evt);
            }
        });

        jButton3CadastroCliente.setText("Quero me cadastrar");
        jButton3CadastroCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3CadastroClienteMouseClicked(evt);
            }
        });

        jButton1CadastroRest.setText("Quero cadastrar meu restaurante");
        jButton1CadastroRest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1CadastroRestMouseClicked(evt);
            }
        });

        jButton1loginAdmin.setText("Administrador");
        jButton1loginAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1loginAdminMouseClicked(evt);
            }
        });
        jButton1loginAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1loginAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonSouCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3CadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1CadastroRest)
                        .addComponent(jButton2SouRest, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1loginAdmin))
                .addGap(80, 80, 80))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1CadastroRest, jButton1loginAdmin, jButton2SouRest, jButton3CadastroCliente, jButtonSouCliente});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSouCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2SouRest, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3CadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1CadastroRest, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1loginAdmin)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1CadastroRest, jButton1loginAdmin, jButton2SouRest, jButton3CadastroCliente, jButtonSouCliente});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Não utilizada
    private void jButtonSouClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSouClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSouClienteActionPerformed
    
    //Chama a tela 'Login Cliente'
    private void jButtonSouClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSouClienteMouseClicked
        // TODO add your handling code here:
        LoginCliente loginCliente = new LoginCliente();
        loginCliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSouClienteMouseClicked

    //Chama a tela 'Login Restaurante"
    private void jButton2SouRestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2SouRestMouseClicked
        // TODO add your handling code here:
        LoginRestaurante loginRest = new LoginRestaurante();
        loginRest.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2SouRestMouseClicked

    //Chama tela de cadastro de restaurante
    private void jButton3CadastroClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3CadastroClienteMouseClicked
        // TODO add your handling code here:
        CadastroCliente cadastroCliente = new CadastroCliente();
        cadastroCliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3CadastroClienteMouseClicked

    private void jButton1CadastroRestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1CadastroRestMouseClicked
        // TODO add your handling code here:
        CadastroRestaurante cadastroRest = new CadastroRestaurante();
        cadastroRest.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1CadastroRestMouseClicked

    private void jButton1loginAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1loginAdminMouseClicked
        // TODO add your handling code here:
        LoginAdmin loginAdmin = new LoginAdmin();
        loginAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1loginAdminMouseClicked

    private void jButton1loginAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1loginAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1loginAdminActionPerformed
 
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
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1CadastroRest;
    private javax.swing.JButton jButton1loginAdmin;
    private javax.swing.JButton jButton2SouRest;
    private javax.swing.JButton jButton3CadastroCliente;
    private javax.swing.JButton jButtonSouCliente;
    // End of variables declaration//GEN-END:variables
}
