/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo.dao;

import br.edu.ifnmg.projetocinemapoo.dao.ConexaoBd;
import br.edu.ifnmg.projetocinemapoo.dao.VendaDao;
import br.edu.ifnmg.projetocinemapoo.entity.GuicheVenda;
import br.edu.ifnmg.projetocinemapoo.entity.Venda;
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
public class GuicheVendaDao {

    public void salvar(GuicheVenda o) {

        GuicheVenda guicheVenda = localizarPorId(o.getGuicheId(), o.getVendaId());

        // Novo registro
        if (guicheVenda == null) {

            // try-with-resources libera recurso ao final do bloco (PreparedStatement)
            try ( PreparedStatement pstmt
                    = ConexaoBd.getConexao().prepareStatement(
                            // Sentença SQL para inserção de registros
                            getDeclaracaoInsert())) {

                // Prepara a declaração com os dados do objeto passado
                pstmt.setLong(1, o.getGuicheId());
                pstmt.setLong(2, o.getVendaId());

                // Executa o comando SQL
                pstmt.executeUpdate();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Boolean excluir(GuicheVenda o) {
        // Recupera a identidade (chave primária composta) 
        // do objeto a ser excluído
        Long guicheId = o.getGuicheId();
        Long vendaId = o.getVendaId();

        // Se há uma identidade válida...
        if (guicheId != null && guicheId != 0
                && vendaId != null && vendaId != 0) {
            // ... tenta preparar uma sentença SQL para a conexão já estabelecida
            try ( PreparedStatement pstmt
                    = ConexaoBd.getConexao().prepareStatement(
                            // Sentença SQL para exclusão de registros
                            getDeclaracaoDelete())) {

                // Prepara a declaração com os dados do objeto passado
                pstmt.setLong(1, o.getGuicheId());
                pstmt.setLong(2, o.getVendaId());

                // Executa o comando SQL
                pstmt.executeUpdate();

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else {
            return false;
        }

        return true;
    }

    public GuicheVenda localizarPorId(Long guicheId, Long vendaId) {
        // Declara referência para reter o objeto a ser recuperado
        GuicheVenda objeto = null;

        // Tenta preparar uma sentença SQL para a conexão já estabelecida
        try ( PreparedStatement pstmt
                = ConexaoBd.getConexao().prepareStatement(
                        // Sentença SQL para busca por chave primária
                        getDeclaracaoSelectPorId())) {

            // Prepara a declaração com os dados do objeto passado
            pstmt.setLong(1, guicheId);
            pstmt.setLong(2, vendaId);

            // Executa o comando SQL
            ResultSet resultSet = pstmt.executeQuery();

            // Se há resultado retornado...
            if (resultSet.next()) {
                // ... extrai objeto do respectivo registro do banco de dados
                objeto = extrairObjeto(resultSet);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Devolve nulo (objeto não encontrado) ou o objeto recuperado
        return objeto;
    }

    public List<Venda> localizarVendasPorGuiche(Venda o) {

        // Declara referência para reter o(s) objeto(s) a ser(em) recuperado(s)
        List<Venda> objetos = new ArrayList<>();

        // Tenta preparar uma sentença SQL para a conexão já estabelecida
        try ( PreparedStatement pstmt
                = ConexaoBd.getConexao().prepareStatement(
                        // Sentença SQL para recuperação de todos os registros
                        getDeclaracaoSelectTodosVendasPorGuiche())) {

            // Prepara a declaração com os dados do objeto passado
            pstmt.setLong(1, o.getId());

            // Executa o comando SQL
            ResultSet resultSet = pstmt.executeQuery();

            //
            // Reaproveita o procedimento de extração de objetos
            // guiche elaborado em GuicheDao
            //
            objetos = new VendaDao().extrairObjetos(resultSet);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Devolve uma lista vazia (nenhum registro encontrado) 
        // ou a relação de objeto(s) recuperado(s)
        return objetos;
    }

    public String getDeclaracaoInsert() {
        return "INSERT INTO guichevenda(guiche_id, venda_id) VALUES (?, ?);";
    }

    public String getDeclaracaoSelectPorId() {
        return "SELECT * FROM guichevenda WHERE guiche_id = ? AND venda_id = ?";
    }

    public String getDeclaracaoSelectTodos() {
        return "SELECT * FROM guichevenda";
    }

    public String getDeclaracaoSelectTodosVendasPorGuiche() {
        return "SELECT v.id, v.codigovenda, v.quantidade, v.sessao_id v.valortotal " // Somente (e tudo) de Guiche
                + "FROM venda v "
                + "INNER JOIN guichevenda gv "
                + "ON gv.id = gv.venda_id "
                + "WHERE gv.guiche_id  = ?;";
    }

    public String getDeclaracaoDelete() {
        return "DELETE FROM guichevenda WHERE guiche_id = ? AND venda_id = ?";
    }

    public GuicheVenda extrairObjeto(ResultSet resultSet) {
        // Cria referência para montagem do guiche-venda
        GuicheVenda guicheVenda = new GuicheVenda();

        // Tenta recuperar dados do registro retornado pelo banco de dados
        // e ajustar o estado do guiche-venda a ser mapeado
        try {
            guicheVenda.setGuicheId(resultSet.getLong("guiche_id"));
            guicheVenda.setVendaId(resultSet.getLong("venda_id"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolve o guiche-venda mapeado
        return guicheVenda;
    }
    
        public List<GuicheVenda> extrairObjetos(ResultSet resultSet) {

        // Cria referência para inserção das guiches-vendas a serem mapeados
        ArrayList<GuicheVenda> guichesVendas = new ArrayList<>();

        // Tenta...
        try {
            // ... enquanto houver registros a serem processados
            while (resultSet.next()) {
                guichesVendas.add(extrairObjeto(resultSet));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GuicheVendaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Devolve a lista de guiches-vendas reconstituídos
        // dos registros do banco de dados
        return guichesVendas;
    }
}
