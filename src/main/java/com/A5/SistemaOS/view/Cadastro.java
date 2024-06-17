/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.A5.SistemaOS.view;

import com.A5.SistemaOS.dao.AdministradorDao;
import com.A5.SistemaOS.dao.FuncionarioDao;
import com.A5.SistemaOS.model.Administrador;
import com.A5.SistemaOS.model.Funcionario;
import com.A5.SistemaOS.model.Usuario;
import lombok.Setter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.JOptionPane;

/**
 *
 * @author arthu
 */
public class Cadastro extends javax.swing.JDialog {

    /**
     * Creates new form SistemaOSCadastro
     */

    @Setter
    private FuncionarioDao fDao;

    @Setter
    private AdministradorDao aDao;

    public Cadastro(java.awt.Frame parent, boolean modal) {
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

        jlNome = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jlLoginCadastro = new javax.swing.JLabel();
        jtLoginCadastro = new javax.swing.JTextField();
        jlSenhaCadastro = new javax.swing.JLabel();
        jpSenhaCadastro = new javax.swing.JPasswordField();
        jlEmail = new javax.swing.JLabel();
        jtEmail = new javax.swing.JTextField();
        jlTipo = new javax.swing.JLabel();
        jcbTipo = new javax.swing.JComboBox<>();
        jbCriar = new javax.swing.JButton();
        jbCancelarCadastro = new javax.swing.JButton();
        jlImgCadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(640, 360));
        setResizable(false);

        jlNome.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        jlNome.setForeground(new java.awt.Color(130, 168, 248));
        jlNome.setText("Nome:");

        jlLoginCadastro.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        jlLoginCadastro.setForeground(new java.awt.Color(130, 168, 248));
        jlLoginCadastro.setText("Login:");

        jtLoginCadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtLoginCadastroFocusLost(evt);
            }
        });

        jlSenhaCadastro.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        jlSenhaCadastro.setForeground(new java.awt.Color(130, 168, 248));
        jlSenhaCadastro.setText("Senha:");

        jpSenhaCadastro.setName(""); // NOI18N

        jlEmail.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        jlEmail.setForeground(new java.awt.Color(130, 168, 248));
        jlEmail.setText("E-mail:");

        jtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtEmailFocusLost(evt);
            }
        });

        jlTipo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        jlTipo.setForeground(new java.awt.Color(130, 168, 248));
        jlTipo.setText("Tipo:");

        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Funcionario", "Administrador" }));

        jbCriar.setBackground(new java.awt.Color(100, 90, 166));
        jbCriar.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16)); // NOI18N
        jbCriar.setForeground(new java.awt.Color(255, 255, 255));
        jbCriar.setText("Criar");
        jbCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCriarActionPerformed(evt);
            }
        });

        jbCancelarCadastro.setBackground(new java.awt.Color(100, 90, 166));
        jbCancelarCadastro.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16)); // NOI18N
        jbCancelarCadastro.setForeground(new java.awt.Color(255, 255, 255));
        jbCancelarCadastro.setText("Cancelar");
        jbCancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarCadastroActionPerformed(evt);
            }
        });

        jlImgCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/OsCadastro.png"))); // NOI18N
        jlImgCadastro.setMaximumSize(new java.awt.Dimension(640, 360));
        jlImgCadastro.setMinimumSize(new java.awt.Dimension(640, 360));
        jlImgCadastro.setPreferredSize(new java.awt.Dimension(640, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jbCancelarCadastro))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlLoginCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtLoginCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlSenhaCadastro)
                            .addComponent(jlEmail)
                            .addComponent(jlTipo))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtEmail)
                                    .addComponent(jpSenhaCadastro)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlImgCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlImgCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLoginCadastro)
                    .addComponent(jtLoginCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSenhaCadastro)
                    .addComponent(jpSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEmail)
                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTipo)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jbCancelarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarCadastroActionPerformed

        setVisible(false);
    }//GEN-LAST:event_jbCancelarCadastroActionPerformed

    private void jbCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCriarActionPerformed

        if (verificaCamposObrigatorios()) {

                if (jcbTipo.getSelectedItem().toString().equals("Administrador")) {

                    String senha = JOptionPane.showInputDialog("Senha mestra:");

                    if (!senha.equals("123")) {

                        JOptionPane.showMessageDialog(this, "Senha mestra incorreta!");
                        jcbTipo.setSelectedIndex(0);

                    } else {

                        if (usuario == null) {

                            Administrador adm = new Administrador();

                            adm.setEmail(jtEmail.getText());
                            adm.setLogin(jtLoginCadastro.getText());
                            adm.setNome(jtNome.getText());
                            adm.setSenha(jpSenhaCadastro.getText());

                            aDao.save(adm);

                            JOptionPane.showMessageDialog(this, "Cadastro realziado com sucesso!");

                        } else {

                            Administrador adm = (Administrador) usuario;

                            adm.setEmail(jtEmail.getText());
                            adm.setLogin(jtLoginCadastro.getText());
                            adm.setNome(jtNome.getText());
                            adm.setSenha(jpSenhaCadastro.getText());

                            aDao.save(adm);

                            JOptionPane.showMessageDialog(this, "Usuário alterado com sucesso!");

                        }

                        setVisible(false);
                    }
                } else if (jcbTipo.getSelectedItem().toString().equals("Funcionario")) {

                    if (usuario == null) {

                        Funcionario func = new Funcionario();

                        func.setEmail(jtEmail.getText());
                        func.setLogin(jtLoginCadastro.getText());
                        func.setNome(jtNome.getText());
                        func.setSenha(jpSenhaCadastro.getText());

                        fDao.save(func);

                        JOptionPane.showMessageDialog(this, "Cadastro realziado com sucesso!");

                    } else {

                        Funcionario func = (Funcionario) usuario;

                        func.setEmail(jtEmail.getText());
                        func.setLogin(jtLoginCadastro.getText());
                        func.setNome(jtNome.getText());
                        func.setSenha(jpSenhaCadastro.getText());

                        fDao.save(func);

                        JOptionPane.showMessageDialog(this, "Usuário alterado com sucesso!");

                    }
                    setVisible(false);
                }

        } else {

            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");

        }

    }//GEN-LAST:event_jbCriarActionPerformed

    private void jtLoginCadastroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtLoginCadastroFocusLost

            Funcionario f = fDao.findByLogin(jtLoginCadastro.getText());

            if (f != null) {

                JOptionPane.showMessageDialog(this, "Nome de login já cadastrado!");
            }

    }//GEN-LAST:event_jtLoginCadastroFocusLost

    private void jtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtEmailFocusLost

            Usuario u = fDao.findByEmail(jtEmail.getText());

            if (u != null) {

                JOptionPane.showMessageDialog(this, "E-mail já cadastrado!");
            }

    }//GEN-LAST:event_jtEmailFocusLost

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
            java.util.logging.Logger.getLogger(Cadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cadastro dialog = new Cadastro(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jbCancelarCadastro;
    private javax.swing.JButton jbCriar;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlImgCadastro;
    private javax.swing.JLabel jlLoginCadastro;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlSenhaCadastro;
    private javax.swing.JLabel jlTipo;
    private javax.swing.JPasswordField jpSenhaCadastro;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtLoginCadastro;
    private javax.swing.JTextField jtNome;
    // End of variables declaration//GEN-END:variables

    private Usuario usuario;

    private boolean verificaCamposObrigatorios() {
        if (jtNome.getText().equalsIgnoreCase("")
                || jtLoginCadastro.getText().equalsIgnoreCase("")
                || jpSenhaCadastro.getText().equalsIgnoreCase("")
                || jtEmail.getText().equalsIgnoreCase("")
                || jcbTipo.getSelectedItem().toString().equalsIgnoreCase("")) {
            return false;
        }

        return true;
    }

    void preparedEdit(Usuario usuario) {

        this.usuario = usuario;

        jtNome.setText(usuario.getNome());
        jtLoginCadastro.setText(usuario.getLogin());
        jpSenhaCadastro.setText(usuario.getSenha());
        jtEmail.setText(usuario.getEmail());

    }
}
