package com.jeremiahsoe.craftlyticsapi.controller;

import com.jeremiahsoe.craftlyticsapi.model.Player;
import com.jeremiahsoe.craftlyticsapi.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/players")
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
