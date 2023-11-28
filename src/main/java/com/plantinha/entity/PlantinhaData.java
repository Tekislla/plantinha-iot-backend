package com.plantinha.entity;

import javax.persistence.*;

@Table(name = "plantinha_data")
@Entity
public class PlantinhaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "evento")
    private String evento;

    @Column(name = "data_evento")
    private String dataEvento;

    @Column(name = "valorTemperatura")
    private float valorTemperatura;

    @Column(name = "valorUmidade")
    private float valorUmidade;

    @Column(name = "valorLuminosidade")
    private float valorLuminosidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
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
