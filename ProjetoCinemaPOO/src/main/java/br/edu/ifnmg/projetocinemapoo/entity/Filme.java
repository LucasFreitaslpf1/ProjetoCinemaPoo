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

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Filme() {
    }

    public Filme(String nome, Integer duracao, Classificacao classificacao) {
        this.nome = nome;
        this.duracao = duracao;
        this.classificacao = classificacao;
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
    //</editor-fold>

    @Override
    public String toString() {
        return "Filme{" + "nome=" + nome + ", duracao=" + duracao + ", classificacao=" + classificacao +'}';
    }
    
}


