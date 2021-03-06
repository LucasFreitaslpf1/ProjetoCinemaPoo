/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo.entity;

import java.util.List;

/**
 *
 * @author Lucas
 */
public class Guiche extends Entidade {

    private Integer numero;
    List<Venda> vendas;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Guiche() {
    }

    public Guiche(Integer numero) {
        this.numero = numero;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters Setters">
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Guiche " + numero;
    }
}
