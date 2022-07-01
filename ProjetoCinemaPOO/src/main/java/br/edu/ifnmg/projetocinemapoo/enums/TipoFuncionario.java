/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo.enums;

/**
 *
 * @author Lucas
 */
public enum TipoFuncionario {
    
    GERENTE{
        @Override
        public String getDescription() {
            return "GERENTE";
        }
    },
    
    CAIXA{
        @Override
        public String getDescription() {
            return "CAIXA";
        }
    };
    
    public abstract String getDescription();
}
