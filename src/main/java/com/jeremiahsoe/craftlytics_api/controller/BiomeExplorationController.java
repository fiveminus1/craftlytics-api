package com.jeremiahsoe.craftlytics_api.controller;

import com.jeremiahsoe.craftlytics_api.model.BiomeExploration;
import com.jeremiahsoe.craftlytics_api.service.BiomeExplorationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/biomes-explored")
@CrossOrigin(origins="http://localhost:3000")
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

    @GetMapping("/{uuid}")
    public ResponseEntity<?> getBiomesExploredByUuid(@PathVariable String uuid){
        List<BiomeExploration> biomesExplored = biomeExplorationService.getBiomesExploredByUuid(uuid);
        if(!biomesExplored.isEmpty()){
            return ResponseEntity.ok(biomesExplored);
        }
        else {
            return ResponseEntity.status(404).body("No biomes explored found for the player.");
        }
    }
}
