/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conectagui;

import conectagui.entities.Restaurante;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ruan.pablo.a.gomes
 */
public class ListaRestaurantesAdmin extends javax.swing.JFrame {
    
      List<Restaurante> rests = new ArrayList<>();

    Restaurante[] restaurantes;

    /**
     * Creates new form ListaPendenteAprovacao
     */
    public ListaRestaurantesAdmin() {
        super("Restaurantes");
        initComponents();
        retornaListaRestaurantes();
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

        jPanel1 = new javax.swing.JPanel();
        jTextField1nomeRest = new javax.swing.JTextField();
        jTextField2cnpjRest = new javax.swing.JTextField();
        jTextField3notaRest = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2atualizar = new javax.swing.JButton();
        jButton1deletar = new javax.swing.JButton();
        jButton1voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(476, 513));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1nomeRest.setBackground(new java.awt.Color(196, 196, 196));
        jTextField1nomeRest.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jTextField1nomeRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 145, 360, -1));

        jTextField2cnpjRest.setBackground(new java.awt.Color(196, 196, 196));
        jTextField2cnpjRest.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jTextField2cnpjRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 360, -1));

        jTextField3notaRest.setEditable(false);
        jTextField3notaRest.setBackground(new java.awt.Color(196, 196, 196));
        jTextField3notaRest.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jTextField3notaRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 350, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ruan.pablo.a.gomes\\OneDrive - Accenture\\Desktop\\Faculdade\\7º Semestre\\Front\\projetoA3_Front\\src\\main\\java\\imagens\\admin_lista_restaurantes.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 480, 520));

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
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 85, 360, -1));

        jButton2atualizar.setText("Atualizar");
        jButton2atualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2atualizarMouseClicked(evt);
            }
        });
        jButton2atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2atualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2atualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 110, 90));

        jButton1deletar.setText("Deletar");
        jButton1deletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1deletarMouseClicked(evt);
            }
        });
        jButton1deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1deletarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1deletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 100, 90));

        jButton1voltar.setText("Voltar");
        jButton1voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1voltarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 90, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButton1deletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1deletarMouseClicked

    }//GEN-LAST:event_jButton1deletarMouseClicked

    private void jButton2atualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2atualizarMouseClicked

    }//GEN-LAST:event_jButton2atualizarMouseClicked

    private void jButton2atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2atualizarActionPerformed
        // TODO add your handling code here:
        String nomeRestaurante = jTextField1nomeRest.getText();
        String cnpjRestaurante = jTextField2cnpjRest.getText();
        int notaRestaurante = Integer.parseInt(jTextField3notaRest.getText());
             
        DAO dao = new DAO(); 
        try { 
            dao.atualizarRestaurante(cnpjRestaurante, nomeRestaurante);
            JOptionPane.showMessageDialog(null, "Atualização realizada!");
        } catch (Exception ex) {
            
        }
        GerenciamentoAdmin telaGerAdmin = new GerenciamentoAdmin();
        telaGerAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2atualizarActionPerformed

    private void jButton1deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1deletarActionPerformed
        // TODO add your handling code here:
        String nomeRestaurante = jTextField1nomeRest.getText();
        String cnpjRestaurante = jTextField2cnpjRest.getText();
        
        DAO dao = new DAO();
        try{
            dao.deletarRestaurante(Integer.parseInt(cnpjRestaurante));
            JOptionPane.showMessageDialog(null, "Remoção realizada!");
        }catch(Exception e){
            
        }
        GerenciamentoAdmin telaGerAdmin = new GerenciamentoAdmin();
        telaGerAdmin.setVisible(true);
        this.dispose();       
    }//GEN-LAST:event_jButton1deletarActionPerformed

    private void jButton1voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1voltarActionPerformed
        // TODO add your handling code here:
        GerenciamentoAdmin gerAdmin = new GerenciamentoAdmin();
        gerAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1voltarActionPerformed

    //Chama método no DAO para montar lista de restaurantes e retornar.
    private void retornaListaRestaurantes() {
        try {
            DAO dao = new DAO();
            rests = dao.retornaListaRestaurantesCadastrados();
            List<String> listaDados = new ArrayList<>();
            for (int i = 0; i != restaurantes.length; i++) {
                listaDados.add(
                        " Nome do restaurante: " + restaurantes[i].getNomeRestaurante());
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
        jTextField3notaRest.setText(Integer.toString(restaurantes[index - 1].getNota()));
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
                new ListaRestaurantesAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1deletar;
    private javax.swing.JButton jButton1voltar;
    private javax.swing.JButton jButton2atualizar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1nomeRest;
    private javax.swing.JTextField jTextField2cnpjRest;
    private javax.swing.JTextField jTextField3notaRest;
    // End of variables declaration//GEN-END:variables
}
