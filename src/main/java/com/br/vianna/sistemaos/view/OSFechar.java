/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.br.vianna.sistemaos.view;

import com.br.vianna.sistemaos.DAO.impl.OrdemServicoDAO;
import com.br.vianna.sistemaos.model.OrdemServico;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author arthu
 */
public class OSFechar extends javax.swing.JDialog {

    /**
     * Creates new form OSConsulta
     */
    public OSFechar(java.awt.Frame parent, boolean modal) {
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

        jPOs = new javax.swing.JPanel();
        jlCliente = new javax.swing.JLabel();
        jtCliente = new javax.swing.JTextField();
        jlFuncinario = new javax.swing.JLabel();
        jtFuncionario = new javax.swing.JTextField();
        jlProtocolo = new javax.swing.JLabel();
        jtProtocolo = new javax.swing.JTextField();
        jlAberturaChamado = new javax.swing.JLabel();
        jtAberturaChamado = new javax.swing.JTextField();
        jlFechamentoChamado = new javax.swing.JLabel();
        jtFechamentoChamado = new javax.swing.JTextField();
        jlDescricao = new javax.swing.JLabel();
        ispDescricao = new javax.swing.JScrollPane();
        jtaDescricao = new javax.swing.JTextArea();
        jlValor = new javax.swing.JLabel();
        jfValor = new javax.swing.JFormattedTextField();
        jlImageOS = new javax.swing.JLabel();
        jBFecharChamado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPOs.setBackground(new java.awt.Color(63, 55, 201));
        jPOs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPOs.setMaximumSize(new java.awt.Dimension(1250, 690));
        jPOs.setMinimumSize(new java.awt.Dimension(1250, 690));

        jlCliente.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jlCliente.setForeground(new java.awt.Color(0, 0, 0));
        jlCliente.setText("Cliente:");

        jtCliente.setEditable(false);
        jtCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtCliente.setEnabled(false);

        jlFuncinario.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jlFuncinario.setForeground(new java.awt.Color(0, 0, 0));
        jlFuncinario.setText("Funionário:");

        jtFuncionario.setEditable(false);
        jtFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtFuncionario.setEnabled(false);

        jlProtocolo.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jlProtocolo.setForeground(new java.awt.Color(0, 0, 0));
        jlProtocolo.setText("Protocolo:");

        jtProtocolo.setEditable(false);
        jtProtocolo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtProtocolo.setEnabled(false);

        jlAberturaChamado.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jlAberturaChamado.setForeground(new java.awt.Color(0, 0, 0));
        jlAberturaChamado.setText("Abertura do chamado:");
        jlAberturaChamado.setAlignmentX(0.5F);

        jtAberturaChamado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtAberturaChamado.setEnabled(false);

        jlFechamentoChamado.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jlFechamentoChamado.setForeground(new java.awt.Color(0, 0, 0));
        jlFechamentoChamado.setText("Fechamento do chamado:");

        jtFechamentoChamado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtFechamentoChamado.setEnabled(false);

        jlDescricao.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jlDescricao.setForeground(new java.awt.Color(0, 0, 0));
        jlDescricao.setText("Descrição:");

        jtaDescricao.setColumns(20);
        jtaDescricao.setRows(5);
        jtaDescricao.setToolTipText("");
        jtaDescricao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtaDescricao.setEnabled(false);
        ispDescricao.setViewportView(jtaDescricao);

        jlValor.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jlValor.setForeground(new java.awt.Color(0, 0, 0));
        jlValor.setText("Valor:");

        jfValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        jfValor.setEnabled(false);

        jlImageOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/OSImage.png"))); // NOI18N

        jBFecharChamado.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBFecharChamado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cadastrar.png"))); // NOI18N
        jBFecharChamado.setText("Fechar chamado");
        jBFecharChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharChamadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPOsLayout = new javax.swing.GroupLayout(jPOs);
        jPOs.setLayout(jPOsLayout);
        jPOsLayout.setHorizontalGroup(
            jPOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOsLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPOsLayout.createSequentialGroup()
                        .addComponent(jBFecharChamado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPOsLayout.createSequentialGroup()
                        .addGroup(jPOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPOsLayout.createSequentialGroup()
                                .addGroup(jPOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlFuncinario)
                                    .addComponent(jlCliente)
                                    .addComponent(jlProtocolo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPOsLayout.createSequentialGroup()
                                        .addGroup(jPOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(99, 99, 99)
                                        .addGroup(jPOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlFechamentoChamado)
                                            .addComponent(jlAberturaChamado))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtAberturaChamado, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                            .addComponent(jtFechamentoChamado)))))
                            .addGroup(jPOsLayout.createSequentialGroup()
                                .addGroup(jPOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ispDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlDescricao)
                                    .addGroup(jPOsLayout.createSequentialGroup()
                                        .addComponent(jlValor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(jlImageOS, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(17, Short.MAX_VALUE))))
        );
        jPOsLayout.setVerticalGroup(
            jPOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOsLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPOsLayout.createSequentialGroup()
                        .addGroup(jPOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCliente)
                            .addComponent(jtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlFuncinario)
                            .addComponent(jtFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlProtocolo)
                            .addComponent(jtProtocolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jlDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ispDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlValor)
                            .addComponent(jfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addComponent(jBFecharChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(jPOsLayout.createSequentialGroup()
                        .addGroup(jPOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlAberturaChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtAberturaChamado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPOsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlFechamentoChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtFechamentoChamado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlImageOS, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 115, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPOs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPOs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

    private void jBFecharChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharChamadoActionPerformed

        if (JOptionPane.showConfirmDialog(null, "Deseja fechar a Ordem de Serviço?",
                "Fechar OS", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            os.finalizar();
            try {
                
                new OrdemServicoDAO().editar(os);
                
                jtFechamentoChamado.setText(formataDataString(os.getFim()));
                
                JOptionPane.showMessageDialog(this, "OS fechada com sucesso!");
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(OSFechar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBFecharChamadoActionPerformed

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
            java.util.logging.Logger.getLogger(OSFechar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OSFechar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OSFechar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OSFechar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OSFechar dialog = new OSFechar(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane ispDescricao;
    private javax.swing.JButton jBFecharChamado;
    private javax.swing.JPanel jPOs;
    private javax.swing.JFormattedTextField jfValor;
    private javax.swing.JLabel jlAberturaChamado;
    private javax.swing.JLabel jlCliente;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlFechamentoChamado;
    private javax.swing.JLabel jlFuncinario;
    private javax.swing.JLabel jlImageOS;
    private javax.swing.JLabel jlProtocolo;
    private javax.swing.JLabel jlValor;
    private javax.swing.JTextField jtAberturaChamado;
    private javax.swing.JTextField jtCliente;
    private javax.swing.JTextField jtFechamentoChamado;
    private javax.swing.JTextField jtFuncionario;
    private javax.swing.JTextField jtProtocolo;
    private javax.swing.JTextArea jtaDescricao;
    // End of variables declaration//GEN-END:variables

    OrdemServico os;

    void preparedEdit(OrdemServico os) {

        this.os = os;

        jtCliente.setText(os.getCliente().getNome());
        jtFuncionario.setText(os.getFuncionario().getNome());
        jtProtocolo.setText(os.getProtocolo());
        jtAberturaChamado.setText(formataDataString(os.getInicio()));
        jtaDescricao.setText(os.getDescricao());

        DecimalFormat formato = new DecimalFormat("#.##");
        jfValor.setText(formato.format(os.getValor()));
    }

    private String formataDataString(Timestamp tempo) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedTimestamp = sdf.format(tempo);

        return formattedTimestamp;

    }
}
