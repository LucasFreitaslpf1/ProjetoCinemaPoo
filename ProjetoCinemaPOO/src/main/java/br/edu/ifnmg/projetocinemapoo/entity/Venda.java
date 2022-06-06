package br.edu.ifnmg.projetocinemapoo.entity;

import java.util.ArrayList;
import java.util.List;

public class Venda extends Entidade {

    private Long codigoVenda;
    private Short quantidade;
    private Guiche guiche;
    private Sessao sessao;
    private List<Ingresso> ingressos;
    private Double valorTotal;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Venda() {

        ingressos = new ArrayList();
    }

    public Venda(Long codigoVenda, Short quantidade, Guiche guiche, Sessao sessao, List<Ingresso> ingressos, Double valorTotal) {
        this.codigoVenda = codigoVenda;
        this.quantidade = quantidade;
        this.guiche = guiche;
        this.sessao = sessao;
        this.ingressos = ingressos;
        this.valorTotal = valorTotal;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(Long codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public Short getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Short quantidade) {
        this.quantidade = quantidade;
    }

    public Guiche getGuiche() {
        return guiche;
    }

    public void setGuiche(Guiche guiche) {
        this.guiche = guiche;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    //</editor-fold>

    public void adicionarIngresso(Ingresso ingresso) {
        ingressos.add(ingresso);
    }

    public void removerIngresso(Ingresso ingresso)
            throws RuntimeException {
        if (!ingressos.contains(ingresso)) {
            throw new RuntimeException("Tentativa de remoção de ingresso inexistente");
        }
        ingressos.remove(ingresso);
    }

    @Override
    public String toString() {
        return "Venda{" + "codigoVenda=" + codigoVenda + ", quantidade=" + quantidade + ", valorTotal=" + valorTotal + '}';
    }

    

}
