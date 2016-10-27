/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.miltecnologia.gui;

import br.com.miltecnologia.models.Atleta;
import br.com.miltecnologia.models.Evento;
import br.com.miltecnologia.models.Luta;
import br.com.miltecnologia.service.Sorteio;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 *
 * @author luis
 */
public class Aplicacao extends javax.swing.JFrame {

    private Evento evento;

    /**
     * Creates new form Aplicacao
     */
    public Aplicacao() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelConfiguracao = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldEvento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jData = new org.jdesktop.swingx.JXDatePicker();
        jLabel3 = new javax.swing.JLabel();
        jTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jQtdAtleta = new javax.swing.JSpinner();
        jButtonProximo1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jQtdLuta = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelAtleta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonProximo2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanelSorteio = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButtonSortear = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabelEvento = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Evento:");

        jLabel2.setText("Data:");

        jData.setFormats(new SimpleDateFormat("dd/MM/yyyy" ));

        jLabel3.setText("Tipo:");

        jTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GP" }));

        jLabel4.setText("Atletas:");

        jButtonProximo1.setText("Próximo");
        jButtonProximo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximo1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Lutas:");

        javax.swing.GroupLayout jPanelConfiguracaoLayout = new javax.swing.GroupLayout(jPanelConfiguracao);
        jPanelConfiguracao.setLayout(jPanelConfiguracaoLayout);
        jPanelConfiguracaoLayout.setHorizontalGroup(
            jPanelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConfiguracaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanelConfiguracaoLayout.createSequentialGroup()
                        .addGroup(jPanelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEvento)
                            .addGroup(jPanelConfiguracaoLayout.createSequentialGroup()
                                .addComponent(jData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 148, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConfiguracaoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonProximo1))
                    .addGroup(jPanelConfiguracaoLayout.createSequentialGroup()
                        .addGroup(jPanelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelConfiguracaoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelConfiguracaoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jQtdAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelConfiguracaoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jQtdLuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelConfiguracaoLayout.setVerticalGroup(
            jPanelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConfiguracaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jQtdAtleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jQtdLuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonProximo1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Configuração", jPanelConfiguracao);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Atleta", "Equipe", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonProximo2.setText("Próximo");
        jButtonProximo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAtletaLayout = new javax.swing.GroupLayout(jPanelAtleta);
        jPanelAtleta.setLayout(jPanelAtletaLayout);
        jPanelAtletaLayout.setHorizontalGroup(
            jPanelAtletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAtletaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAtletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAtletaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelAtletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonProximo2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanelAtletaLayout.setVerticalGroup(
            jPanelAtletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAtletaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonProximo2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Atletas", jPanelAtleta);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Azul", "X", "Vermelho"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButtonSortear.setText("Sortear");
        jButtonSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSortearActionPerformed(evt);
            }
        });

        jLabel6.setText("Evento:");

        jLabel8.setText("Data:");

        jLabel10.setText("Lutas:");

        javax.swing.GroupLayout jPanelSorteioLayout = new javax.swing.GroupLayout(jPanelSorteio);
        jPanelSorteio.setLayout(jPanelSorteioLayout);
        jPanelSorteioLayout.setHorizontalGroup(
            jPanelSorteioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSorteioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSorteioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSorteioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelSorteioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSortear, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanelSorteioLayout.createSequentialGroup()
                        .addGroup(jPanelSorteioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelSorteioLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10)
                            .addGroup(jPanelSorteioLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelSorteioLayout.setVerticalGroup(
            jPanelSorteioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSorteioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSorteioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSorteioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSortear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sorteio", jPanelSorteio);

        jMenu1.setText("Administração");

        jMenuItem1.setText("Ranking");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonProximo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximo1ActionPerformed
        evento = new Evento(jTextFieldEvento.getText(), jData.getDate(), jTipo.getSelectedItem().toString(), (Integer) jQtdLuta.getValue());
//        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
//        dtm.setRowCount((Integer) jQtdAtleta.getValue());
//        jTable1.setModel(dtm);
        adicionarMassaDados();
        jTabbedPane1.setSelectedIndex(1);
        jTabbedPane1.setEnabledAt(0, false);
    }//GEN-LAST:event_jButtonProximo1ActionPerformed

    private void adicionarMassaDados() {
        Vector<Atleta> v = new Vector();
        Atleta iamik = new Atleta("Iamik", "Dragon", Atleta.RANKING_MAXIMO);
        v.add(iamik);
        Atleta helio = new Atleta("Helio", "V8", Atleta.RANKING_MAXIMO);
        v.add(helio);
        Atleta fernando = new Atleta("Fernando", "MTB", Atleta.RANKING_MEDIO);
        v.add(fernando);
        Atleta anderson = new Atleta("Anderson", "RKR", Atleta.RANKING_MEDIO);
        v.add(anderson);
        Atleta berg = new Atleta("Berg", "Barra", Atleta.RANKING_MEDIO);
        v.add(berg);
        Atleta gugu = new Atleta("Gugu", "Gladiadores", Atleta.RANKING_MINIMO);
        v.add(gugu);
        Atleta neto = new Atleta("Neto", "Black", Atleta.RANKING_MAXIMO);
        v.add(neto);
        Atleta andersonSilva = new Atleta("Anderson Silva", "Ferreira", Atleta.RANKING_MEDIO);
        v.add(andersonSilva);
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        if (dtm.getRowCount() > 0) {
            for (int i = 1; i <= dtm.getRowCount(); i++) {
                dtm.removeRow(i);
            }
        }
        v.stream().map((a) -> {
            Vector linha = new Vector();
            linha.add(a.getNome());
            linha.add(a.getEquipe());
            linha.add(a.getRanking());
            return linha;
        }).forEach((linha) -> {
            dtm.addRow(linha);
        });
        jTable1.setModel(dtm);
        jTable1.repaint();
    }

    private void jButtonProximo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximo2ActionPerformed
        List<Atleta> atletas = new ArrayList();
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        Vector<Vector> data = dtm.getDataVector();
        for (int i = 0; i < data.size(); i++) {
            Vector v = data.get(i);
            Atleta a = new Atleta((String) v.get(0), (String) v.get(1), (Integer) v.get(2));
            atletas.add(a);
        }
        evento.setAtletas(atletas);

        DefaultTableModel dtm2 = (DefaultTableModel) jTable2.getModel();
        dtm.setRowCount(evento.getQuantidadeDeLutas());
        jTable2.setModel(dtm2);
        jTabbedPane1.setSelectedIndex(2);
        jTabbedPane1.setEnabledAt(1, false);
    }//GEN-LAST:event_jButtonProximo2ActionPerformed

    private void jButtonSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSortearActionPerformed
        jLabelEvento.setText(evento.getNome());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        jLabelData.setText(sdf.format(jData.getDate()));
        jPanelSorteio.repaint();
        List atletas = new ArrayList(evento.getAtletas());
        List lutas = Sorteio.sortear(atletas, evento.getQuantidadeDeLutas());
        evento.setLutas(lutas);
        DefaultTableModel dtm2 = (DefaultTableModel) jTable2.getModel();
        dtm2.setRowCount(0);
        for (int i = 0; i < evento.getLutas().size(); i++) {
            Luta l = (Luta) evento.getLutas().get(i);
            Vector v = new Vector();
            v.add(l.getAzul());
            v.add("X");
            v.add(l.getVermelho());
            dtm2.addRow(v);
        }
        jTable2.setModel(dtm2);
        ajustaTable();
    }//GEN-LAST:event_jButtonSortearActionPerformed

    private void ajustaTable() {
        jTable2.getColumnModel().getColumn(1).setMaxWidth(30);
        DefaultTableCellHeaderRenderer headRendererCenter = new DefaultTableCellHeaderRenderer();
        headRendererCenter.setHorizontalAlignment(DefaultTableCellHeaderRenderer.CENTER);
        jTable2.getTableHeader().getColumnModel().getColumn(0).setHeaderRenderer(headRendererCenter);
        jTable2.getTableHeader().getColumnModel().getColumn(1).setHeaderRenderer(headRendererCenter);
        jTable2.getTableHeader().getColumnModel().getColumn(2).setHeaderRenderer(headRendererCenter);
        DefaultTableCellRenderer cellRendererCenter = new DefaultTableCellRenderer();
        cellRendererCenter.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        jTable2.getColumnModel().getColumn(0).setCellRenderer(cellRendererCenter);
        jTable2.getColumnModel().getColumn(1).setCellRenderer(cellRendererCenter);
        jTable2.getColumnModel().getColumn(2).setCellRenderer(cellRendererCenter);
        jTable2.repaint();
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonProximo1;
    private javax.swing.JButton jButtonProximo2;
    private javax.swing.JButton jButtonSortear;
    private org.jdesktop.swingx.JXDatePicker jData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelEvento;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanelAtleta;
    private javax.swing.JPanel jPanelConfiguracao;
    private javax.swing.JPanel jPanelSorteio;
    private javax.swing.JSpinner jQtdAtleta;
    private javax.swing.JSpinner jQtdLuta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldEvento;
    private javax.swing.JComboBox<String> jTipo;
    // End of variables declaration//GEN-END:variables
}
