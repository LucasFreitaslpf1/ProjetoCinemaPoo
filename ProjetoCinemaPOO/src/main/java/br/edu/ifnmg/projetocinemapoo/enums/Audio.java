package br.edu.ifnmg.projetocinemapoo.enums;

public enum Audio {
    // LEGENDADO,DUBLADO;
    LEGENDADO {

        @Override
        public String getDescription() {
            return "LEGENDADO";
        }
    },
    DUBLADO {

        @Override
        public String getDescription() {
            return "DUBLADO";
        }
    };

    public abstract String getDescription();
}
