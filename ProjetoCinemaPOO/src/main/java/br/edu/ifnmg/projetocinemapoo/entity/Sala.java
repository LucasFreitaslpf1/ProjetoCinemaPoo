package br.edu.ifnmg.projetocinemapoo.entity;

public class Sala extends Entidade {

    private Integer numero;
    private Integer capacidade;
    private Tela tela;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Sala() {
    }

    public Sala(Integer numero, Integer capacidade, Tela tela) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.tela = tela;
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Getters/Setters">
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Tela getTela() {
        return tela;
    }

    public void setTela(Tela tela) {
        this.tela = tela;
    }

    //</editor-fold>

    @Override
    public String toString() {
        return "Sala{" + "numero=" + numero + ", capacidade=" + capacidade + ", tela=" + tela + '}';
    }

  
    

}
