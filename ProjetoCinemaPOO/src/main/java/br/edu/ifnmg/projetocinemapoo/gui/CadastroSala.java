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

        pnlCadastroSala = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblCapacidade = new javax.swing.JLabel();
        txtCapacidade = new javax.swing.JTextField();
        lblTela = new javax.swing.JLabel();
        txtTela = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();

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

        txtTela.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastroSalaLayout = new javax.swing.GroupLayout(pnlCadastroSala);
        pnlCadastroSala.setLayout(pnlCadastroSalaLayout);
        pnlCadastroSalaLayout.setHorizontalGroup(
            pnlCadastroSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroSalaLayout.createSequentialGroup()
                .addContainerGap()
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
                            .addComponent(txtTela, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCadastroSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCapacidade, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNumero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pnlCadastroSalaLayout.setVerticalGroup(
            pnlCadastroSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroSalaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlCadastroSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastroSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCapacidade)
                    .addComponent(txtCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastroSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastroSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastroSala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Sala sala = new Sala();
        sala.setNumero(Integer.parseInt(txtNumero.getText()));
        sala.setCapacidade(Integer.parseInt(txtCapacidade.getText()));
        sala.setTela(Tela.valueOf(txtTela.getText()));
        
         Sala s = new SalaDao().localizarPorNumero(sala.getNumero());
        if(s != null){
            JOptionPane.showMessageDialog(null, "Sala já cadastrada");            
        } else{
            
            Long id = new SalaDao().salvar(sala);
            sala.setId(id);
            limparCampos();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    
     private void limparCampos() {
     
       txtNumero.setText(null);
       txtCapacidade.setText(null);
       txtTela.setText(null);
       
       txtNumero.requestFocus();
     
     }
    
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCapacidade;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblTela;
    private javax.swing.JPanel pnlCadastroSala;
    private javax.swing.JTextField txtCapacidade;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtTela;
    // End of variables declaration//GEN-END:variables
}
