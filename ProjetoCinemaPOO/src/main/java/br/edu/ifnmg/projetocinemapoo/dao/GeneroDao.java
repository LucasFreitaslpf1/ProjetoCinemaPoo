/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo.dao;

import br.edu.ifnmg.projetocinemapoo.entity.Genero;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThiagoRiquelmo
 */
public class GeneroDao extends Dao<Genero, Long>{

    @Override
    public String obterSentencaInsert() {
        return "insert into genero (nome) values (?);";
    }
    
    @Override
    public String obterSentencaUpdate() {
        return "update genero set nome = ? where id = ?;";
    }
    
    @Override
    public String obterSentencaLocalizarPorId() {
        return "select id, nome from genero where id = ?;";
    }
    
    @Override
    public String obterSentencaLocalizarTodos() {
        return "select id, nome from genero;";
    }
    
    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Genero e) {     
        // TODO Montar declaração SQL para "n" parâmetros
        try {
            if (e.getId() == null || e.getId() == 0) {
                pstmt.setString(1, e.getNome());

            } else {
                pstmt.setString(1, e.getNome());
                pstmt.setLong(2, e.getId());
            }
        } catch (Exception ex) {
            System.out.println("Exceptoin: " + ex);
        }

    }
    
    @Override
    public Genero extrairObjeto(ResultSet resultSet) {
        Genero gen = new Genero();

        try {
            gen.setId(resultSet.getLong("id"));
            gen.setNome(resultSet.getString("nome"));

        } catch (SQLException ex) {
            Logger.getLogger(GeneroDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return gen;
    }    

    @Override
    public List<Genero> extrairObjetos(ResultSet resultSet) {
        ArrayList<Genero> generos = new ArrayList<>();

        try {
            do {
                generos.add(extrairObjeto(resultSet));
            } while (resultSet.next());

        } catch (SQLException ex) {
            Logger.getLogger(GeneroDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return generos;
    }  
    
}
