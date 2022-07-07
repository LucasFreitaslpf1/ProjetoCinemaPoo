/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo.dao;

import br.edu.ifnmg.projetocinemapoo.entity.Guiche;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas
 */
public class GuicheDao extends Dao<Guiche, Long> {

    @Override
    public String obterSentencaInsert() {
        return "insert into guiche (id,numero) values ( default, ?);";
    }

    @Override
    public String obterSentencaUpdate() {
        return "update guiche set numero = ? where id = ?;";
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Guiche e) {
        try {
            if (e.getId() == null || e.getId() == 0) {
                pstmt.setInt(1, e.getNumero());
            } else {
                pstmt.setInt(1, e.getNumero());
                pstmt.setLong(2, e.getId());
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }

    @Override
    public String obterSentencaLocalizarPorId() {
        return "select id,numero from guiche where id=?;";
    }

    @Override
    public Guiche extrairObjeto(ResultSet resultSet) {
        Guiche g = new Guiche();
        try {
            g.setId(resultSet.getLong("id"));
            g.setNumero(resultSet.getInt("numero"));
        } catch (SQLException ex) {
            Logger.getLogger(GuicheDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ex = " + ex);
        }
        return g;
    }

    @Override
    public String obterSentencaLocalizarTodos() {
        return "select id,numero from guiche;";
    }

    @Override
    public List<Guiche> extrairObjetos(ResultSet rs) {
        ArrayList<Guiche> guiches = new ArrayList<>();
        try {
            do {
                guiches.add(extrairObjeto(rs));
            } while (rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(GuicheDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return guiches;
    }

    public Guiche localizarPorNumero(Integer numero) {

        try ( PreparedStatement preparedStatement
                = ConexaoBd
                        .getConexao()
                        .prepareStatement(
                                "select id,numero from guiche where numero = ?")) {
            
                    preparedStatement.setInt(1, numero);
                    
                    ResultSet rs = preparedStatement.executeQuery();
                    
                    if (rs.next()) {
                        return extrairObjeto(rs);
                    }
                } catch (Exception ex) {
                    System.out.println(">> " + ex);
                }
        return null;
    }
}
