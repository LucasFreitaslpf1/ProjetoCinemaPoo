/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo.gui;

import br.edu.ifnmg.projetocinemapoo.entity.Funcionario;
import br.edu.ifnmg.projetocinemapoo.enums.TipoFuncionario;

/**
 *
 * @author Lucas
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    private Principal(Funcionario f) {
        initComponents();

        if (f.getTipoFuncionario() != TipoFuncionario.GERENTE) {
            mnuRelatorios.setEnabled(false);
            mnuCadastrosFuncionario.setEnabled(false);
            mnuCadastrosGuiche.setEnabled(false);
        }
    }

    public static Principal principal;

    public static Principal getInstancia(Funcionario f) {
        if (principal == null) {
            principal = new Principal(f);
        }
        return principal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        mnuArquivoSair = new javax.swing.JMenuItem();
        mnuCadastros = new javax.swing.JMenu();
        mnuCadastrosFuncionario = new javax.swing.JMenuItem();
        mnuCadastrosGuiche = new javax.swing.JMenuItem();
        mnuCadastrosFilme = new javax.swing.JMenuItem();
        mnuCadastrosSala = new javax.swing.JMenuItem();
        mnuCadastrosGenero = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuRelatorios = new javax.swing.JMenu();
        mnuRelatoriosFuncionarios = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        mnuArquivo.setText("Arquivo");

        mnuArquivoSair.setText("Sair");
        mnuArquivoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArquivoSairActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuArquivoSair);

        jMenuBar1.add(mnuArquivo);

        mnuCadastros.setText("Cadastros");

        mnuCadastrosFuncionario.setText("Funcionario");
        mnuCadastrosFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrosFuncionarioActionPerformed(evt);
            }
        });
        mnuCadastros.add(mnuCadastrosFuncionario);

        mnuCadastrosGuiche.setText("Guiche");
        mnuCadastrosGuiche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrosGuicheActionPerformed(evt);
            }
        });
        mnuCadastros.add(mnuCadastrosGuiche);

        mnuCadastrosFilme.setText("Filme");
        mnuCadastrosFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrosFilmeActionPerformed(evt);
            }
        });
        mnuCadastros.add(mnuCadastrosFilme);

        mnuCadastrosSala.setText("Sala");
        mnuCadastrosSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrosSalaActionPerformed(evt);
            }
        });
        mnuCadastros.add(mnuCadastrosSala);

        mnuCadastrosGenero.setText("Genero");
        mnuCadastrosGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrosGeneroActionPerformed(evt);
            }
        });
        mnuCadastros.add(mnuCadastrosGenero);

        jMenuItem2.setText("Sessao");
        mnuCadastros.add(jMenuItem2);

        jMenuBar1.add(mnuCadastros);

        jMenu2.setText("Venda");
        jMenuBar1.add(jMenu2);

        mnuRelatorios.setText("Relatorios");

        mnuRelatoriosFuncionarios.setText("Funcionarios");
        mnuRelatorios.add(mnuRelatoriosFuncionarios);

        jMenuBar1.add(mnuRelatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCadastrosSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrosSalaActionPerformed
        // TODO add your handling code here:
        CadastroSala.getInstancia().setVisible(true);
    }//GEN-LAST:event_mnuCadastrosSalaActionPerformed

    private void mnuCadastrosFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrosFuncionarioActionPerformed
        // TODO add your handling code here:
        CadastroFuncionarios cf = CadastroFuncionarios.getInstancia();
        cf.setVisible(true);
    }//GEN-LAST:event_mnuCadastrosFuncionarioActionPerformed

    private void mnuArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArquivoSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_mnuArquivoSairActionPerformed

    private void mnuCadastrosGuicheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrosGuicheActionPerformed
        // TODO add your handling code here:
        CadastroGuiche.getInstancia().setVisible(true);
    }//GEN-LAST:event_mnuCadastrosGuicheActionPerformed

    private void mnuCadastrosGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrosGeneroActionPerformed
        CadastroGenero.getInstance().setVisible(true);
    }//GEN-LAST:event_mnuCadastrosGeneroActionPerformed

    private void mnuCadastrosFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrosFilmeActionPerformed
        CadastroFilme.getInstance().setVisible(true);
    }//GEN-LAST:event_mnuCadastrosFilmeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnuArquivo;
    private javax.swing.JMenuItem mnuArquivoSair;
    private javax.swing.JMenu mnuCadastros;
    private javax.swing.JMenuItem mnuCadastrosFilme;
    private javax.swing.JMenuItem mnuCadastrosFuncionario;
    private javax.swing.JMenuItem mnuCadastrosGenero;
    private javax.swing.JMenuItem mnuCadastrosGuiche;
    private javax.swing.JMenuItem mnuCadastrosSala;
    private javax.swing.JMenu mnuRelatorios;
    private javax.swing.JMenuItem mnuRelatoriosFuncionarios;
    // End of variables declaration//GEN-END:variables
}
