package br.edu.ifnmg.projetocinemapoo.entity;

public class Ingresso extends Entidade {

    private Boolean meiaEntada;
    private Float preco;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Ingresso() {
    }

    public Ingresso(Boolean meiaEntada, Float preco) {
        this.meiaEntada = meiaEntada;
        this.preco = preco;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Boolean getMeiaEntada() {
        return meiaEntada;
    }

    public void setMeiaEntada(Boolean meiaEntada) {
        this.meiaEntada = meiaEntada;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Ingresso{" + "meiaEntada=" + meiaEntada + ", preco=" + preco + '}';
    }

}
