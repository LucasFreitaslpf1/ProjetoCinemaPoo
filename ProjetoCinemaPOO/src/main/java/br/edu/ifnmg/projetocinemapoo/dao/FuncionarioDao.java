/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo.dao;

import br.edu.ifnmg.projetocinemapoo.entity.Funcionario;
import br.edu.ifnmg.projetocinemapoo.enums.TipoFuncionario;
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
    
    public static final String SALT = "1FnM6";

    @Override
    public String obterSentencaInsert() {
        return "insert into funcionario (id,nome,tipofuncionario,senha) "
                + "values ( default, ?, ?, md5(concat('" + SALT + "', ?)));";
    }

    @Override
    public String obterSentencaUpdate() {
        return "update funcionario set nome = ?, tipofuncionario = ?, senha = md5(concat('" + SALT + "', ?)) where id = ?;";
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Funcionario e) {
        try {
            if (e.getId() == null || e.getId() == 0) {
                pstmt.setString(1, e.getNome());
                pstmt.setString(2, e.getTipoFuncionario().getDescription());
                pstmt.setString(3, e.getSenha());
            } else {
                pstmt.setString(1, e.getNome());
                pstmt.setString(2, e.getTipoFuncionario().getDescription());
                pstmt.setString(3, e.getSenha());
                pstmt.setLong(4, e.getId());
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }

    @Override
    public String obterSentencaLocalizarPorId() {
        return "select id,nome,tipofuncionario,senha from funcionario where id=?;";
    }

    @Override
    public Funcionario extrairObjeto(ResultSet resultSet) {
        Funcionario f = new Funcionario();
        try {
            f.setId(resultSet.getLong("id"));
            f.setNome(resultSet.getString("nome"));
            f.setSenha(resultSet.getString("senha"));
            f.setTipoFuncionario(TipoFuncionario.valueOf(resultSet.getString("tipofuncionario")));
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ex = " + ex);
        }
        return f;
    }

    @Override
    public String obterSentencaLocalizarTodos() {
        return "select id,nome,senha from funcionario;";
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

    public Funcionario autenticar(Funcionario usuario) {

        Funcionario resposta = null;

        // Validação de usuario
        try ( PreparedStatement preparedStatement
                = ConexaoBd.getConexao().prepareStatement("select * from funcionario where nome = ? and senha = md5(concat('" + SALT + "', ?));")) {

            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setString(2, usuario.getSenha());

            // Recupera os dados da consulta
            ResultSet resultSet
                    = preparedStatement.executeQuery();
            // Movimenta para o primeiro dado recuperado
            if (resultSet.next()) {

                // Extrai o objeto representado pelo registro recuperado
                return extrairObjeto(resultSet);
            }

        } catch (Exception ex) {
            System.out.println(">> " + ex);
        }

        return resposta;
    }

}
