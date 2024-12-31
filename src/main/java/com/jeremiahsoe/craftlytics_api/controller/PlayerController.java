package com.jeremiahsoe.craftlytics_api.controller;

import com.jeremiahsoe.craftlytics_api.model.Player;
import com.jeremiahsoe.craftlytics_api.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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

    @GetMapping("/{uuid}")
    public Player getPlayerByUuid(@PathVariable String uuid){
        return playerService.getPlayerByUuid(uuid);
    }
}
