/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo.dao;

import br.edu.ifnmg.projetocinemapoo.entity.Classificacao;
import br.edu.ifnmg.projetocinemapoo.entity.Filme;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thiago Riquelmo
 */
public class FilmeDao extends Dao<Filme, Long>{
    
    @Override
    public String obterSentencaInsert() {
        return "insert into filme (nome,duracao,classificacao,generoprincipal_id) values (?,?,?,?);";
    }
    
    @Override
    public String obterSentencaUpdate() {
        return "update filme set nome = ?, duracao = ?, classificacao = ?, generoprincipal_id = ? where id = ?;";
    }
    
    @Override
    public String obterSentencaLocalizarPorId() {
        return "select id, nome, duracao, classificacao, generoprincipal_id from filme where id = ?;";
    }
    
    @Override
    public String obterSentencaLocalizarTodos() {
        return "select id, nome, duracao, classificacao, generoprincipal_id from filme;";
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Filme e) {
        // TODO Montar declaração SQL para "n" parâmetros
        try {
            if (e.getId() == null || e.getId() == 0) {
                pstmt.setString(1, e.getNome());
                pstmt.setInt(2, e.getDuracao());
                pstmt.setString(3, e.getClassificacao());
                pstmt.setLong(4, e.getGeneroPrincipal().getId());

            } else {
                pstmt.setString(1, e.getNome());
                pstmt.setInt(2, e.getDuracao());
                pstmt.setString(3, e.getClassificacao());
                pstmt.setLong(4, e.getGeneroPrincipal().getId());
                pstmt.setLong(5, e.getId());
            }
        } catch (Exception ex) {
            System.out.println("Exceptoin: " + ex);
        }
    }

    @Override
    public Filme extrairObjeto(ResultSet resultSet) {
        Filme filme = new Filme();

        try {
            filme.setId(resultSet.getLong("id"));
            filme.setNome(resultSet.getString("nome"));
            filme.setDuracao(resultSet.getInt("duracao"));
            filme.setClassificacao(Classificacao.valueOf(resultSet.getString("classificacao")));
            filme.setGeneroPrincipal(new GeneroDao().localizarPorId(resultSet.getLong("generoprincipal_id")));

        } catch (SQLException ex) {
            Logger.getLogger(FilmeDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return filme;
    }

    @Override
    public List<Filme> extrairObjetos(ResultSet resultSet) {
        ArrayList<Filme> filmes = new ArrayList<>();

        try {
            do {
                filmes.add(extrairObjeto(resultSet));
            } while (resultSet.next());

        } catch (SQLException ex) {
            Logger.getLogger(FilmeDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return filmes;
    }
    
}
