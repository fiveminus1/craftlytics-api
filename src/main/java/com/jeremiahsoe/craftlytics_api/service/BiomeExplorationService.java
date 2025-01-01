package com.jeremiahsoe.craftlytics_api.service;

import com.jeremiahsoe.craftlytics_api.model.BiomeExploration;
import com.jeremiahsoe.craftlytics_api.repository.BiomeExplorationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BiomeExplorationService {
    @Autowired
    private BiomeExplorationRepository biomeExplorationRepository;

    public BiomeExploration logBiomeExploration(String playerUuid, String biomeName, String location){
        BiomeExploration exploration = new BiomeExploration();
        exploration.setPlayerUuid(playerUuid);
        exploration.setBiomeName(biomeName);
        exploration.setLocation(location);
        exploration.setTimestamp(LocalDateTime.now());
        return biomeExplorationRepository.save(exploration);
    }

    public List<BiomeExploration> getBiomesExploredByUuid(String uuid){
        return biomeExplorationRepository.findByPlayerUuid(uuid);
    }
}
