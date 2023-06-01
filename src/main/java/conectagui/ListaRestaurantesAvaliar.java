/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conectagui;

import conectagui.entities.Restaurante;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ruan.pablo.a.gomes
 */
public class ListaRestaurantesAvaliar extends javax.swing.JFrame {

    Restaurante[] restaurantes;
    int avaliacao;
    String login;
    DAO dao = new DAO();

    /**
     * Creates new form ListaPendenteAprovacao
     */
    public ListaRestaurantesAvaliar(String login) {
        super("Restaurantes");
        initComponents();
        this.login = login;
        retornaListaRestaurantes();
        setResizable(false);

        
        String[] resultados = dao.retornaRestaurantesPorCNPJ(Integer.parseInt(login));
        // infos impressas na tela
        String nomeRestaurante = resultados[0];
        String mediaRestaurante = resultados[1];

        jTextField1nomeRest.setText(nomeRestaurante);
        jTextField3notaRest.setText(mediaRestaurante);
        jTextField2cnpjRest.setText(login);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jTextField1nomeRest = new javax.swing.JTextField();
        jTextField3notaRest = new javax.swing.JTextField();
        jTextField2cnpjRest = new javax.swing.JTextField();
        jTextField1usuarioAvaliador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1comentario = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton2avaliar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1980, 1020));

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox1.setBorder(null);
        jCheckBox1.setMaximumSize(new java.awt.Dimension(500, 20));
        jCheckBox1.setPreferredSize(new java.awt.Dimension(438, 500));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 27, 20, 20));

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 85, -1, -1));

        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 196, 20, -1));

        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));

        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, -1));

        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, -1));

        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, -1));

        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, -1, -1));

        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, -1, -1));

        jTextField1nomeRest.setEditable(false);
        jTextField1nomeRest.setBackground(new java.awt.Color(138, 142, 149));
        jTextField1nomeRest.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField1nomeRest.setDisabledTextColor(new java.awt.Color(196, 196, 196));
        jPanel1.add(jTextField1nomeRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 95, 220, 20));

        jTextField3notaRest.setEditable(false);
        jTextField3notaRest.setBackground(new java.awt.Color(138, 142, 149));
        jTextField3notaRest.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField3notaRest.setDisabledTextColor(new java.awt.Color(196, 196, 196));
        jPanel1.add(jTextField3notaRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 215, 220, 20));

        jTextField2cnpjRest.setEditable(false);
        jTextField2cnpjRest.setBackground(new java.awt.Color(138, 142, 149));
        jTextField2cnpjRest.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField2cnpjRest.setDisabledTextColor(new java.awt.Color(196, 196, 196));
        jPanel1.add(jTextField2cnpjRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 155, 220, 20));

        jTextField1usuarioAvaliador.setBackground(new java.awt.Color(138, 142, 149));
        jTextField1usuarioAvaliador.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jTextField1usuarioAvaliador, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 275, 220, 20));

        jTextArea1comentario.setBackground(new java.awt.Color(176, 217, 163));
        jTextArea1comentario.setColumns(20);
        jTextArea1comentario.setRows(5);
        jTextArea1comentario.setWrapStyleWord(true);
        jTextArea1comentario.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1comentario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 330, 150));

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 700, 610));

        jButton2avaliar.setText("Avaliar");
        jButton2avaliar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2avaliarMouseClicked(evt);
            }
        });
        jButton2avaliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2avaliarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2avaliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 533, 150, 60));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
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
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 230, 30));

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 50));

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

    private void jButton2avaliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2avaliarActionPerformed
        // TODO add your handling code here:

        try {
            dao.avaliarRestaurante(jTextField1usuarioAvaliador.getText(), Integer.parseInt(login), jTextArea1comentario.getText(), avaliacao);

            dao.atualizarAvaliacaoRestaurante(Integer.parseInt(login));

            GerenciamentoRestaurantes telaGerRest = new GerenciamentoRestaurantes(login);
            telaGerRest.setVisible(true);
            this.dispose();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar avaliar!");

        }

    }//GEN-LAST:event_jButton2avaliarActionPerformed

    private void jButton2avaliarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2avaliarMouseClicked

    }//GEN-LAST:event_jButton2avaliarMouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
            System.out.println("Selecionado");
            avaliacao++;
        } else {
            System.out.println("Não selecionado");
            avaliacao--;
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox2.isSelected()) {
            System.out.println("Selecionado");
            avaliacao++;
        } else {
            System.out.println("Não selecionado");
            avaliacao--;
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox3.isSelected()) {
            System.out.println("Selecionado");
            avaliacao++;
        } else {
            System.out.println("Não selecionado");
            avaliacao--;
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox4.isSelected()) {
            System.out.println("Selecionado");
            avaliacao++;
        } else {
            System.out.println("Não selecionado");
            avaliacao--;
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox5.isSelected()) {
            System.out.println("Selecionado");
            avaliacao++;
        } else {
            System.out.println("Não selecionado");
            avaliacao--;
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox6.isSelected()) {
            System.out.println("Selecionado");
            avaliacao++;
        } else {
            System.out.println("Não selecionado");
            avaliacao--;
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox7.isSelected()) {
            System.out.println("Selecionado");
            avaliacao++;
        } else {
            System.out.println("Não selecionado");
            avaliacao--;
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox8.isSelected()) {
            System.out.println("Selecionado");
            avaliacao++;
        } else {
            System.out.println("Não selecionado");
            avaliacao--;
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox9.isSelected()) {
            System.out.println("Selecionado");
            avaliacao++;
        } else {
            System.out.println("Não selecionado");
            avaliacao--;
        }
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox10.isSelected()) {
            System.out.println("Selecionado");
            avaliacao++;
        } else {
            System.out.println("Não selecionado");
            avaliacao--;
        }
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GerenciamentoRestaurantes gerRest = new GerenciamentoRestaurantes(login);
        gerRest.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    //Chama método no DAO para montar lista de restaurantes e retornar.
    private void retornaListaRestaurantes() {
        try {
            DAO dao = new DAO();
            restaurantes = dao.retornaListaRestaurantesCadastrados();
            List<String> listaDados = new ArrayList<>();

            for (int i = 0; i != restaurantes.length; i++) {
                if (restaurantes[i].getCnpjRestaurante().equals(login)) {
                    listaDados.add(" Nome do restaurante: " + restaurantes[i].getNomeRestaurante());
                }

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
                new ListaRestaurantesAvaliar("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2avaliar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1comentario;
    private javax.swing.JTextField jTextField1nomeRest;
    private javax.swing.JTextField jTextField1usuarioAvaliador;
    private javax.swing.JTextField jTextField2cnpjRest;
    private javax.swing.JTextField jTextField3notaRest;
    // End of variables declaration//GEN-END:variables
}
