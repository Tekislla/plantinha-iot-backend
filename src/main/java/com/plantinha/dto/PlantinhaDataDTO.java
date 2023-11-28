package com.plantinha.dto;

public class PlantinhaDataDTO {
    private String evento;

    private float valorTemperatura;

    private float valorUmidade;

    private float valorLuminosidade;

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public float getValorTemperatura() {
        return valorTemperatura;
    }

    public void setValorTemperatura(float valorTemperatura) {
        this.valorTemperatura = valorTemperatura;
    }

    public float getValorUmidade() {
        return valorUmidade;
    }

    public void setValorUmidade(float valorUmidade) {
        this.valorUmidade = valorUmidade;
    }

    public float getValorLuminosidade() {
        return valorLuminosidade;
    }

    public void setValorLuminosidade(float valorLuminosidade) {
        this.valorLuminosidade = valorLuminosidade;
    }
}