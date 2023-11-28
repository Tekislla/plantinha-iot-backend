package com.plantinha.repository;

import com.plantinha.entity.PlantinhaData;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlantinhaDataRepository extends CrudRepository<PlantinhaData, Long> {
    public List<PlantinhaData> findByEvento(String evento);

}
