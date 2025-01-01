package com.jeremiahsoe.craftlytics_api.controller;

import com.jeremiahsoe.craftlytics_api.model.PlayerKill;
import com.jeremiahsoe.craftlytics_api.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/player-kills")
@CrossOrigin(origins="http://localhost:3000")
public class PlayerKillController {
    @Autowired
    private PlayerService playerService;

    @PostMapping
    public PlayerKill logPlayerKill(
            @RequestParam String playerUuid,
            @RequestParam String killedPlayerUuid){
        return playerService.logPlayerKill(playerUuid, killedPlayerUuid);
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<?> getKillsByUuid(@PathVariable String uuid){
        List<PlayerKill> kills = playerService.getKillsByUuid(uuid);
        if(!kills.isEmpty()){
            return ResponseEntity.ok(kills);
        }
        else{
            return ResponseEntity.status(404).body("No kills found for the player");
        }
    }

}
