/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo.entity;

/**
 *
 * @author ThiagoRiquelmo
 */
public class Filme extends Entidade{
    private String nome;
    private Integer duracao;
    private Classificacao classificacao;
    private Genero generoPrincipal;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Filme() {
    }

    public Filme(String nome, Integer duracao, Classificacao classificacao, Genero generoPrincipal) {
        this.nome = nome;
        this.duracao = duracao;
        this.classificacao = classificacao;
        this.generoPrincipal = generoPrincipal;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public String getClassificacao() {
        return classificacao.getDescription();
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public Genero getGeneroPrincipal() {
        return generoPrincipal;
    }

    public void setGeneroPrincipal(Genero generoPrincipal) {
        this.generoPrincipal = generoPrincipal;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Filme{" + "nome=" + nome + ", duracao=" + duracao + ", classificacao=" + classificacao + ", generoPrincipal=" + generoPrincipal + '}';
    }
    
}


