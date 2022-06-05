package br.edu.ifnmg.projetocinemapoo.dao;

import br.edu.ifnmg.projetocinemapoo.entity.Ingresso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IngressoDao extends Dao<Ingresso, Long> {

    @Override
    public String obterSentencaInsert() {
        return "insert into ingresso (id, meiaentrada, preco) values (default, ? , ? ); ";
    }

    @Override
    public String obterSentencaUpdate() {
        return "update ingresso set meiaentrada = ?,preco = ? where id = ?;";
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Ingresso e) {
        try {
            pstmt.setBoolean(1, e.getMeiaEntada());
            pstmt.setFloat(2, e.getPreco());

            if (e.getId() != null && e.getId() != 0) {
                pstmt.setLong(3, e.getId());
            }

        } catch (Exception ex) {
            System.out.println("Exceptoin: " + ex);
        }
    }

    @Override
    public String obterSentencaLocalizarPorId() {
        return "SELECT * FROM ingresso WHERE id = ?";
    }

    @Override
    public Ingresso extrairObjeto(ResultSet resultSet) {
        Ingresso i = new Ingresso();

        try {
            i.setId(resultSet.getLong("id"));
            i.setMeiaEntada(resultSet.getBoolean("meiaentrada"));
            i.setPreco(resultSet.getFloat("preco"));

        } catch (SQLException ex) {
            Logger.getLogger(IngressoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return i;
    }

    @Override
    public String obterSentencaLocalizarTodos() {
        return "select id, meiaentrada, preco from ingresso;";
    }

    @Override
    public List<Ingresso> extrairObjetos(ResultSet rs) {
        
        ArrayList<Ingresso> ingressos = new ArrayList<>();

        try {

            while (rs.next()) {

                ingressos.add(extrairObjeto(rs));
            }

        } catch (SQLException ex) {
            Logger.getLogger(IngressoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ingressos;
    }

}
