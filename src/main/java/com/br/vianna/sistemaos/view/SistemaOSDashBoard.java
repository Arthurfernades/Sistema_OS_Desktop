/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.br.vianna.sistemaos.view;

import com.br.vianna.sistemaos.DAO.impl.OrdemServicoDAO;
import com.br.vianna.sistemaos.model.OrdemServico;
import com.br.vianna.sistemaos.model.Usuario;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arthu
 */
public class SistemaOSDashBoard extends javax.swing.JFrame {

    /**
     * Creates new form SistemaOSDashBoard
     */
    public SistemaOSDashBoard() {
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

        jPanel1 = new javax.swing.JPanel();
        jBNovoChamado = new javax.swing.JButton();
        jBChamadosAbertos = new javax.swing.JButton();
        jBChamadosEncerrados = new javax.swing.JButton();
        jBPesquisarFuncionario = new javax.swing.JButton();
        jBPesquisarCliente = new javax.swing.JButton();
        jsTabelaDB = new javax.swing.JScrollPane();
        jtTabelaDB = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1293, 583));
        setMinimumSize(new java.awt.Dimension(1293, 583));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(63, 55, 201));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBNovoChamado.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBNovoChamado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cadastrar.png"))); // NOI18N
        jBNovoChamado.setText("Abrir novo chamado");
        jBNovoChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoChamadoActionPerformed(evt);
            }
        });

        jBChamadosAbertos.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBChamadosAbertos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/folder.png"))); // NOI18N
        jBChamadosAbertos.setText("Chamados abertos");
        jBChamadosAbertos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBChamadosAbertosActionPerformed(evt);
            }
        });

        jBChamadosEncerrados.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBChamadosEncerrados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/folder.png"))); // NOI18N
        jBChamadosEncerrados.setText("Chamados encerrados");
        jBChamadosEncerrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBChamadosEncerradosActionPerformed(evt);
            }
        });

        jBPesquisarFuncionario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBPesquisarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Lupa2.png"))); // NOI18N
        jBPesquisarFuncionario.setText("Pesquisar funcionários");
        jBPesquisarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarFuncionarioActionPerformed(evt);
            }
        });

        jBPesquisarCliente.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Lupa2.png"))); // NOI18N
        jBPesquisarCliente.setText("Pesquisar clientes");
        jBPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBPesquisarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBNovoChamado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBChamadosAbertos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBChamadosEncerrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBPesquisarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jBNovoChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBChamadosAbertos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBChamadosEncerrados, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBPesquisarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jtTabelaDB.setBackground(new java.awt.Color(255, 255, 255));
        jtTabelaDB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtTabelaDB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Protocolo", "Cliente", "Descrição", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jsTabelaDB.setViewportView(jtTabelaDB);

        jLabel1.setBackground(new java.awt.Color(63, 55, 201));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel1.setText("       Últimas Ordens de Serviço");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/db3.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/db1.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/db2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jsTabelaDB, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jsTabelaDB, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        try {

            ArrayList<OrdemServico> listaOS = new OrdemServicoDAO().buscarTodos();

            prencherTabela(listaOS);

        } catch (ClassNotFoundException | SQLException ex) {

            JOptionPane.showMessageDialog(this, "Problema ao acessar o Banco de Dados");

        }
    }//GEN-LAST:event_formWindowOpened

    private void jBNovoChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoChamadoActionPerformed
        
        OS novaOs = new OS(this, true);
        
        novaOs.setVisible(true);
        
    }//GEN-LAST:event_jBNovoChamadoActionPerformed

    private void jBChamadosAbertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBChamadosAbertosActionPerformed
        
        ChamadosAbertos ca = new ChamadosAbertos(this, true);
        
        ca.setVisible(true);
        
    }//GEN-LAST:event_jBChamadosAbertosActionPerformed

    private void jBChamadosEncerradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBChamadosEncerradosActionPerformed
        
        ChamadosFechados cf = new ChamadosFechados(this, true);
        
        cf.setVisible(true);
        
    }//GEN-LAST:event_jBChamadosEncerradosActionPerformed

    private void jBPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarClienteActionPerformed
        
        PesquisaCliente pCl = new PesquisaCliente(this, true);
        
        pCl.setVisible(true);
        
    }//GEN-LAST:event_jBPesquisarClienteActionPerformed

    private void jBPesquisarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarFuncionarioActionPerformed
        
        PesquisaFuncionario pF = new PesquisaFuncionario(this, true);
        
        pF.setVisible(true);
        
    }//GEN-LAST:event_jBPesquisarFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(SistemaOSDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaOSDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaOSDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaOSDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaOSDashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBChamadosAbertos;
    private javax.swing.JButton jBChamadosEncerrados;
    private javax.swing.JButton jBNovoChamado;
    private javax.swing.JButton jBPesquisarCliente;
    private javax.swing.JButton jBPesquisarFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jsTabelaDB;
    private javax.swing.JTable jtTabelaDB;
    // End of variables declaration//GEN-END:variables

    private void prencherTabela(ArrayList<OrdemServico> listaOS) {

        DefaultTableModel dftm = (DefaultTableModel) jtTabelaDB.getModel();

        while (dftm.getRowCount() > 0) {
            dftm.removeRow(0);
        }

        for (OrdemServico os : listaOS) {

            String[] linha = {""+os.getId(),os.getProtocolo(), os.getCliente().getNome(), os.getDescricao(), formataDataString(os.getInicio())};
            dftm.addRow(linha);

        }

    }
    
    private String formataDataString(Timestamp tempo) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedTimestamp = sdf.format(tempo);

        return formattedTimestamp;

    }
}
