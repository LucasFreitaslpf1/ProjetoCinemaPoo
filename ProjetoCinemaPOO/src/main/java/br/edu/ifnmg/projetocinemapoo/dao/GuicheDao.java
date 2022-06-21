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
        return "insert into guiche (id,numero,funcionario_id) values ( default, ? , ? );";
    }

    @Override
    public String obterSentencaUpdate() {
        return "update guiche set numero = ?, funcionario_id = ? where id = ?;";
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Guiche e) {
        try {
            if (e.getId() == null || e.getId() == 0) {
                pstmt.setInt(1, e.getNumero());
                if (e.getFuncionario().getId() == null || e.getFuncionario().getId() == 0) {
                    pstmt.setLong(2, new FuncionarioDao().salvar(e.getFuncionario()));
                } else {
                    pstmt.setLong(2, e.getFuncionario().getId());
                }
            } else {
                pstmt.setInt(1, e.getNumero());
                if (e.getFuncionario().getId() == 0 || e.getFuncionario().getId() == null) {
                    pstmt.setLong(2, new FuncionarioDao().salvar(e.getFuncionario()));
                } else {
                    pstmt.setLong(2, e.getFuncionario().getId());
                }
                pstmt.setLong(3, e.getId());
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }

    @Override
    public String obterSentencaLocalizarPorId() {
        return "select id,numero,funcionario_id from guiche where id=?;";
    }

    @Override
    public Guiche extrairObjeto(ResultSet resultSet) {
        Guiche g = new Guiche();
        try {
            g.setId(resultSet.getLong("id"));
            g.setFuncionario(new FuncionarioDao().
                    localizarPorId(resultSet.getLong("funcionario_id")));
            g.setNumero(resultSet.getInt("numero"));
        } catch (SQLException ex) {
            Logger.getLogger(GuicheDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ex = " + ex);
        }
        return g;
    }

    @Override
    public String obterSentencaLocalizarTodos() {
        return "select id,numero,funcionario_id from guiche;";
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
}
