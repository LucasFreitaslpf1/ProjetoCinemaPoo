package br.edu.ifnmg.projetocinemapoo.entity;

public class Genero extends Entidade{
    private String nome;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Genero() {
    }

    public Genero(String nome) {
        this.nome = nome;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //</editor-fold>
    
}