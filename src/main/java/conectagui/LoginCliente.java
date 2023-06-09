/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conectagui;

import javax.swing.JOptionPane;

/**
 *
 * @author Trabalho
 */
public class LoginCliente extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginCliente() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        loginJTextField = new javax.swing.JTextField();
        senhaJPasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        sairJButton = new javax.swing.JButton();
        loginJButton = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(490, 528));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginJTextField.setBackground(new java.awt.Color(141, 198, 63));
        loginJTextField.setToolTipText("");
        loginJTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        loginJTextField.setName(""); // NOI18N
        loginJTextField.setSelectedTextColor(new java.awt.Color(185, 178, 178));
        loginJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(loginJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 130, 30));
        loginJTextField.getAccessibleContext().setAccessibleName("");

        senhaJPasswordField.setBackground(new java.awt.Color(141, 198, 63));
        senhaJPasswordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(senhaJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 140, 30));
        senhaJPasswordField.getAccessibleContext().setAccessibleName("");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ruan.pablo.a.gomes\\OneDrive - Accenture\\Desktop\\Faculdade\\7º Semestre\\Front\\projetoA3_Front\\src\\main\\java\\imagens\\login_cliente.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -3, 480, 530));

        sairJButton.setText("Voltar");
        sairJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(sairJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        loginJButton.setText("Entrar");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 89, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        //Pega login digitado
        String login = loginJTextField.getText();
        
        //Pega senha digitada
        String senha = new String(senhaJPasswordField.getPassword());

        try{
            DadosUsuario usuario = new DadosUsuario(login,senha);
            DAO dao = new DAO();
            if(dao.existeCliente(usuario)){
                JOptionPane.showMessageDialog(null, "Bem vindo!");
                if(usuario.getNome().equals("admin@admin.com")){
                    GerenciamentoAdmin gerAdmin = new GerenciamentoAdmin();
                    gerAdmin.setVisible(true);
                    this.dispose();
                }else{
                    GerenciamentoCliente gerCliente = new GerenciamentoCliente(login);
                    gerCliente.setVisible(true);
                    this.dispose();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuário invalido");
            }
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "problemas técnicos. Tente mais tarde");
        }
        
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void sairJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairJButtonActionPerformed
        TelaInicio telaInicio = new TelaInicio();
        telaInicio.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_sairJButtonActionPerformed

    private void loginJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginJTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(LoginCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JTextField loginJTextField;
    private javax.swing.JButton sairJButton;
    private javax.swing.JPasswordField senhaJPasswordField;
    // End of variables declaration//GEN-END:variables
}
