package com.jeremiahsoe.craftlytics_api.controller;

import com.jeremiahsoe.craftlytics_api.model.BiomeExploration;
import com.jeremiahsoe.craftlytics_api.service.BiomeExplorationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/biomes_explored")
public class BiomeExplorationController {
    @Autowired
    private BiomeExplorationService biomeExplorationService;

    @PostMapping
    public BiomeExploration logBiomeExploration(
            @RequestParam String playerUuid,
            @RequestParam String biomeName,
            @RequestParam String location){
        return biomeExplorationService.logBiomeExploration(playerUuid, biomeName, location);
    }
}
