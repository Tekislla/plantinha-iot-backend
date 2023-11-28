package com.plantinha.service;

import com.plantinha.dto.PlantinhaDataDTO;
import com.plantinha.entity.PlantinhaData;
import com.plantinha.enums.EventoEnum;
import com.plantinha.repository.PlantinhaDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class PlantinhaDataService {
    @Autowired
    PlantinhaDataRepository repo;

    private final String pattern = "dd/MM/yyyy hh:mm:ss";

    public PlantinhaData criaEventoUmidade(PlantinhaDataDTO dto) {
        PlantinhaData e = new PlantinhaData();
        int umidadeMinima = 15;
        int umidadeMaxima = 35;

        if (dto.getValor() < umidadeMinima) {
            e.setEvento(EventoEnum.UMIDADE_BAIXA.name());
        } else if (dto.getValor() > umidadeMaxima) {
            e.setEvento(EventoEnum.UMIDADE_ALTA.name());
        } else {
            e.setEvento(EventoEnum.OK.name());
        }

        Date dataEvento = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        e.setDataEvento(sdf.format(dataEvento));
        e.setValorUmidade(dto.getValor());

        repo.save(e);
        return e;
    }

    public PlantinhaData criaEventoTemperatura(PlantinhaDataDTO dto) {
        PlantinhaData e = new PlantinhaData();
        int temperaturaMinima = 10;
        int temperaturaMaxima = 30;

        if (dto.getValor() < temperaturaMinima) {
            e.setEvento(EventoEnum.TEMPERATURA_BAIXA.name());
        } else if (dto.getValor() > temperaturaMaxima) {
            e.setEvento(EventoEnum.TEMPERATURA_ALTA.name());
        } else {
            e.setEvento(EventoEnum.OK.name());
        }

        Date dataEvento = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        e.setDataEvento(sdf.format(dataEvento));
        e.setValorTemperatura(dto.getValor());

        repo.save(e);
        return e;
    }


    public PlantinhaData criaEventoLuminosidade(PlantinhaDataDTO dto) {
        PlantinhaData e = new PlantinhaData();
        int luminosidadeMinima = 7000;
        int luminosidadeMaxima = 40000;

        if (dto.getValor() < luminosidadeMinima) {
            e.setEvento(EventoEnum.LUMINOSIDADE_BAIXA.name());
        } else if (dto.getValor() > luminosidadeMaxima) {
            e.setEvento(EventoEnum.LUMINOSIDADE_ALTA.name());
        } else {
            e.setEvento(EventoEnum.OK.name());
        }

        Date dataEvento = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        e.setDataEvento(sdf.format(dataEvento));
        e.setValorLuminosidade(dto.getValor());

        repo.save(e);
        return e;
    }

    public List<PlantinhaData> listAllEventos() {
        return (List<PlantinhaData>) repo.findAll();
    }

    public List<PlantinhaData> listByEvento(String evento) {
        return (List<PlantinhaData>) repo.findByEvento(evento);
    }

}
