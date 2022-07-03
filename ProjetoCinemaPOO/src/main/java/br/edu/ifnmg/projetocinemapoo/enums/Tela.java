package br.edu.ifnmg.projetocinemapoo.enums;

public enum Tela {

    //_2D, _3D;
    _2D {

        @Override
        public String getDescription() {
            return "_2D";
        }
    },
    _3D {

        @Override
        public String getDescription() {
            return "_3D";
        }
    };

    public abstract String getDescription();

}
