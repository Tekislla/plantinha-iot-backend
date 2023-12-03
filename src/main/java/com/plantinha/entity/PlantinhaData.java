package com.plantinha.entity;

import javax.persistence.*;

@Table(name = "plantinha_data")
@Entity
public class PlantinhaData implements Comparable<PlantinhaData> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "evento")
    private String evento;

    @Column(name = "data_hora_evento")
    private String dataHoraEvento;

    @Column(name = "valor_temperatura")
    private float valorTemperatura;

    @Column(name = "valor_umidade")
    private float valorUmidade;

    @Column(name = "valor_luminosidade")
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

    public String getDataHoraEvento() {
        return dataHoraEvento;
    }

    public void setDataHoraEvento(String dataHoraEvento) {
        this.dataHoraEvento = dataHoraEvento;
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

    @Override
    public int compareTo(PlantinhaData o) {
        return Long.compare(this.id, o.id);
    }
}
