/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo.enums;

/**
 *
 * @author ThiagoRiquelmo
 */
public enum Classificacao {
    LIVRE{

        @Override
        public String getDescription() {
            return "LIVRE";
        }
    },
    _10{

        @Override
        public String getDescription() {
            return "_10";
        }
    },
    _12{

        @Override
        public String getDescription() {
            return "_12";
        }
    },
    _14{

        @Override
        public String getDescription() {
            return "_14";
        }
    },
    _16{

        @Override
        public String getDescription() {
            return "_16";
        }
    },
    _18{

        @Override
        public String getDescription() {
            return "_18";
        }
    };
    
    public abstract String getDescription();
}
