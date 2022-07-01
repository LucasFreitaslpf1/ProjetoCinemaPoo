package br.edu.ifnmg.projetocinemapoo.dao;

import br.edu.ifnmg.projetocinemapoo.entity.Sala;
import br.edu.ifnmg.projetocinemapoo.entity.Tela;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SalaDao extends Dao<Sala, Long> {

    @Override
    public String obterSentencaInsert() {
        return "insert into sala (id, numero, capacidade, tela) values (default, ? , ? , ?); ";
    }

    @Override
    public String obterSentencaUpdate() {
        return "update sala set numero = ?, capacidade = ?, tela = ? where id = ?;";
    }

    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Sala e) {
        try {

            pstmt.setInt(1, e.getNumero());
            pstmt.setInt(2, e.getCapacidade());
            //pstmt.setObject(3, e.getTela(), java.sql.Types.VARCHAR);
            pstmt.setString(3, e.getTela().getDescription());
            if (e.getId() != null && e.getId() != 0) {
                pstmt.setLong(4, e.getId());
            }

        } catch (SQLException ex) {
            Logger.getLogger(SalaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String obterSentencaLocalizarPorId() {
        return "SELECT * FROM sala WHERE id = ?";
    }

    @Override
    public Sala extrairObjeto(ResultSet resultSet) {
        Sala sala = new Sala();

        try {

            sala.setId(resultSet.getLong("id"));
            sala.setNumero(resultSet.getInt("numero"));
            sala.setCapacidade(resultSet.getInt("capacidade"));
            sala.setTela(Tela.valueOf(resultSet.getString("tela")));

        } catch (SQLException ex) {
            Logger.getLogger(SalaDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ex = " + ex);
        }

        return sala;
    }

    @Override
    public String obterSentencaLocalizarTodos() {
        return "select id, numero, capacidade, tela from sala;";
    }

    @Override
    public List<Sala> extrairObjetos(ResultSet rs) {

        ArrayList<Sala> salas = new ArrayList<>();

        try {

            while (rs.next()) {

                salas.add(extrairObjeto(rs));
            }

        } catch (SQLException ex) {
            Logger.getLogger(SalaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return salas;
    }

}
