/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo.gui;

import br.edu.ifnmg.projetocinemapoo.dao.SalaDao;
import br.edu.ifnmg.projetocinemapoo.entity.Sala;
import br.edu.ifnmg.projetocinemapoo.enums.Tela;
import javax.swing.JOptionPane;

/**
 *
 * @author dayan
 */
public class CadastroSala extends javax.swing.JFrame {

    /**
     * Creates new form CadastroSala
     */
    private CadastroSala() {
        initComponents();
        rdb2D.setSelected(true);
    }
    
    private static CadastroSala cadastroSala;
    
    public static CadastroSala getInstancia(){
        if(cadastroSala == null){
            cadastroSala = new CadastroSala();
        }
        return cadastroSala;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgTela = new javax.swing.ButtonGroup();
        pnlCadastroSala = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblCapacidade = new javax.swing.JLabel();
        txtCapacidade = new javax.swing.JTextField();
        lblTela = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        rdb3D = new javax.swing.JRadioButton();
        rdb2D = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Salas");
        setName("frmCadastroSala"); // NOI18N
        setResizable(false);

        lblNumero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNumero.setText("Número:");

        txtNumero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblCapacidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCapacidade.setText("Capacidade:");

        txtCapacidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblTela.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTela.setText("Tela:");

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btgTela.add(rdb3D);
        rdb3D.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdb3D.setText("3D");
        rdb3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb3DActionPerformed(evt);
            }
        });

        btgTela.add(rdb2D);
        rdb2D.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdb2D.setText("2D");

        javax.swing.GroupLayout pnlCadastroSalaLayout = new javax.swing.GroupLayout(pnlCadastroSala);
        pnlCadastroSala.setLayout(pnlCadastroSalaLayout);
        pnlCadastroSalaLayout.setHorizontalGroup(
            pnlCadastroSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroSalaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCadastroSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvar)
                    .addGroup(pnlCadastroSalaLayout.createSequentialGroup()
                        .addGroup(pnlCadastroSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCadastroSalaLayout.createSequentialGroup()
                                .addComponent(lblNumero)
                                .addGap(18, 18, 18))
                            .addGroup(pnlCadastroSalaLayout.createSequentialGroup()
                                .addGroup(pnlCadastroSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTela)
                                    .addComponent(lblCapacidade))
                                .addGap(18, 18, 18)))
                        .addGroup(pnlCadastroSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCapacidade, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroSalaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCadastroSalaLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(rdb3D)
                                .addGap(28, 28, 28)
                                .addComponent(rdb2D)
                                .addContainerGap())))))
        );
        pnlCadastroSalaLayout.setVerticalGroup(
            pnlCadastroSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroSalaLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(pnlCadastroSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastroSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCapacidade)
                    .addComponent(txtCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastroSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTela)
                    .addComponent(rdb3D)
                    .addComponent(rdb2D))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastroSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlCadastroSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Sala sala = new Sala();
        sala.setNumero(Integer.parseInt(txtNumero.getText()));
        sala.setCapacidade(Integer.parseInt(txtCapacidade.getText()));
        
        if(rdb2D.isSelected()){
            sala.setTela(Tela._2D);
        } else{
            sala.setTela(Tela._3D);
        }
        
         Sala s = new SalaDao().localizarPorNumero(sala.getNumero());
        if(s != null){
            JOptionPane.showMessageDialog(null, "Sala já cadastrada");            
        } else{
            
            Long id = new SalaDao().salvar(sala);
            sala.setId(id);
            limparCampos();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void rdb3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb3DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb3DActionPerformed

    /**
     * @param args the command line arguments
     */
    
     private void limparCampos() {
     
       txtNumero.setText(null);
       txtCapacidade.setText(null);
       rdb2D.setSelected(true);
       
       txtNumero.requestFocus();
     
     }
    
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgTela;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCapacidade;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblTela;
    private javax.swing.JPanel pnlCadastroSala;
    private javax.swing.JRadioButton rdb2D;
    private javax.swing.JRadioButton rdb3D;
    private javax.swing.JTextField txtCapacidade;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
