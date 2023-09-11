/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.formapagamentos;

import Model.ModelFormaPagamento;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import view.usuario.jdcadastrarUsuario;

/**
 *
 * @author João
 */
public class jdCadastrarCartao extends javax.swing.JDialog {
    
    private boolean a = true;
    private boolean b = true;
    private boolean c = true;
    private boolean d = true;
    private boolean e = true;

    /**
     * Creates new form jdCadastrarCartao
     */
    public jdCadastrarCartao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jlCVV = new javax.swing.JLabel();
        txtCVV = new javax.swing.JTextField();
        jbLimpar = new javax.swing.JButton();
        jlNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jCBtipo = new javax.swing.JComboBox<>();
        jlNumero = new javax.swing.JLabel();
        jlValidade1 = new javax.swing.JLabel();
        txtNumeroCartao = new javax.swing.JTextField();
        jlValidade = new javax.swing.JLabel();
        txtValidade = new javax.swing.JTextField();
        jbSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jlCVV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlCVV.setText("CVV:");

        txtCVV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCVVActionPerformed(evt);
            }
        });
        txtCVV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCVVKeyReleased(evt);
            }
        });

        jbLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clear.png"))); // NOI18N
        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jlNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlNome.setText("Insira o nome impresso no cartão:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });

        jCBtipo.setEditable(true);
        jCBtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Débito", "Crédito" }));
        jCBtipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBtipoActionPerformed(evt);
            }
        });

        jlNumero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlNumero.setText("Número do cartão");

        jlValidade1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlValidade1.setText("Validade:");

        txtNumeroCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCartaoActionPerformed(evt);
            }
        });
        txtNumeroCartao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumeroCartaoKeyReleased(evt);
            }
        });

        jlValidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlValidade.setText("Selecione o tipo do cartão:");

        txtValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValidadeActionPerformed(evt);
            }
        });
        txtValidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValidadeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValidadeKeyTyped(evt);
            }
        });

        jbSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/check.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.setEnabled(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlValidade1))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCVV)
                            .addComponent(txtCVV, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtNumeroCartao, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlNumero)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNome, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jbLimpar)
                        .addGap(18, 18, 18))
                    .addComponent(jlValidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCBtipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCVV)
                            .addComponent(jlValidade1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCVV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlValidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpar)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCVVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCVVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCVVActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        // TODO add your handling code here:
        txtNome.setText(null);
        txtNumeroCartao.setText(null);
        txtValidade.setText(null);
        txtCVV.setText(null);
    }//GEN-LAST:event_jbLimparActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNumeroCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCartaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCartaoActionPerformed

    private void txtValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValidadeActionPerformed

    private void jCBtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBtipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBtipoActionPerformed

    private void txtValidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValidadeKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
       
        if(c != KeyEvent.VK_SLASH && !Character.isDigit(c)) {
           evt.consume();
        }
    }//GEN-LAST:event_txtValidadeKeyTyped

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
            // TODO add your handling code here:
            ModelFormaPagamento pagamento = new ModelFormaPagamento();

            pagamento.setNome(txtNome.getText());
            pagamento.setDescricao((String) jCBtipo.getSelectedItem());

            DAO.FormaPagamentoDAO.salvar(pagamento);
            JOptionPane.showMessageDialog(this, "Salvo com Sucesso!");
            this.dispose();
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        // TODO add your handling code here:
        a = btnEnable("[a-zA-Z]+", txtNome);
        enable();
    }//GEN-LAST:event_txtNomeKeyReleased

    private void txtNumeroCartaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroCartaoKeyReleased
        // TODO add your handling code here:
        b = btnEnable("[0-9]+", txtNumeroCartao);
        enable();
    }//GEN-LAST:event_txtNumeroCartaoKeyReleased

    private void txtValidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValidadeKeyReleased
        // TODO add your handling code here:
        c = btnEnable("[0-9-/]+", txtValidade);
        enable();
    }//GEN-LAST:event_txtValidadeKeyReleased

    private void txtCVVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCVVKeyReleased
        // TODO add your handling code here:
        d = btnEnable("[0-9]+", txtCVV);
        enable();
    }//GEN-LAST:event_txtCVVKeyReleased

    private boolean btnEnable(String regex, JTextField abc) {
        String tx = abc.getText();
        if (tx.matches(regex)) {
            abc.setForeground(Color.black);
            return true;

        } else {
            abc.setForeground(Color.red);
            abc.requestFocus();
            return false;
        }
    }

    @Override
    public void enable() {
        if (a && b && c && d && e) {
            jbSalvar.setEnabled(true);
        } else {
            jbSalvar.setEnabled(false);
        }

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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jdCadastrarCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdCadastrarCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdCadastrarCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdCadastrarCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdCadastrarCartao dialog = new jdCadastrarCartao(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCBtipo;
    private static javax.swing.JButton jbAlterar;
    private static javax.swing.JButton jbAlterar1;
    private javax.swing.JButton jbLimpar;
    private static javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlCVV;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel jlValidade;
    private javax.swing.JLabel jlValidade1;
    private javax.swing.JTextField txtCVV;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroCartao;
    private javax.swing.JTextField txtValidade;
    // End of variables declaration//GEN-END:variables
}