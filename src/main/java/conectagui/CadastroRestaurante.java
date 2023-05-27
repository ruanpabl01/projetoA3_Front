/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conectagui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ruan.pablo.a.gomes
 */
public class CadastroRestaurante extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroRestaurante() {
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

        nomeRestauranteTextField = new javax.swing.JTextField();
        emailRestauranteTextField = new javax.swing.JTextField();
        jButton1CadastrarCli = new javax.swing.JButton();
        senhaPasswordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeRestauranteTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome do restaurante"));

        emailRestauranteTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("CNPJ"));

        jButton1CadastrarCli.setText("Cadastrar");
        jButton1CadastrarCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1CadastrarCliMouseClicked(evt);
            }
        });

        senhaPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1CadastrarCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(nomeRestauranteTextField)
                    .addComponent(emailRestauranteTextField)
                    .addComponent(senhaPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {emailRestauranteTextField, nomeRestauranteTextField, senhaPasswordField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(nomeRestauranteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailRestauranteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1CadastrarCli)
                    .addComponent(jButton1))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {emailRestauranteTextField, nomeRestauranteTextField, senhaPasswordField});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1CadastrarCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1CadastrarCliMouseClicked
        // TODO add your handling code here:
        String nomeRestaurante = nomeRestauranteTextField.getText();
        String emailRestaurante = emailRestauranteTextField.getText();
        String senhaRestaurante = new String(senhaPasswordField.getPassword());
        JOptionPane.showMessageDialog(null, "Cadastro realizado! Aguarde ser aprovado.");
        
        CadRestaurante restaurante = new CadRestaurante (nomeRestaurante, emailRestaurante, senhaRestaurante); 
        DAO dao = new DAO(); 
        try { 
            dao.inserirRestaurante(restaurante);
        } catch (Exception ex) {
            
        }
        TelaInicio telaInicio = new TelaInicio();
        telaInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1CadastrarCliMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TelaInicio telaInicio = new TelaInicio();
        telaInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroRestaurante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailRestauranteTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1CadastrarCli;
    private javax.swing.JTextField nomeRestauranteTextField;
    private javax.swing.JPasswordField senhaPasswordField;
    // End of variables declaration//GEN-END:variables
}
