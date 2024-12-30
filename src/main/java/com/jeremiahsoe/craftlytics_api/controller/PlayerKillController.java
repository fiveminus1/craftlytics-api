package com.jeremiahsoe.craftlytics_api.controller;

import com.jeremiahsoe.craftlytics_api.model.PlayerKill;
import com.jeremiahsoe.craftlytics_api.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/player-kills")
public class PlayerKillController {
    @Autowired
    private PlayerService playerService;

    @PostMapping
    public PlayerKill logPlayerKill(
            @RequestParam String playerUuid,
            @RequestParam String killedPlayerUuid){
        return playerService.logPlayerKill(playerUuid, killedPlayerUuid);
    }

}
