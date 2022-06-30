/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo.dao;

import br.edu.ifnmg.projetocinemapoo.entity.Audio;
import br.edu.ifnmg.projetocinemapoo.entity.Sessao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas
 */
public class SessaoDao extends Dao<Sessao, Long> {

    @Override
    public String obterSentencaInsert() {
        return "insert into sessao(horario,audio,ingressosvendidos,valorsessao,filme_id,sala_id) values ( ?, ?, ?, ?, ?, ?);";
    }

    @Override
    public String obterSentencaUpdate() {
        return "update sessao set horario = ?, audio = ?, ingressosvendidos = ?, valorsessao = ?, filme_id = ?,"
                + "sala_id = ? where id = ?;";
    }

    @Override
    public String obterSentencaLocalizarPorId() {
        return "select id,horario,audio,ingressosvendidos,valorsessao,filme_id,sala_id from sessao where id = ?;";
    }

    @Override
    public Sessao extrairObjeto(ResultSet resultSet) {
        Sessao s = new Sessao();

        try {
            s.setId(resultSet.getLong("id"));
            s.setHorario(resultSet.getObject("horario", LocalDateTime.class));
            s.setAudio(Audio.valueOf(resultSet.getString("audio")));
            s.setIngressosVendidos(resultSet.getInt("ingressosvendidos"));
            s.setValorSessao(resultSet.getDouble("valorsessao"));
            s.setFilme(new FilmeDao().localizarPorId(resultSet.getLong("filme_id")));
            s.setSala(new SalaDao().localizarPorId(resultSet.getLong("sala_id")));
        } catch (SQLException ex) {
            Logger.getLogger(SessaoDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ex = " + ex);
        }
        return s;
    }

    @Override
    public String obterSentencaLocalizarTodos() {
        return "select id,horario,audio,ingressosvendidos,valorsessao,filme_id,sala_id from sessao;";
    }

    @Override
    public List extrairObjetos(ResultSet rs) {
        ArrayList<Sessao> sessoes = new ArrayList<>();
        try {
            while (rs.next()) {
                sessoes.add(extrairObjeto(rs));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SessaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return sessoes;
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Sessao e) {
        try {
            if (e.getId() == null || e.getId() == 0) {
                pstmt.setString(1, e.getHorario().toString());
                pstmt.setString(2, e.getAudio().getDescription());
                pstmt.setInt(3, e.getIngressosVendidos());
                pstmt.setDouble(4, e.getValorSessao());
                pstmt.setLong(5, e.getFilme().getId());
                pstmt.setLong(6, e.getSala().getId());
            } else {
                pstmt.setString(1, e.getHorario().toString());
                pstmt.setString(2, e.getAudio().getDescription());
                pstmt.setInt(3, e.getIngressosVendidos());
                pstmt.setDouble(4, e.getValorSessao());
                pstmt.setLong(5, e.getFilme().getId());
                pstmt.setLong(6, e.getSala().getId());
                pstmt.setLong(7, e.getId());
            }
        } catch (Exception ex) {
            System.out.println("Exceptoin: " + ex);
        }
    }
}
