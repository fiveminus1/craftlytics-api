package com.jeremiahsoe.craftlytics_api.controller;

import com.jeremiahsoe.craftlytics_api.model.Player;
import com.jeremiahsoe.craftlytics_api.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api/players")
@CrossOrigin(origins="http://localhost:3000")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @PostMapping
    public Player updateOrInsertPlayer(@RequestParam String playerUuid, @RequestParam String playerName){
        return playerService.updateOrInsertPlayer(playerUuid, playerName);
    }

    @GetMapping("/{username}")
    public ResponseEntity<?> getPlayerByUsername(@PathVariable String username){
        Optional<Player> player = playerService.getPlayerByUsername(username);
        if(player.isPresent()){
            return ResponseEntity.ok(player.get());
        }
        else{
            return ResponseEntity.status(404).body("Player not found");
        }
    }

    @GetMapping("/uuid/{uuid}")
    public Player getPlayerByUuid(@PathVariable String uuid){
        return playerService.getPlayerByUuid(uuid);
    }

}
