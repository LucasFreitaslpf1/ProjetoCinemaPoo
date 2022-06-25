package br.edu.ifnmg.projetocinemapoo.entity;

public class Ingresso extends Entidade {

    private Boolean meiaEntada;
    private Double preco;
    private Long vendaId;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Ingresso() {
    }

    public Ingresso(Boolean meiaEntada) {
        this.meiaEntada = meiaEntada;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Boolean getMeiaEntada() {
        return meiaEntada;
    }

    public void setMeiaEntada(Boolean meiaEntada) {
        this.meiaEntada = meiaEntada;
    }

    public Double getPreco() {
        return preco;
    }
    
    /* Apenas classe venda pode colocar valor de ingresso, uma vez que
       valor do ingresso depende do valor da Sessão. */ 
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Long getVendaId() {
        return vendaId;
    }

    public void setVendaId(Long vendaId) {
        this.vendaId = vendaId;
    }
    
    //</editor-fold>

    @Override
    public String toString() {
        return "Ingresso{" + "meiaEntada=" + meiaEntada + ", preco=" + preco + '}';
    }

}
