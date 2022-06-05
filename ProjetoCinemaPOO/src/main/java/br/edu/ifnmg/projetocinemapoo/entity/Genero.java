/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo.entity;

/**
 *
 * @author ThiagoRiquelmo
 */
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

    @Override
    public String toString() {
        return "Genero{" + "nome=" + nome + '}';
    }
    
}