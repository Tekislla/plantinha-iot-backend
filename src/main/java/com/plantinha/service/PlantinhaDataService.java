package com.plantinha.service;

import com.plantinha.dto.PlantinhaDataDTO;
import com.plantinha.entity.PlantinhaData;
import com.plantinha.repository.PlantinhaDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@Service
public class PlantinhaDataService {
    @Autowired
    PlantinhaDataRepository repo;
    private static final String pattern = "dd/MM/yyyy HH:mm:ss";

    public PlantinhaData criaEvento(PlantinhaDataDTO dto) {
        PlantinhaData e = new PlantinhaData();

        TimeZone timeZone = TimeZone.getTimeZone("America/Sao_Paulo");
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        sdf.setTimeZone(timeZone);

        Date dataHoraEvento = new Date();

        e.setEvento(dto.getEvento());
        e.setDataHoraEvento(sdf.format(dataHoraEvento));
        e.setValorTemperatura(dto.getValorTemperatura());
        e.setValorUmidade(dto.getValorUmidade());
        e.setValorLuminosidade(dto.getValorLuminosidade());

        repo.save(e);
        return e;
    }


    public List<PlantinhaData> listAllEventos() {
        List<PlantinhaData> list = (List<PlantinhaData>) repo.findAll();
        Collections.sort(list);
        return list;
    }

    public List<PlantinhaData> listByEvento(String evento) {
        List<PlantinhaData> list = repo.findByEvento(evento);
        Collections.sort(list);
        return list;
    }

}
