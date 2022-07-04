package br.edu.ifnmg.projetocinemapoo.entity;

import java.util.List;

public class Venda extends Entidade {

    private Short quantidade;
    private Guiche guiche;
    private Sessao sessao;
    private List<Ingresso> ingressos;
    private Double valorTotal;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Venda() {

        valorTotal = 0.0;
        quantidade = 0;
    }

    public Venda(Guiche guiche, Sessao sessao) {
        this();
        this.guiche = guiche;
        this.sessao = sessao;
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
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

    @Override
    public String toString() {
        return "Venda{" + "quantidade=" + quantidade + ", guiche=" + guiche + ", sessao=" + sessao + ", ingressos=" + ingressos + ", valorTotal=" + valorTotal + '}';
    }

}
