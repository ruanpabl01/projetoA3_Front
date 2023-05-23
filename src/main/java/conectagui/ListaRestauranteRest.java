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
public class ListaRestauranteRest extends javax.swing.JFrame {
    String cnpj;
    /**
     * Creates new form ListaRestauranteRest
     */
    public ListaRestauranteRest(String cnpj) {
        initComponents();
        this.cnpj = cnpj;
        jTextField2cnpjRest.setText(cnpj);
        CadRestaurante[] restaurantes;
        DAO dao = new DAO();
        restaurantes = dao.retornaListaRestaurantesCadastrados();
        for(int index = 0; index != restaurantes.length; index++){
            if(restaurantes[index].getEmailRestaurante().equals(cnpj)){
                jTextField1nomeRest.setText(restaurantes[index].getNomeRestaurante());
                jTextField3notaRest.setText(Integer.toString(restaurantes[index].getNota()));
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1nomeRest = new javax.swing.JTextField();
        jTextField2cnpjRest = new javax.swing.JTextField();
        jTextField3notaRest = new javax.swing.JTextField();
        jButton1atualizar = new javax.swing.JButton();
        jButton2deletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1nomeRest.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Nome do restaurante"));
        jTextField1nomeRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1nomeRestActionPerformed(evt);
            }
        });

        jTextField2cnpjRest.setEditable(false);
        jTextField2cnpjRest.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "CNPJ do restaurante"));

        jTextField3notaRest.setEditable(false);
        jTextField3notaRest.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Média do restaurante")));
        jTextField3notaRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3notaRestActionPerformed(evt);
            }
        });

        jButton1atualizar.setText("Atualizar");
        jButton1atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1atualizarActionPerformed(evt);
            }
        });

        jButton2deletar.setText("Deletar");
        jButton2deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2deletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1nomeRest)
                            .addComponent(jTextField2cnpjRest)
                            .addComponent(jTextField3notaRest, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jButton1atualizar)
                        .addGap(42, 42, 42)
                        .addComponent(jButton2deletar)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jTextField1nomeRest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2cnpjRest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField3notaRest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1atualizar)
                    .addComponent(jButton2deletar))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1nomeRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1nomeRestActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1nomeRestActionPerformed

    private void jTextField3notaRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3notaRestActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField3notaRestActionPerformed

    private void jButton1atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1atualizarActionPerformed
        // TODO add your handling code here:
        
        String nomeRestaurante = jTextField1nomeRest.getText();
        String cnpjRestaurante = jTextField2cnpjRest.getText();
        int notaRestaurante = Integer.parseInt(jTextField3notaRest.getText());
        
        CadRestaurante restaurante = new CadRestaurante (nomeRestaurante, cnpjRestaurante, notaRestaurante); 
 
        DAO dao = new DAO();
        try {
            dao.atualizarRestaurante(restaurante);
            JOptionPane.showMessageDialog(null, "Atualização realizada!");

        } catch (Exception ex) {
        
        }
        
        GerenciamentoRestaurantes telaGerRest = new GerenciamentoRestaurantes(cnpj);
        telaGerRest.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1atualizarActionPerformed

    private void jButton2deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2deletarActionPerformed
        // TODO add your handling code here:
        String cnpjRestaurante = jTextField2cnpjRest.getText();
        
        CadRestaurante restaurante = new CadRestaurante (cnpjRestaurante); 
        DAO dao = new DAO();
        try{
            dao.deletarRestaurante(restaurante);
            JOptionPane.showMessageDialog(null, "Deleção realizada!");
        }catch(Exception e){
            
        }
        GerenciamentoRestaurantes telaGerRest = new GerenciamentoRestaurantes(cnpj);
        telaGerRest.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2deletarActionPerformed

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
            java.util.logging.Logger.getLogger(ListaRestauranteRest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaRestauranteRest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaRestauranteRest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaRestauranteRest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaRestauranteRest("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1atualizar;
    private javax.swing.JButton jButton2deletar;
    private javax.swing.JTextField jTextField1nomeRest;
    private javax.swing.JTextField jTextField2cnpjRest;
    private javax.swing.JTextField jTextField3notaRest;
    // End of variables declaration//GEN-END:variables
}