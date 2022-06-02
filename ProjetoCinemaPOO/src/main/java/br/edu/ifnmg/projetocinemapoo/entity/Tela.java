package br.edu.ifnmg.projetocinemapoo.entity;

public enum Tela {

    //_2D, _3D;
    _2D {

        @Override
        public String getDescription() {
            return "2D";
        }
    },
    _3D {

        @Override
        public String getDescription() {
            return "3D";
        }
    };

    public abstract String getDescription();

}
