/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo.dao;

import br.edu.ifnmg.projetocinemapoo.entity.Venda;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dayan
 */
public class VendaDao extends Dao<Venda, Long> {

    @Override
    public String obterSentencaInsert() {
        return "insert into venda (id, codigovenda, quantidade, valortotal) values (default, ?, ?, ?); ";
    }

    @Override
    public String obterSentencaUpdate() {
        return "update venda set codigovenda = ?, quantidade = ?,valortotal = ? where id = ?;";
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Venda e) {
        try {
            pstmt.setLong(1, e.getCodigoVenda());
            pstmt.setShort(2, e.getQuantidade());
            pstmt.setDouble(3, e.getValorTotal());

            if (e.getId() != null && e.getId() != 0) {
                pstmt.setLong(4, e.getId());
            }

        } catch (SQLException ex) {
            System.out.println("Exceptoin: " + ex);
        }
    }

    @Override
    public String obterSentencaLocalizarPorId() {
        return "SELECT * FROM venda WHERE id = ?";
    }

    @Override
    public Venda extrairObjeto(ResultSet resultSet) {
        Venda v = new Venda();

        try {
            v.setId(resultSet.getLong("id"));
            v.setCodigoVenda(resultSet.getLong("codigovenda"));
            v.setQuantidade(resultSet.getShort("quantidade"));
            v.setValorTotal(resultSet.getDouble("valortotal"));

        } catch (SQLException ex) {
            Logger.getLogger(VendaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return v;
    }

    @Override
    public String obterSentencaLocalizarTodos() {
        return "select id, codigovenda, quantidade, valortotal from venda;";
    }

    @Override
    public List<Venda> extrairObjetos(ResultSet rs) {
        
        ArrayList<Venda> v = new ArrayList<>();

        try {

            while (rs.next()) {

                v.add(extrairObjeto(rs));
            }

        } catch (SQLException ex) {
            Logger.getLogger(VendaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return v;
    }

}
