/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo.gui;

import br.edu.ifnmg.projetocinemapoo.dao.ConexaoBd;
import br.edu.ifnmg.projetocinemapoo.entity.Funcionario;
import br.edu.ifnmg.projetocinemapoo.enums.TipoFuncionario;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Lucas
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
    private Funcionario funcionario;
    
    private Principal(Funcionario f) {
        initComponents();
        funcionario = f;
        if (funcionario.getTipoFuncionario() != TipoFuncionario.GERENTE) {
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
     
    
      private void anexarJanela(JInternalFrame janela) {
        if (!janela.isVisible()) {

            dskPrincipal.add(janela);

        }

        janela.setVisible(true);

         try {
            janela.setIcon(false);
            janela.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        janela.toFront();
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
        dskPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        mnuArquivoSair = new javax.swing.JMenuItem();
        mnuCadastros = new javax.swing.JMenu();
        mnuCadastrosFuncionario = new javax.swing.JMenuItem();
        mnuCadastrosGuiche = new javax.swing.JMenuItem();
        mnuCadastrosFilme = new javax.swing.JMenuItem();
        mnuCadastrosSala = new javax.swing.JMenuItem();
        mnuCadastrosGenero = new javax.swing.JMenuItem();
        mnuCadastrosSessao = new javax.swing.JMenuItem();
        mnuVenda = new javax.swing.JMenu();
        mnuVendaNova = new javax.swing.JMenuItem();
        mnuRelatorios = new javax.swing.JMenu();
        mnuRelatoriosFuncionarios = new javax.swing.JMenuItem();
        mnuRelatoriosSalas = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        javax.swing.GroupLayout dskPrincipalLayout = new javax.swing.GroupLayout(dskPrincipal);
        dskPrincipal.setLayout(dskPrincipalLayout);
        dskPrincipalLayout.setHorizontalGroup(
            dskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );
        dskPrincipalLayout.setVerticalGroup(
            dskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
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

        mnuCadastrosSessao.setText("Sessao");
        mnuCadastrosSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrosSessaoActionPerformed(evt);
            }
        });
        mnuCadastros.add(mnuCadastrosSessao);

        jMenuBar1.add(mnuCadastros);

        mnuVenda.setText("Venda");
        mnuVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVendaActionPerformed(evt);
            }
        });

        mnuVendaNova.setText("Nova");
        mnuVendaNova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVendaNovaActionPerformed(evt);
            }
        });
        mnuVenda.add(mnuVendaNova);

        jMenuBar1.add(mnuVenda);

        mnuRelatorios.setText("Relatorios");

        mnuRelatoriosFuncionarios.setText("Funcionarios");
        mnuRelatorios.add(mnuRelatoriosFuncionarios);

        mnuRelatoriosSalas.setText("Salas");
        mnuRelatoriosSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelatoriosSalasActionPerformed(evt);
            }
        });
        mnuRelatorios.add(mnuRelatoriosSalas);

        jMenuBar1.add(mnuRelatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPrincipal)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCadastrosSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrosSalaActionPerformed
        // TODO add your handling code here:
        CadastroSala janela = CadastroSala.getInstancia();
        anexarJanela(janela);
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
        CadastroGenero janela = CadastroGenero.getInstance();
        anexarJanela(janela);
    }//GEN-LAST:event_mnuCadastrosGeneroActionPerformed

    private void mnuCadastrosFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrosFilmeActionPerformed
        CadastroFilme.getInstance().setVisible(true);
    }//GEN-LAST:event_mnuCadastrosFilmeActionPerformed

    private void mnuCadastrosSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrosSessaoActionPerformed
        // TODO add your handling code here:
        CadastroSessao.getInstancia().setVisible(true);
    }//GEN-LAST:event_mnuCadastrosSessaoActionPerformed

    private void mnuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuVendaActionPerformed

    private void mnuVendaNovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVendaNovaActionPerformed
        // TODO add your handling code here:
        CadastroVenda.getInstancia(funcionario).setVisible(true);
    }//GEN-LAST:event_mnuVendaNovaActionPerformed

    private void mnuRelatoriosSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelatoriosSalasActionPerformed
        // TODO add your handling code here:
        try(InputStream in = getClass().getResourceAsStream("/RelatorioSalas.jasper")){
        
         JasperPrint jasperPrint = JasperFillManager.fillReport(in, null, ConexaoBd.getConexao());
         JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
         
//         jasperViewer.setTitle("Relatório de Salas");
//         jasperViewer.setVisible(true);
        
         
         JDialog dialog = new JDialog(this);
         dialog.setContentPane(jasperViewer.getContentPane());
         dialog.setSize(jasperViewer.getSize());
         dialog.setTitle("Relatório de Salas");
         dialog.setModal(true);
         dialog.setVisible(true);
        
        
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_mnuRelatoriosSalasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dskPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu mnuArquivo;
    private javax.swing.JMenuItem mnuArquivoSair;
    private javax.swing.JMenu mnuCadastros;
    private javax.swing.JMenuItem mnuCadastrosFilme;
    private javax.swing.JMenuItem mnuCadastrosFuncionario;
    private javax.swing.JMenuItem mnuCadastrosGenero;
    private javax.swing.JMenuItem mnuCadastrosGuiche;
    private javax.swing.JMenuItem mnuCadastrosSala;
    private javax.swing.JMenuItem mnuCadastrosSessao;
    private javax.swing.JMenu mnuRelatorios;
    private javax.swing.JMenuItem mnuRelatoriosFuncionarios;
    private javax.swing.JMenuItem mnuRelatoriosSalas;
    private javax.swing.JMenu mnuVenda;
    private javax.swing.JMenuItem mnuVendaNova;
    // End of variables declaration//GEN-END:variables
}
