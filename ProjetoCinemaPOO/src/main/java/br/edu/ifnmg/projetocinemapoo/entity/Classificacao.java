/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.edu.ifnmg.projetocinemapoo.entity;

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
            return "+10";
        }
    },
    _12{

        @Override
        public String getDescription() {
            return "+12";
        }
    },
    _14{

        @Override
        public String getDescription() {
            return "+14";
        }
    },
    _16{

        @Override
        public String getDescription() {
            return "+16";
        }
    },
    _18{

        @Override
        public String getDescription() {
            return "+18";
        }
    };
    
    public abstract String getDescription();
}
