/* 
 * Material didático destinado ao curso de 
 * Programação Orientada a Objetos
 * do Bacharelado em Ciência da Computação do IFNMG 
 * - Câmpus Montes Claros.
 *
 * O uso deste material é livre e regido pela licença 
 * Creative Commons como Atribuição-NãoComercial
 * -CompartilhaIgual 4.0 Internacional:
 * http://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package br.edu.ifnmg.projetocinemapoo.entity;

/**
 * Aspectos comuns a todas as entidades gerenciadas pelo sistema.
 *
 * @author Luis Guisso &lt;luis dot guisso at ifnmg dot edu dot br&gt;
 * @version 0.1, 18/04/2022
 */
public abstract class Entidade {

    // Representação da chave primária padrão para a entidade.
    private Long id;
    private Long excluido;

    //<editor-fold defaultstate="collapsed" desc="GS">
    public Entidade() {
    }

    public Entidade(Long id, Long excluido) {
        this.id = id;
        this.excluido = excluido;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="C">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getExcluido() {
        return excluido;
    }

    public void setExcluido(Long excluido) {
        this.excluido = excluido;
    }
    //</editor-fold>
}
