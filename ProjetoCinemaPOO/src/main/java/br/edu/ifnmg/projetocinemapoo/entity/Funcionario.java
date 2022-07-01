/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo.entity;

import br.edu.ifnmg.projetocinemapoo.enums.TipoFuncionario;

/**
 *
 * @author Lucas
 */
public class Funcionario extends Entidade {

    private String nome;
    private String senha;
    private TipoFuncionario tipoFuncionario;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Funcionario() {
    }

    public Funcionario(String nome, String senha, TipoFuncionario tipoFuncionario) {
        this.nome = nome;
        this.senha = senha;
        this.tipoFuncionario = tipoFuncionario;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters, Setters">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoFuncionario getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", senha=" + senha + ", tipoFuncionario=" + tipoFuncionario + '}';
    }

}
