package br.edu.ifnmg.projetocinemapoo.entity;

import java.time.LocalDateTime;

public class Sessao extends Entidade {

    private LocalDateTime horario;
    private Audio audio;
    private Integer ingressosVendidos;
    private Double valorSessao;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Sessao() {
    }

    public Sessao(LocalDateTime horario, Audio audio, Integer ingressosVendidos, Double valorSessao) {
        this.horario = horario;
        this.audio = audio;
        this.ingressosVendidos = ingressosVendidos;
        this.valorSessao = valorSessao;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public String getAudio() {
        return audio.getDescription();
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public Integer getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(Integer ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }

    public Double getValorSessao() {
        return valorSessao;
    }

    public void setValorSessao(Double valorSessao) {
        this.valorSessao = valorSessao;
    }    
//</editor-fold>

    @Override
    public String toString() {
        return "Sessao{" + "horario=" + horario + ", audio=" + audio + ", ingressosVendidos=" + ingressosVendidos + ", valorSessao=" + valorSessao + '}';
    }

}
