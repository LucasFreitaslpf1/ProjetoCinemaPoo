/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo.dao;

import br.edu.ifnmg.projetocinemapoo.entity.Funcionario;
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
public class FuncionarioDao extends Dao<Funcionario, Long> {

    @Override
    public String obterSentencaInsert() {
        return "insert into funcionario (nome) values (?);";
    }

    @Override
    public String obterSentencaUpdate() {
        return "update funcionario set nome = ? where id = ?;";
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Funcionario e) {
        try {
            if (e.getId() == null || e.getId() == 0) {
                pstmt.setString(1, e.getNome());
            } else {
                pstmt.setString(1, e.getNome());
                pstmt.setLong(2, e.getId());
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }

    @Override
    public String obterSentencaLocalizarPorId() {
        return "select id,nome from funcionario where id=?;";
    }

    @Override
    public Funcionario extrairObjeto(ResultSet resultSet) {
        Funcionario f = new Funcionario();
        try {
            f.setId(resultSet.getLong("id"));
            f.setNome(resultSet.getString("nome"));
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ex = " + ex);
        }
        return f;
    }

    @Override
    public String obterSentencaLocalizarTodos() {
        return "select id,nome from funcionario;";
    }

    @Override
    public List<Funcionario> extrairObjetos(ResultSet rs) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        try {
            do {
                funcionarios.add(extrairObjeto(rs));
            } while (rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return funcionarios;
    }

}
