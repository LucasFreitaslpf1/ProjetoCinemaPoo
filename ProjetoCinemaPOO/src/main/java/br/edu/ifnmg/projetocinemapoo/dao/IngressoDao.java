package br.edu.ifnmg.projetocinemapoo.dao;

import br.edu.ifnmg.projetocinemapoo.entity.Ingresso;
import br.edu.ifnmg.projetocinemapoo.entity.Venda;
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
        return "insert into ingresso (id, meiaentrada, preco, venda_id) values (default, ? , ?, ?); ";
    }

    @Override
    public String obterSentencaUpdate() {
        return "update ingresso set meiaentrada = ?,preco = ?, venda_id = ? where id = ?;";
    }
    
     private String getDeclaracaoSelectIngressosPorVenda() {
        return "SELECT * FROM ingresso WHERE venda_id = ?";
    }
    
    @Override
    public void montarDeclaracao(PreparedStatement pstmt, Ingresso e) {
        try {
            pstmt.setBoolean(1, e.getMeiaEntada());
            pstmt.setDouble(2, e.getPreco());
            pstmt.setLong(3, e.getVendaId());

            if (e.getId() != null && e.getId() != 0) {
                pstmt.setLong(4, e.getId());
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
            i.setPreco(resultSet.getDouble("preco"));
            i.setVendaId(resultSet.getLong("venda_id"));

        } catch (SQLException ex) {
            Logger.getLogger(IngressoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return i;
    }

    @Override
    public String obterSentencaLocalizarTodos() {
        return "select id, meiaentrada, preco, venda_id from ingresso;";
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
    
    public List<Ingresso> localizarIngressosPorVenda(Venda venda) {

        // Declara referência para reter o(s) objeto(s) a ser(em) recuperado(s)
        List<Ingresso> ingressos = new ArrayList<>();

        // Tenta preparar uma sentença SQL para a conexão já estabelecida
        try ( PreparedStatement pstmt
                = ConexaoBd.getConexao().prepareStatement(
                        // Sentença SQL para recuperação de todos os registros
                        getDeclaracaoSelectIngressosPorVenda())) {

            // Prepara a consulta com os parâmetros adequados
            pstmt.setLong(1, venda.getId());

            // Executa o comando SQL
            ResultSet resultSet = pstmt.executeQuery();

            // Extrai objeto(s) do(s) respectivo(s) registro(s) do banco de dados
            ingressos = extrairObjetos(resultSet);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return ingressos;
    }
    
}
