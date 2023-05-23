/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conectagui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ruan.pablo.a.gomes
 */
public class ListaPendenteAprovacao extends javax.swing.JFrame {

    DadosRestaurantes[] restaurantes;

    /**
     * Creates new form ListaPendenteAprovacao
     */
    public ListaPendenteAprovacao() {
        super("Restaurantes");
        initComponents();
        retornaRestaurantesPendAprov();
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
        jButton1aprovar = new javax.swing.JButton();
        jButton2reprovar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1nomeRest.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome do restaurante"));

        jTextField2cnpjRest.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "CNPJ do restaurante"));

        jButton1aprovar.setText("Aprovar");
        jButton1aprovar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1aprovarMouseClicked(evt);
            }
        });

        jButton2reprovar.setText("Reprovar");
        jButton2reprovar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2reprovarMouseClicked(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clique para expandir" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1aprovar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                        .addComponent(jButton2reprovar))
                    .addComponent(jTextField1nomeRest)
                    .addComponent(jTextField2cnpjRest)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1nomeRest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2cnpjRest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1aprovar)
                    .addComponent(jButton2reprovar))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        exibeSelecionado(jComboBox1.getSelectedIndex());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jButton1aprovarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1aprovarMouseClicked
        // TODO add your handling code here:
        String nomeRestaurante = jTextField1nomeRest.getText();
        String cnpjRestaurante = jTextField2cnpjRest.getText();
        
        CadRestaurante restaurante = new CadRestaurante (nomeRestaurante, cnpjRestaurante); 
        DAO dao = new DAO(); 
        try { 
            dao.inserirRestaurante(restaurante);
            JOptionPane.showMessageDialog(null, "Aprovação realizada!");
        } catch (Exception ex) {
            
        }
        GerenciamentoAdmin telaGerAdmin = new GerenciamentoAdmin();
        telaGerAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1aprovarMouseClicked

    private void jButton2reprovarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2reprovarMouseClicked
        // TODO add your handling code here:
        String nomeRestaurante = jTextField1nomeRest.getText();
        String cnpjRestaurante = jTextField2cnpjRest.getText();
        
        CadRestaurante restaurante = new CadRestaurante (nomeRestaurante, cnpjRestaurante); 
        DAO dao = new DAO();
        try{
            dao.reprovarRestaurante(restaurante);
            JOptionPane.showMessageDialog(null, "Reprovação realizada!");
        }catch(Exception e){
            
        }
        GerenciamentoAdmin telaGerAdmin = new GerenciamentoAdmin();
        telaGerAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2reprovarMouseClicked

    //Chama método no DAO para montar lista de restaurantes e retornar.
    private void retornaRestaurantesPendAprov() {
        try {
            DAO dao = new DAO();
            restaurantes = dao.retornaListaRestaurantesPendentes();
            List<String> listaDados = new ArrayList<>();
            for (int i = 0; i != restaurantes.length; i++) {
                listaDados.add(
                        " Nome do restaurante: " + restaurantes[i].getNomeRestaurante() + 
                        " CNPJ do restaurante: " + restaurantes[i].getCnpjRestaurante());
            }
            for (int i = 0; i != restaurantes.length; i++) {
                jComboBox1.addItem(listaDados.get(i));
            }

        } catch (Exception e) {

        }
    }

    public void exibeSelecionado(int index) {
        jTextField1nomeRest.setText(restaurantes[index - 1].getNomeRestaurante());
        jTextField2cnpjRest.setText(restaurantes[index - 1].getCnpjRestaurante());
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
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaPendenteAprovacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1aprovar;
    private javax.swing.JButton jButton2reprovar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jTextField1nomeRest;
    private javax.swing.JTextField jTextField2cnpjRest;
    // End of variables declaration//GEN-END:variables
}