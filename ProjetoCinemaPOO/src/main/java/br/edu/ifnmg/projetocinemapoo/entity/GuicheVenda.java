/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo.entity;

/**
 *
 * @author Lucas
 */
public class GuicheVenda {

    private Long guicheId;
    private Long vendaId;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public GuicheVenda() {
    }

    public GuicheVenda(Long guicheId, Long vendaId) {
        this.guicheId = guicheId;
        this.vendaId = vendaId;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters Setters">
    public Long getGuicheId() {
        return guicheId;
    }

    public void setGuicheId(Long guicheId) {
        this.guicheId = guicheId;
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
        return "GuicheVenda{" + "guicheId=" + guicheId + ", vendaId=" + vendaId + '}';
    }
    
}
