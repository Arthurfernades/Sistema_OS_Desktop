/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.br.vianna.sistemaos.view;

import com.br.vianna.sistemaos.DAO.impl.UsuarioDAO;
import com.br.vianna.sistemaos.model.Usuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author arthu
 */
public class SistemaOSLoginUsuario extends javax.swing.JDialog {

    /**
     * Creates new form SistemaOSLoginUsuario
     */
    public SistemaOSLoginUsuario(java.awt.Frame parent, boolean modal) {
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

        jlLogin = new javax.swing.JLabel();
        jtLogin = new javax.swing.JTextField();
        jlSenhaLogin = new javax.swing.JLabel();
        jpSenhaLogin = new javax.swing.JPasswordField();
        jbEntrar = new javax.swing.JButton();
        jbCancelarLogin = new javax.swing.JButton();
        jlImgLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 360));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jlLogin.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        jlLogin.setForeground(new java.awt.Color(130, 168, 248));
        jlLogin.setText("Login:");

        jlSenhaLogin.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        jlSenhaLogin.setForeground(new java.awt.Color(130, 168, 248));
        jlSenhaLogin.setText("Senha:");

        jpSenhaLogin.setName(""); // NOI18N

        jbEntrar.setBackground(new java.awt.Color(100, 90, 166));
        jbEntrar.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16)); // NOI18N
        jbEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jbEntrar.setText("Entrar");
        jbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarActionPerformed(evt);
            }
        });

        jbCancelarLogin.setBackground(new java.awt.Color(100, 90, 166));
        jbCancelarLogin.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16)); // NOI18N
        jbCancelarLogin.setForeground(new java.awt.Color(255, 255, 255));
        jbCancelarLogin.setText("Cancelar");
        jbCancelarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarLoginActionPerformed(evt);
            }
        });

        jlImgLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/OsLogin.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlImgLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jbEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jbCancelarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlSenhaLogin)
                                .addGap(35, 35, 35)
                                .addComponent(jpSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlImgLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlLogin))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSenhaLogin)
                            .addComponent(jpSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbCancelarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarLoginActionPerformed

        SistemaOSInicial inicial = new SistemaOSInicial();

        setVisible(false);
        dispose();
        
        inicial.setVisible(true);
    }//GEN-LAST:event_jbCancelarLoginActionPerformed

    private void jbEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarActionPerformed
        
        SistemaOSDashBoard db = new SistemaOSDashBoard();
        
        if (verificaCampos()) {

            try {
                Usuario user = new UsuarioDAO().buscarPorLoginESenha(jtLogin.getText(), jpSenhaLogin.getText());

                if (user == null) {
                    
                    JOptionPane.showMessageDialog(this, "Senha ou Usuário incorreto(s)");
                    jpSenhaLogin.setText("");
                    
                } else {
                    
                    setVisible(false);
                    
                    db.setVisible(true);

                }

            } catch (ClassNotFoundException | SQLException ex) {

                JOptionPane.showMessageDialog(this, "Problema ao acessar o Banco de Dados");

            }

        } else {

            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");

        }
        
    }//GEN-LAST:event_jbEntrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        SistemaOSInicial inicial = new SistemaOSInicial();

        inicial.setVisible(false);
        inicial.dispose();
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(SistemaOSLoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaOSLoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaOSLoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaOSLoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SistemaOSLoginUsuario dialog = new SistemaOSLoginUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jbCancelarLogin;
    private javax.swing.JButton jbEntrar;
    private javax.swing.JLabel jlImgLogin;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlSenhaLogin;
    private javax.swing.JPasswordField jpSenhaLogin;
    private javax.swing.JTextField jtLogin;
    // End of variables declaration//GEN-END:variables

    private boolean verificaCampos() {
        if (jtLogin.getText().equalsIgnoreCase("")
                || jpSenhaLogin.getText().equalsIgnoreCase("")) {
            return false;
        }
        return true;
    }
    
    private Usuario usuarioLogado;

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
    
}