/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conectagui;


import conectagui.entities.Restaurante;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
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
        jLabel1 = new javax.swing.JLabel();
        jButton1aprovar = new javax.swing.JButton();
        jButton2reprovar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(476, 513));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1nomeRest.setBackground(new java.awt.Color(196, 196, 196));
        jTextField1nomeRest.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jTextField1nomeRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 200, 360, -1));

        jTextField2cnpjRest.setBackground(new java.awt.Color(196, 196, 196));
        jTextField2cnpjRest.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jTextField2cnpjRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 360, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ruan.pablo.a.gomes\\OneDrive - Accenture\\Desktop\\Faculdade\\7º Semestre\\Front\\projetoA3_Front\\src\\main\\java\\imagens\\admin_crud_restaurante.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 480, 520));

        jButton1aprovar.setText("Aprovar");
        jButton1aprovar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1aprovarMouseClicked(evt);
            }
        });
        jPanel1.add(jButton1aprovar, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 410, 90, 80));

        jButton2reprovar.setText("Reprovar");
        jButton2reprovar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2reprovarMouseClicked(evt);
            }
        });
        jPanel1.add(jButton2reprovar, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 410, 90, 80));

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, -1, 80));

        jComboBox1.setBackground(new java.awt.Color(196, 196, 196));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jComboBox1.setPreferredSize(new java.awt.Dimension(72, 27));
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
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 87, 360, 20));

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
        try {
            // TODO add your handling code here:
            exibeSelecionado();
        } catch (Exception ex) {
            Logger.getLogger(ListaPendenteAprovacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jButton1aprovarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1aprovarMouseClicked
        // TODO add your handling code here:
        String nomeRestaurante = jTextField1nomeRest.getText();
        String cnpjRestaurante = jTextField2cnpjRest.getText();
        
        System.out.println(nomeRestaurante + " " +cnpjRestaurante);

        Restaurante restaurante = new Restaurante(nomeRestaurante, cnpjRestaurante);
        DAO dao = new DAO();
        try {
            dao.aprovarRestaurante(restaurante);
            GerenciamentoAdmin telaGerAdmin = new GerenciamentoAdmin();
            telaGerAdmin.setVisible(true);
            this.dispose();
        } catch (Exception ex) {

        }


    }//GEN-LAST:event_jButton1aprovarMouseClicked

    private void jButton2reprovarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2reprovarMouseClicked
        // TODO add your handling code here:
        String nomeRestaurante = jTextField1nomeRest.getText();
        String cnpjRestaurante = jTextField2cnpjRest.getText();

        DAO dao = new DAO();
        try {
            dao.deletarRestaurante(Integer.parseInt(cnpjRestaurante));
        } catch (Exception e) {

        }
        GerenciamentoAdmin telaGerAdmin = new GerenciamentoAdmin();
        telaGerAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2reprovarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GerenciamentoAdmin gerAdmin = new GerenciamentoAdmin();
        gerAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    //Chama método no DAO para montar lista de restaurantes e retornar.
    private void retornaRestaurantesPendAprov() {
        try {
            DAO dao = new DAO();
            List<Restaurante> rests = new ArrayList<>();
            rests = dao.retornaListaRestaurantesPendentes();

            List<String> listaDados = new ArrayList<>();
            for (Restaurante rest : rests) {
                jComboBox1.addItem(rest.getNomeRestaurante());
            }

        } catch (Exception e) {

        }
    }

    public void exibeSelecionado() throws Exception {

        DefaultListModel comentarios = new DefaultListModel();
        Restaurante rest = new Restaurante();
        String x = String.valueOf(jComboBox1.getSelectedItem());
        DAO dao = new DAO();
        

        rest = dao.retornaRestauranteSelecionadoAdm(x);
        
        System.out.println( rest.getNomeRestaurante() + " " + rest.getCnpjRestaurante());

        jTextField1nomeRest.setText(rest.getNomeRestaurante());
        jTextField2cnpjRest.setText(rest.getCnpjRestaurante());

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1aprovar;
    private javax.swing.JButton jButton2reprovar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1nomeRest;
    private javax.swing.JTextField jTextField2cnpjRest;
    // End of variables declaration//GEN-END:variables
}
